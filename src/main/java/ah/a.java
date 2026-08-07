package ah;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1040g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f1034a = str;
        this.f1035b = str2;
        this.f1036c = str3;
        this.f1037d = str4;
        this.f1038e = str5;
        this.f1039f = str6;
        this.f1040g = str7;
    }

    public String toString() {
        StringBuilder sb2;
        String strSubstring;
        StringBuilder sb3;
        String strSubstring2;
        StringBuilder sb4;
        String strSubstring3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.f1034a);
        stringBuffer.append("," + this.f1035b);
        stringBuffer.append("," + this.f1036c);
        stringBuffer.append("," + this.f1037d);
        if (sg.a.c(this.f1038e) || this.f1038e.length() < 20) {
            sb2 = new StringBuilder();
            sb2.append(",");
            strSubstring = this.f1038e;
        } else {
            sb2 = new StringBuilder();
            sb2.append(",");
            strSubstring = this.f1038e.substring(0, 20);
        }
        sb2.append(strSubstring);
        stringBuffer.append(sb2.toString());
        if (sg.a.c(this.f1039f) || this.f1039f.length() < 20) {
            sb3 = new StringBuilder();
            sb3.append(",");
            strSubstring2 = this.f1039f;
        } else {
            sb3 = new StringBuilder();
            sb3.append(",");
            strSubstring2 = this.f1039f.substring(0, 20);
        }
        sb3.append(strSubstring2);
        stringBuffer.append(sb3.toString());
        if (sg.a.c(this.f1040g) || this.f1040g.length() < 20) {
            sb4 = new StringBuilder();
            sb4.append(",");
            strSubstring3 = this.f1040g;
        } else {
            sb4 = new StringBuilder();
            sb4.append(",");
            strSubstring3 = this.f1040g.substring(0, 20);
        }
        sb4.append(strSubstring3);
        stringBuffer.append(sb4.toString());
        return stringBuffer.toString();
    }
}
