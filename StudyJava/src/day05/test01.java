package day05;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class test01 {
    /**
     * 写内容到文件
     *
     * @throws IOException
     */
    public void test1() throws IOException {
        OutputStream outputStream = new FileOutputStream("text.txt");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append("hello io ").append(i).append("\n");
        }
        String data = stringBuilder.toString();
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        try {
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            outputStream.close();
        }
    }

    /**
     * 读取文件内容（固定长度）
     *
     * @throws IOException
     */
    public void test2() throws IOException {
        InputStream inputStream = new FileInputStream("text.txt");
        byte[] buf = new byte[1024];
        try {
            int byteRead = inputStream.read(buf);
            String data = new String(buf, 0, byteRead, StandardCharsets.UTF_8);
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }
    }

    /**
     * 读取所有内容
     */

    public void test3() throws Exception {
        InputStream inputStream = new FileInputStream("text.txt");
        byte[] buf = new byte[1024];
        int byteRead = -1;
        while ((byteRead = inputStream.read(buf)) != -1) {
            String data = new String(buf, 0, byteRead, StandardCharsets.UTF_8);
            System.out.println(data);
        }
    }

    /*
     * 保存对象
     *
     * @throws FileNotFoundException

    public void test4() throws Exception {
        List<StudentPO> studentList = Arrays.asList(
                new StudentPO("小红", 16, 0),
                new StudentPO("小兰", 17, 1),
                new StudentPO("小黑", 22, 1)
        );
        DataOutput dataOutput = new DataOutputStream(new FileOutputStream("student.txt"));
        for (StudentPO s : studentList) {
            dataOutput.writeUTF(s.getName());
            dataOutput.writeInt(s.getAge());
            dataOutput.writeInt(s.getSex());
        }
    }
     */

    /*
     * 读取对象(文件流格式)

    public void test5() throws Exception {
        DataInput input = new DataInputStream(new FileInputStream("student.txt"));
        List<StudentPO> studentList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            studentList.add(new StudentPO(input.readUTF(), input.readInt(), input.readInt()));
        }
        studentList.forEach(System.out::println);
    }
    */

    /**
     * 使用writer
     */

    public void test6() throws Exception {
        Writer writer = new OutputStreamWriter(new FileOutputStream("student.txt"), StandardCharsets.UTF_8);
        String data = "hello io 试试";
        try {
            writer.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }

    /**
     * 使用reader
     */

    public void test7() throws Exception {
        Reader reader = new InputStreamReader(new FileInputStream("student.txt"), StandardCharsets.UTF_8);
        try {
            char[] cbuf = new char[1024];
            int chatsRead = reader.read(cbuf);
            System.out.println(new String(cbuf, 0, chatsRead));
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }


    /**
     * fileWriter使用
     *
     * @throws Exception
     */

    public void test8() throws Exception {
        Writer writer = new FileWriter("student.txt");
        try {
            writer.write("writer is ok a");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }


        Reader reader = new FileReader(new File("student.txt"));
        try {
            char[] chars = new char[1024];
            int read = reader.read(chars);
            System.out.println(new String(chars));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }


    /**
     * 使用 fileReader
     *
     * @throws Exception
     */

    public void test9() throws Exception {
        Reader reader = new FileReader(new File("student.txt"));
        try {
            char[] chars = new char[1024];
            int read = reader.read(chars);
            System.out.println(new String(chars));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }



    /**
     * 使用bufferWriter
     *
     * @throws Exception
     */
    public void test10() throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"));
        try {
            writer.write("你好，" + "hhhh 哈哈哈\n guguhhhh ");
            writer.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }

        BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
        try {
            String s = null;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }


}

