const base = {
    get() {
        return {
            url : "http://localhost:8080/mengchongyijia/",
            name: "mengchongyijia",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/mengchongyijia/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "萌宠宜家商城系统"
        } 
    }
}
export default base
