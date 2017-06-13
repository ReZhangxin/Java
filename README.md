# Java大陆
public class Char01 {
    public static void main(String [] args){
    
        // 什么字符集 通常意义来说就是单个字符 字符必须以单引号引起来 ‘ ’ Java 语言是16位Unicode编码方式
        
        //            很早之前是8位  char a = 'A';A - Z ; a - z ; 0 -9 空格 回车 占一个字符 汉语 ’ 我 ‘ 占两个字符
        
        //int num = 10; 计算机无法保存 电影 音乐 图片 只能保存二进制  这些只能先转成二进制 然后再保存
        
        // char b = '我‘;
        
        // char int string 的关系
        
        char a ='0';//48
        
        char b = '1';//49
        
        System.out.println(a+b);//char 和int 之间可以互相转换的 ascii码表值
        
        // 必须要记住的 0 = 48    A = 65    a = 97
        
        //低的数据类型转高的可以接住 ====>自动类型转换
        
        int num = a;
        
        System.out.println(num);
        
        //高转低 ====>强制类型转换得到ascii码值
        
        int k = 49;
        
        char kk =(char)k;
        
        System.out.println(kk);//1
        
        //char 和string有什么关系
        
        //基础数据类型是没有字符串的: byte short int long char float double boolean
        
        char wo = '我';
        char ai = '爱';
        char ni = '你';
        System.out.println(wo + ai + ni);//..尼玛！！！74658是什么鬼
        
        //所以要引进字符串来弥补单字符的问题
        
        // 字符和字符串 
        
        //     字符串String(S大写)属于引用数据类型，它是一个类
        
        //     类只有三种东西 : 方法  属性  代码块
        
        //     类中的方法和属性都是提供给我们调用者使用的
        
        String str = "我爱你";
        
        log(str);//我爱你 调用方法的过程其实就告诉jvm(java虚拟机)中去寻找有没有这个方法 如果有
        
                    //    就通知cpu去执行方法里面的代码    
    }
    /**
     * 封装
     * @param info
     */
     public static void log(Object info){
             System.out.println(info);
         }
}

