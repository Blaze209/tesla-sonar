package ry;

import android.graphics.Paint;
import com.henninghall.date_picker.l;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class d extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.henninghall.date_picker.g f109242f;

    public d(com.henninghall.date_picker.pickers.a aVar, l lVar) {
        super(aVar, lVar);
        this.f109242f = new com.henninghall.date_picker.g(this.f109243a);
    }

    @Override // ry.g
    public String e() {
        return this.f109243a.f45233q.i() ? "h" : "HH";
    }

    @Override // ry.g
    public Paint.Align l() {
        return Paint.Align.RIGHT;
    }

    @Override // ry.g
    public ArrayList<String> o() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 0, 0, 0, 0, 0);
        ArrayList<String> arrayList = new ArrayList<>();
        int i11 = this.f109243a.f45233q.i() ? 12 : 24;
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(this.f109247e.format(calendar.getTime()));
            calendar.add(11, 1);
        }
        return arrayList;
    }

    @Override // ry.g
    public String t(String str) {
        return this.f109242f.b(str);
    }

    @Override // ry.g
    public boolean v() {
        return this.f109243a.D() != ny.b.date;
    }

    @Override // ry.g
    public boolean w() {
        return true;
    }
}
