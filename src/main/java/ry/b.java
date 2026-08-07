package ry;

import android.graphics.Paint;
import com.henninghall.date_picker.l;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class b extends g {
    public b(com.henninghall.date_picker.pickers.a aVar, l lVar) {
        super(aVar, lVar);
    }

    @Override // ry.g
    public String e() {
        return com.henninghall.date_picker.h.a(this.f109243a.z());
    }

    @Override // ry.g
    public Paint.Align l() {
        return Paint.Align.RIGHT;
    }

    @Override // ry.g
    public ArrayList<String> o() {
        Calendar calendar = Calendar.getInstance();
        ArrayList<String> arrayList = new ArrayList<>();
        calendar.set(2, 0);
        calendar.set(5, 1);
        for (int i11 = 1; i11 <= 31; i11++) {
            arrayList.add(i(calendar));
            calendar.add(5, 1);
        }
        return arrayList;
    }

    @Override // ry.g
    public boolean v() {
        return this.f109243a.D() == ny.b.date;
    }

    @Override // ry.g
    public boolean w() {
        return true;
    }
}
