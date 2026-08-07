package ry;

import android.graphics.Paint;
import com.henninghall.date_picker.l;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class h extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f109249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f109250g;

    public h(com.henninghall.date_picker.pickers.a aVar, l lVar) {
        super(aVar, lVar);
        this.f109249f = 1900;
        this.f109250g = 2100;
    }

    private int x() {
        return this.f109243a.A() == null ? this.f109250g : this.f109243a.A().get(1);
    }

    private int y() {
        return this.f109243a.B() == null ? this.f109249f : this.f109243a.B().get(1);
    }

    @Override // ry.g
    public String e() {
        return com.henninghall.date_picker.h.h(this.f109243a.z());
    }

    @Override // ry.g
    public Paint.Align l() {
        return Paint.Align.RIGHT;
    }

    @Override // ry.g
    public ArrayList<String> o() {
        ArrayList<String> arrayList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        int iY = y();
        int iX = x() - iY;
        calendar.set(1, iY);
        for (int i11 = 0; i11 <= iX; i11++) {
            arrayList.add(i(calendar));
            calendar.add(1, 1);
        }
        return arrayList;
    }

    @Override // ry.g
    public boolean v() {
        return this.f109243a.D() == ny.b.date;
    }

    @Override // ry.g
    public boolean w() {
        return false;
    }
}
