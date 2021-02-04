package com.czw;

/**
 * 前端控制器类
 */
public class FontController {
    private Dispatcher dispatcher;

    public FontController() {
        this.dispatcher = new Dispatcher();
    }

    private boolean isAuthentic(){
        System.out.println("认证成功");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("访问路径:"+request);
    }

    public void dispatchRequest(String request){
        trackRequest(request);
        if (isAuthentic()){
            dispatcher.dispatch(request);
        }
    }
}
