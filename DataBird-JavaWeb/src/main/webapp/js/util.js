/**
 * Created by coolfy on 2016/10/30.
 */


/*添加二级城市下拉联动*/

var province=["北京","上海","重庆","天津","河北","山西","辽宁","吉林","黑龙江","江苏","浙江","安徽","福建","江西","山东","河南","湖北","湖南","广东","海南",
              "四川","贵州","云南","陕西","甘肃","青海","内蒙古","广西","西藏","宁夏","新疆","香港","澳门","台湾"];



var citys=[["东城","西城","崇文","宣武","朝阳","丰台","石景山","海淀","门头沟","房山","通州","顺义","昌平","大兴","平谷","怀柔","延庆"],
           ["黄浦","卢湾","徐汇","长宁","静安","普陀","闸北","虹口","杨浦","闵行","宝山","嘉定","浦东","金山","松江","青浦","南汇","奉贤","崇明"],
           ["渝中","大渡口","江北","沙坪坝","九龙坡","南岸","北碚","万盛","双挢","渝北","巴南","黔江","长寿"],
           ["和平","东丽","河东","西青","河西","津南","南开","北辰","河北","武清","红挢","塘沽","汉沽","大港","宁河","静海","宝坻","蓟县"],
           ['石家庄', '张家口', '承德', '秦皇岛', '唐山', '廊坊', '保定', '沧州', '衡水', '邢台', '邯郸'],
           ['太原', '大同', '朔州', '阳泉', '长治', '晋城', '忻州', '吕梁', '晋中', '临汾', '运城'],
           ['沈阳', '朝阳', '阜新', '铁岭', '抚顺', '本溪', '辽阳', '鞍山', '丹东', '大连', '营口', '盘锦', '锦州', '葫芦岛'],
           ['长春', '白城', '松原', '吉林', '四平', '辽源', '通化', '白山', '延边'],
           ['哈尔滨', '齐齐哈尔', '黑河', '大庆', '伊春', '鹤岗', '佳木斯', '双鸭山', '七台河', '鸡西', '牡丹江', '绥化', '大兴安'],
           ['南京', '徐州', '连云港', '宿迁', '淮阴', '盐城', '扬州', '泰州', '南通', '镇江', '常州', '无锡', '苏州'],
           ['杭州', '湖州', '嘉兴', '舟山', '宁波', '绍兴', '金华', '台州', '温州', '丽水'],
           ['合肥', '宿州', '淮北', '阜阳', '蚌埠', '淮南', '滁州', '马鞍山', '芜湖', '铜陵', '安庆', '黄山', '六安', '巢湖', '池州', '宣城'],
           ['福州', '南平', '三明', '莆田', '泉州', '厦门', '漳州', '龙岩', '宁德'],
           ['南昌', '九江', '景德镇', '鹰潭', '新余', '萍乡', '赣州', '上饶', '抚州', '宜春', '吉安'],
           ['济南', '聊城', '德州', '东营', '淄博', '潍坊', '烟台', '威海', '青岛', '日照', '临沂', '枣庄', '济宁', '泰安', '莱芜', '滨州', '菏泽'],
           ['郑州', '三门峡', '洛阳', '焦作', '新乡', '鹤壁', '安阳', '濮阳', '开封', '商丘', '许昌', '漯河', '平顶山', '南阳', '信阳', '周口', '驻马店'],
           ['武汉', '十堰', '襄攀', '荆门', '孝感', '黄冈', '鄂州', '黄石', '咸宁', '荆州', '宜昌', '恩施', '襄阳'],
           ['长沙', '张家界', '常德', '益阳', '岳阳', '株洲', '湘潭', '衡阳', '郴州', '永州', '邵阳', '怀化', '娄底', '湘西'],
           ['广州', '清远', '韶关', '河源', '梅州', '潮州', '汕头', '揭阳', '汕尾', '惠州', '东莞', '深圳', '珠海', '江门', '佛山', '肇庆', '云浮', '阳江', '茂名', '湛江'],
           ['海口', '三亚'],
           ['成都', '广元', '绵阳', '德阳', '南充', '广安', '遂宁', '内江', '乐山', '自贡', '泸州', '宜宾', '攀枝花', '巴中', '达川', '资阳', '眉山', '雅安', '阿坝', '甘孜', '凉山'],
           ['贵阳', '六盘水', '遵义', '毕节', '铜仁', '安顺', '黔东南', '黔南', '黔西南'],
           ['昆明', '曲靖', '玉溪', '丽江', '昭通', '思茅', '临沧', '保山', '德宏', '怒江', '迪庆', '大理', '楚雄', '红河', '文山', '西双版纳'],
           ['西安', '延安', '铜川', '渭南', '咸阳', '宝鸡', '汉中', '榆林', '商洛', '安康'],
           ['兰州', '嘉峪关', '金昌', '白银', '天水', '酒泉', '张掖', '武威', '庆阳', '平凉', '定西', '陇南', '临夏', '甘南'],
           ['西宁', '海东', '西宁', '海北', '海南', '黄南', '果洛', '玉树', '海西'],
           ['呼和浩特', '包头', '乌海', '赤峰', '呼伦贝尔盟', '兴安盟', '哲里木盟', '锡林郭勒盟', '乌兰察布盟', '鄂尔多斯', '巴彦淖尔盟', '阿拉善盟'],
           ['南宁', '桂林', '柳州', '梧州', '贵港', '玉林', '钦州', '北海', '防城港', '南宁', '百色', '河池', '柳州', '贺州'],
           ['拉萨', '那曲', '昌都', '林芝', '山南', '日喀则', '阿里'],
           ['银川', '石嘴山', '吴忠', '固原'],
           ['乌鲁木齐', '克拉玛依', '喀什', '阿克苏', '和田', '吐鲁番', '哈密', '博尔塔拉', '昌吉', '巴音郭楞', '伊犁', '塔城', '阿勒泰'],
           ["香港"],
           ["澳门"],
           ["台北","高雄","台中","台南","屏东","南投","云林","新竹","彰化","苗栗","嘉义","花莲","桃园","宜兰","基隆","金门","澎湖"]
       ];




window.onload=function () {
    var pro=document.getElementById("pro");                                                          /*选择籍贯*/
    for (var i=0;i<province.length;i++){
        var option=document.createElement("option");
        option.innerHTML=province[i];
        pro.appendChild(option);
    }

    var workPro=document.getElementById("workPro");                                                  /*选择工作地点*/
    for (var i=0;i<province.length;i++){
        var option=document.createElement("option");
        option.innerHTML=province[i];
        workPro.appendChild(option);
    }
}

function fillCity() {                                                                                /*填充籍贯城市*/
    var city=$("#city");
    city.empty();

    var selectProNum;
    var proValue=$("#pro").find("option:selected").text();
    for (var j=0;j<province.length;j++){
        if (proValue==province[j])
            selectProNum=j;
    }

    for (var k=0;k<citys[selectProNum].length;k++) {
        var option=document.createElement("option");
        option.innerHTML=citys[selectProNum][k];
        city.append(option);
    }
}

function fillWorkCity() {                                                                          /*填充工作点城市*/
    var workCity=$("#workCity");
    workCity.empty();

    var selectWorkProNum;
    var workProValue=$("#workPro").find("option:selected").text();
    for (var j=0;j<province.length;j++){
        if (workProValue==province[j])
            selectWorkProNum=j;
    }

    for (var k=0;k<citys[selectWorkProNum].length;k++) {
        var option=document.createElement("option");
        option.innerHTML=citys[selectWorkProNum][k];
        workCity.append(option);
    }
}





/*添加下拉生日选项*/
    $().ready(function () {
        var year=new Date().getYear()+1901;
        var month=12;
        var day=31;
        for (var i=1970;i<year;i++){
            var selectYear=document.getElementById("year");
            var option=document.createElement("option");
            option.innerHTML=i;
            selectYear.appendChild(option);
        }

        for (var j=1;j<=month;j++){
            var selectMonth=document.getElementById("month");
            var option=document.createElement("option");
            if (j<10)
                option.innerHTML="0"+j;
            else
                option.innerHTML=j;
            selectMonth.appendChild(option);
        }

        for (var k=1;k<=day;k++){
            var selectDay=document.getElementById("day");
            var option=document.createElement("option");
            if (k<10)
                option.innerHTML="0"+k;
            else
                option.innerHTML=k;
            selectDay.appendChild(option);
        }
    })






