package py;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.henninghall.date_picker.l;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GradientDrawable f104074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GradientDrawable f104075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f104076c;

    b(l lVar, View view) {
        this.f104076c = lVar;
        ImageView imageView = (ImageView) view.findViewById(com.henninghall.date_picker.j.f45212j);
        ImageView imageView2 = (ImageView) view.findViewById(com.henninghall.date_picker.j.f45211i);
        this.f104074a = (GradientDrawable) imageView.getDrawable();
        this.f104075b = (GradientDrawable) imageView2.getDrawable();
    }

    private boolean b(String str) {
        return str != null && str.length() == 7;
    }

    void a() {
        String strS = this.f104076c.s();
        int i11 = b(strS) ? 255 : 0;
        this.f104074a.setAlpha(i11);
        this.f104075b.setAlpha(i11);
        if (b(strS)) {
            int color = Color.parseColor("#FF" + strS.substring(1));
            int color2 = Color.parseColor("#00" + strS.substring(1));
            this.f104074a.setColors(new int[]{color, color2});
            this.f104075b.setColors(new int[]{color, color2});
        }
    }
}
