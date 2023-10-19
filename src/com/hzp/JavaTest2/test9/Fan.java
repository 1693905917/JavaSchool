package com.hzp.JavaTest2.test9;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test9
 * @Author: ASUS
 * @CreateTime: 2023-10-19  16:06
 * @Description: TODO
 * @Version: 1.0
 */
public class Fan {
    private String brand;
    private String status;
    private int speed;

    public Fan() {
    }

    public Fan(String brand, String status, int speed) {
        this.brand = brand;
        this.status = status;
        this.speed = speed;
    }

    public Fan(Fan fan) {
        fan.brand="格力";
        fan.status="stop";
        fan.speed=0;
    }

    public void getFanStatusAndSpeed(){
        System.out.println("当风扇状态:"+status+" 速度:"+speed);
    }

    public void addSpeed(){
        if(this.speed>=3){
            System.out.println("警告不能再继续加速！！");
            return;
        }else{
            this.speed++;
        }
    }
    public void reduceSpeed(){
        if(this.speed<=0){
            System.out.println("警告不能再继续减速！！");
            return;
        }else{
            this.speed--;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStatus() {
        System.out.println("电风扇获取开关状态:"+status );
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println("电风扇切换开关状态:"+this.status );
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
