import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @Author MisakiMikoto
 * @Date 2023/5/5 20:08
 */
public class WordCount {
    public static void main(String[] args) throws Exception {
        String path = "D:\\project\\WordCount\\test.txt";

        int countChar = 0;
        int countWord = 0;

        InputStreamReader in = new InputStreamReader(new FileInputStream(path));
        //用来读取文件中的数据
        BufferedReader br = new BufferedReader(in);
        while(br.read()!=-1)
        {

            String s = br.readLine();
            countChar += s.length();
            String[] s1 = s.split(" ");
            for (String s2 : s1) {
                String[] s3 = s2.split(",");
                countWord += s3.length;
            }
        }
        //关闭文件
        in.close();
        br.close();
        System.out.println("字符数：" + countChar);
        System.out.println("单词数：" + countWord);
    }
}