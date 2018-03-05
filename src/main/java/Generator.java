import cn.org.rapid_framework.generator.GeneratorFacade;

public class Generator {

    public static void main(String[] args) {
        GeneratorFacade g = new GeneratorFacade();

        try {
            g.deleteOutRootDir();
            // 删除生成器的输出目录
            // g.generateByTable("alarm_deal_team");
            // //通过数据库表生成文件,template为模板的根目录
            g.generateByAllTable(); // 自动搜索数据库中的所有表并生成文件,template为模板的根目录
            // g.generateByClass(Blog.class,"template_clazz");
            // g.deleteByTable("table_name", "template"); //删除生成的文件
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
