package com.example.calculator_try1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextUtils;//TextUtils类处理字符串

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button []num=new Button[10];
    Button spot,mul,div,plus,min,cls,del,equal;
    EditText result;
    boolean flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化对象
        num[0]=findViewById(R.id.zero);
        num[1]=findViewById(R.id.one);
        num[2]=findViewById(R.id.two);
        num[3]=findViewById(R.id.three);
        num[4]=findViewById(R.id.four);
        num[5]=findViewById(R.id.five);
       num[6]=findViewById(R.id.six);
        num[7]=findViewById(R.id.seven);
       num[8]=findViewById(R.id.eight);
        num[9]=findViewById(R.id.nine);
        spot=findViewById(R.id.spot);
        plus=findViewById(R.id.plus);
        min=findViewById(R.id.min);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        cls=findViewById(R.id.cls);
        del=findViewById(R.id.del);
        equal=findViewById(R.id.equal);
        result=findViewById(R.id.result);

        //给按钮设置点击事件
        for(int i=0;i<10;i++)
            num[i].setOnClickListener(this);
        spot.setOnClickListener(this);
        plus.setOnClickListener(this);
        min.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        cls.setOnClickListener(this);
        del.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String str=result.getText().toString();//获取文本框中的文本内容
        switch (v.getId()){
            case   R.id.zero:
            case   R.id.one:
            case   R.id.two:
            case   R.id.three:
            case   R.id.four:
            case   R.id.five:
            case   R.id.six:
            case   R.id.seven:
            case   R.id.eight:
            case   R.id.nine:
            case   R.id.spot:
                if(flag){
                    flag=false;
                    str="";
                    result.setText("");
                }
                result.setText(str+((Button)v).getText());
                break;
            case R.id.plus:
            case R.id.min:
            case R.id.mul:
            case R.id.div:
                if(flag){
                    flag=false;
                    str="";
                    result.setText("");
                }
                if(str.contains("+")||str.contains("-")||str.contains("×")||str.contains("÷")) {
                    str=str.substring(0,str.indexOf(" "));
                }
                result.setText(str+" "+((Button)v).getText()+" ");
                break;
            case R.id.cls:
                if(flag)
                    flag=false;
                str="";
                result.setText("");
                break;
            //清除按钮，若当前文本编辑框内容为空，点击一次则删除一个字符串
            case R.id.del:
                if (TextUtils.isEmpty(result.getText())) {
                    return;
                }
                flag = false;
                result.setText(str.substring(0, str.length() - 1).length() > 0 ? str.substring(0, str.length() - 1) : "0");
                break;
            case R.id.equal: //单独运算最后结果
                getResult();
                break;
        }
    }
    private void getResult() {
        String exp=result.getText().toString();
        if(exp==null||exp.equals("")) return ;
        //因为没有运算符所以不用运算
        if(!exp.contains(" ")){
            return ;
        }
        if(flag){
            flag=false;
            return;
        }
        flag=true;
        //截取运算符前面的字符串
        String s1=exp.substring(0,exp.indexOf(" "));
        //截取的运算符
        String op=exp.substring(exp.indexOf(" ")+1,exp.indexOf(" ")+2);
//截取运算符后面的字符串
        String s2=exp.substring(exp.indexOf(" ")+3);
        double cnt=0;
        if(!s1.equals("")&&!s2.equals("")){
            double d1=Double.parseDouble(s1);
            double d2=Double.parseDouble(s2);
            if(op.equals("+")){
                cnt=d1+d2;
            }
            if(op.equals("-")){
                cnt=d1-d2;
            }
            if(op.equals("×")){
                cnt=d1*d2;
            }
            if(op.equals("÷")){
                if(d2==0) cnt=0;
                else cnt=d1/d2;
            }
            if(!s1.contains(".")&&!s2.contains(".")&&!op.equals("÷")) {
                int res = (int) cnt;
                result.setText(res+"");
            }else {
                result.setText(cnt+"");}
        }
        //如果s1不是空    s2是空  就执行下一步
        else if(!s1.equals("")&&s2.equals("")){
            double d1=Double.parseDouble(s1);
            if(op.equals("+")){
                cnt=d1;
            }
            if(op.equals("-")){
                cnt=d1;
            }
            if(op.equals("×")){
                cnt=0;
            }
            if(op.equals("÷")){
                cnt=0;
            }
            if(!s1.contains(".")) {
                int res = (int) cnt;
                result.setText(res+"");
            }else {
                result.setText(cnt+"");}
        }
        //如果s1是空    s2不是空  就执行下一步
        else if(s1.equals("")&&!s2.equals("")){
            double d2=Double.parseDouble(s2);
            if(op.equals("+")){
                cnt=d2;
            }
            if(op.equals("-")){
                cnt=0-d2;
            }
            if(op.equals("×")){
                cnt=0;
            }
            if(op.equals("÷")){
                cnt=0;
            }
            if(!s2.contains(".")) {
                int res = (int) cnt;
                result.setText(res+"");
            }else {
                result.setText(cnt+"");}
        }
        else {
            result.setText("");
        }
    }


}
