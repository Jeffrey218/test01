public class Converter {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
//        String result = Html2pdfUtil.parseHtml2Pdf("https://www.baidu.com");
        String result = Html2pdfUtil.parseHtml2Pdf("/Users/jeffrey/Library/Mobile Documents/com~apple~CloudDocs/Work/03-Program/01-Private/01-JAVA/Tools/Html2JavaTool/src/a.html");
        long all = System.currentTimeMillis()- start;
        System.out.println("pdf生成地址:"+result+",用时:"+all/1000+"秒");
    }
}