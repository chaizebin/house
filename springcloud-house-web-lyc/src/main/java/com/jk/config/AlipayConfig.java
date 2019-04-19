package com.jk.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092700605115";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDBYEsh5+Ie2gIAE28JFCPKiVIvDBjyEtlHonFIvsRPibL20Ip0Syk05oocut3Gt9ixJK/ixMIcjMeWMzNcf2URlmPTW9kYgAnXFGFfZMIiLWyNGbEUII/ryvEsDQbpIRNcZSQxdOYxn/jlyIhgj83pdq9QNGTWa3sUjiQ249VOdVl8Ogdj94z+6CWGVJr10zBx3zGDhJI+r8Xe4cQewOg2CpfNMzDEkxm/E5rUumAqaOOVF+zuK3UJhZdpOP2BAhmxpzGWXId84ZvlMH+geXh07gdtA3ziPYwKIxkGc28cyiq+tllVAvzRFpRj8X4iJ4G4Ps0OIBo0LyUXPVqvlDGtAgMBAAECggEBALGJf9FEPHUIwHdjYDjclbOYeayaFbkCFxxOhmU8R62ihX1Wnxb//ngEBN81rPGJztdsEFNJQ9HEamV64nfUumz4PvRIyjtVKjOeEXvsXNPWEmhFIy+QabIY420HFMYqyMS2UxFY+xKqhXApuRO2U105yuD/CWlWymxnx9XhPPBG8bNn4L7w1I+9JAC5O/yk8Q5oilcqe+F28UB77bq2niUIVenDTNfhb1y7RyE6R7iXFbKudM8SpOWPAHYrUvM8YT5zB3Fz5YS401vGkZ4KqFxxuvkgHzMvEGGNQKuPN1ncwX9GjuUEWh0rJoc6OuIb+SR6mUiw8DjvwymwVRkrTv0CgYEA7FOkXGAvsLt4tPgvpgyDy15CzAqAuVghujj6ClXFwR4HeWcP4xk2gYGw0UfnRaHwjL3vhPm0dPJSqT0/PQtrszE2L+YSod2pkba10W1zF74hMOF3JW7QnnroVWzHUsfMrzA9/08bq62/4X3vfk6NlqC7brNTP3IVPUcow3J6WU8CgYEA0XlU8N5xg4ROxw7KzRrmFY4a3i3nUtx+SHm3HF4bMOpDh9aN4XAgd2sgEOLenN8gQwXstfZZBaEdaykuYbfJ+T8XtJztrC5cqwGJjZwvzc2+yY5hpPymkWixM2JlXTuK3lQvW4s10uQQ76L/YdlIJ69jsHBlYqC14+jLNPhrjkMCgYALZvW1J0blxgXK5XaXEl+BfmjGo3MWfjQSYhFeUkkaSjKeHuTbVioVEYbQciGscGXExJ070zhrtA1c8QGOFnD50lQE95rKiIFX8HLRSfCVoqzDSP2QpsoV+2QeSwNK8Szk/vTezphNLjLl1Eer1mpqbBLfAnPvybdQn5BN7cYNbQKBgGoASCeLqU2wSl0Y8y9PiVcnDhmYiRK5WX47eZn1VTUvlvTKcgm+v+8uWo+w/o3Lq3u/J8X835elrElqEXqJkr96Wfif4PXckDBJGt56RwaSMxWz412mLHQw0lr6U+kWFHPljgF5NMd/ecKKbUmKtqS+cGf8uJFsWh720r3/aA4ZAoGAO9+unl+MZc4zuV934DxVPWBE3iNC4YVI74v+VZAYBYh/Xol0qFmEAlMJuZ2q1ueUFb0gcIIvb18ZHnJawahyNQ2HOhbgX1TKGDqMuyGhjuVRYV9llZT0cNFrU2Shci89hmIYLKwiJRjyO+KBkPZGnCjCjw23y2GokfzL/acMiKs=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwWBLIefiHtoCABNvCRQjyolSLwwY8hLZR6JxSL7ET4my9tCKdEspNOaKHLrdxrfYsSSv4sTCHIzHljMzXH9lEZZj01vZGIAJ1xRhX2TCIi1sjRmxFCCP68rxLA0G6SETXGUkMXTmMZ/45ciIYI/N6XavUDRk1mt7FI4kNuPVTnVZfDoHY/eM/uglhlSa9dMwcd8xg4SSPq/F3uHEHsDoNgqXzTMwxJMZvxOa1LpgKmjjlRfs7it1CYWXaTj9gQIZsacxllyHfOGb5TB/oHl4dO4HbQN84j2MCiMZBnNvHMoqvrZZVQL80RaUY/F+IieBuD7NDiAaNC8lFz1ar5QxrQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://kyd.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://kyd.free.idcfengye.com/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
