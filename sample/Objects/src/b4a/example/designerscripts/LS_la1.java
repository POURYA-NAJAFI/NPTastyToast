package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_la1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[la1/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="ListView1.SetLeftAndRight(0%X,100%X)"[la1/General script]
views.get("listview1").vw.setLeft((int)((0d / 100 * width)));
views.get("listview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 4;BA.debugLine="ListView1.SetTopAndBottom(15%y,85%Y)"[la1/General script]
views.get("listview1").vw.setTop((int)((15d / 100 * height)));
views.get("listview1").vw.setHeight((int)((85d / 100 * height) - ((15d / 100 * height))));
//BA.debugLineNum = 7;BA.debugLine="Panel1.SetLeftAndRight(0%X,100%X)"[la1/General script]
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="Panel1.SetTopAndBottom(0%y,10%Y)"[la1/General script]
views.get("panel1").vw.setTop((int)((0d / 100 * height)));
views.get("panel1").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 10;BA.debugLine="Label1.SetLeftAndRight(2%X,50%X)"[la1/General script]
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setWidth((int)((50d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 11;BA.debugLine="Label1.SetTopAndBottom(1%y,9%Y)"[la1/General script]
views.get("label1").vw.setTop((int)((1d / 100 * height)));
views.get("label1").vw.setHeight((int)((9d / 100 * height) - ((1d / 100 * height))));

}
}