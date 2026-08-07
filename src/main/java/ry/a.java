package ry;

import android.graphics.Paint;
import com.henninghall.date_picker.l;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class a extends g {
    public a(com.henninghall.date_picker.pickers.a aVar, l lVar) {
        super(aVar, lVar);
    }

    @Override // ry.g
    public String e() {
        return this.f109243a.f45233q.i() ? " a " : "";
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
        calendar.set(11, 0);
        arrayList.add(this.f109247e.format(calendar.getTime()));
        calendar.add(11, 12);
        arrayList.add(this.f109247e.format(calendar.getTime()));
        return arrayList;
    }

    @Override // ry.g
    public boolean v() {
        return this.f109243a.f45233q.i() && this.f109243a.D() != ny.b.date;
    }

    @Override // ry.g
    public boolean w() {
        return false;
    }
}
