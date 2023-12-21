package com.yi.Thread.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习Thread,实现多线程同步下载图片
public class TestThread2 extends Thread {
    private String url; //网络图片地址
    private String name; //保存的文件名

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为:" + name);
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://img2.baidu.com/it/u=3202947311,1179654885&fm=253&app=138&size=w931&n=0&f=JPEG&fmt=auto?sec=1679158800&t=2c3b786965e9b4f3206ab3256fb0f2dc", "1.jpg");
        TestThread2 t2 = new TestThread2("https://img1.baidu.com/it/u=413643897,2296924942&fm=253&app=138&size=w931&n=0&f=JPEG&fmt=auto?sec=1679158800&t=1b38fcf7c11366820e0821c294acd8ad", "2.jpg");
        TestThread2 t3 = new TestThread2("https://img0.baidu.com/it/u=981218435,2998857702&fm=253&app=120&size=w931&n=0&f=JPEG&fmt=auto?sec=1679158800&t=86d6a35be0843e77cba483de7a3194ac", "3.jpg");
        t1.start();
        t2.start();
        t3.start();
    }

    //下载器
    class WebDownloader {
        //下载方法
        public void downloader(String url, String name) {
            try {
                FileUtils.copyURLToFile(new URL(url), new File(name));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IO异常,downloader方法出现异常");
            }
        }
    }
}
