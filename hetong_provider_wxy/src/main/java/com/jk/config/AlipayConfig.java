package com.jk.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092600598276";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCOauceIliR4MDmpQzHKMXBOPaTaGAbRYqkrUKS0eiOg3j2Rj9u5hO5kl7h66innNdE2HbrzcQICncbt2CNSEeNOAWui7mu0BcM9svLjFO48qsyzIq6rpDrA9v24ITMDX2+tFOkCHvygs9crYCEkDBniIqr75bS+YOJtSzwu1EMZ5/RZuJ3UIC6TVTcxX8JisYsR5KbbJ0gGcuX1TT9U/4zHAa3LXvpZb1BG9tBYWfv6RJX2t5YNeE8Dj/sdZStyJQjIsHd7Y9j5Os/JBLwNhpPFlGhrj/sB+ENRJ0g4Us1y5DB5Snxhe+z/LeEYO17I5T0uCiydMM5rCwhsittpryxAgMBAAECggEAc7VLPWJuT2cpkrq6XP01Xj1nqG/+1Wl0sULLefntVgxfNMfyNanckMLpL+iFSFjXVWoBhKfTAy1thClC2sbEy2mexCdlnzAV6kSBY0kJpJQUn9srQ20c9LRX/IaBnj+/0Dc2VWlHOssoqoWUix+TFCsNb4/jHFn4kuOONbAas1Yjv5jOxHnhlPwQ3WKrrRYJ+IA7uLD6lN5K27sMPeCtQh0F23OBhAlrp/g+iFajJHkEDO7h6YpsJiPYpKASp83jLjuT/mvxVD98IWoH1aB4K4nFQ04Fg9Ibfozaj49GMlZ/UPaiMM890qhIMmJwqdohfZ8gkmL9hlJw5J6VKkX8GQKBgQD7CZ9W9Cqjn+bnTk0cS4e3CdeTQSg2/zGVFpLbOo9miS3MMsHEDoFBqvk4TzG7ksRpFO6/eqxG/p6TOgROzvywea+Njan14KbPUqgmj6FIPXKTutTszRTCBYupAQzLvi/nNP+EeBBppQtT/fZilA+pC0LDRFhuyzGL1IJLsJyE0wKBgQCRO5uqpFQnUqndKNWEyvJNrDh0st93SKUOz55L6OFd7VN0JGQxq2VV0Zl8FgS7W+vW1x2gwzBSYPneSvRR3Jn4H6cZdO3gYTpRk0csy3fvlGAmHK5qUJj8i4EtTC2+KetKveFBjOBBYhlxoM7vgE0IWM5SWtVMeRhPF2ieFm6V6wKBgQDVbB/YSCs8AsTHH621AY23EpoBKiLrZtgbfR6LXWTu8m9KLFjJut8vGhFZSxLn+mYbRF2Z0sxGa1AbsPZaneT8j+etO6QkUsLefdJRPkkK5prTd8JwNAaS0S4kF61uRhnpwgf98ilZ96QC22Wt91y9BcLTyfY4820DCT9g5BydWwKBgEKYJZoKffgGBJO/nKCmepK5LK3+M0+8BMuU0g4Wu/hY0ZKI+VR5Nh8y3AE1C3hp/utlelV0Cx1LEGgo0H0U/Zjz0qhuoIDptFchhFp69gTqcWgocKWZTX1H7rS5oKP5DsYX6UkoctAoTmh3B0x09V2lcv36XqIRSN9DaZpLyOt/AoGAAR07/m7Wimuk266ELYPcgXDnHko+N9fKyYctTRUxoUeJuN6MBA/OiGzS5HuLKl4CkzeEfHQGPdsmVOjZhl+dliSQHutYxUThKKrBDILeiykxKOWbPkyC8HZtrjR4JO/NpOait36+zXETAanu55XvFkQwBTH61rusKl0mAIMqBv8=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjmrnHiJYkeDA5qUMxyjFwTj2k2hgG0WKpK1CktHojoN49kY/buYTuZJe4euop5zXRNh2683ECAp3G7dgjUhHjTgFrou5rtAXDPbLy4xTuPKrMsyKuq6Q6wPb9uCEzA19vrRTpAh78oLPXK2AhJAwZ4iKq++W0vmDibUs8LtRDGef0Wbid1CAuk1U3MV/CYrGLEeSm2ydIBnLl9U0/VP+MxwGty176WW9QRvbQWFn7+kSV9reWDXhPA4/7HWUrciUIyLB3e2PY+TrPyQS8DYaTxZRoa4/7AfhDUSdIOFLNcuQweUp8YXvs/y3hGDteyOU9LgosnTDOawsIbIrbaa8sQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://kyd.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://192.168.1.151:8083/toqueryll";

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
