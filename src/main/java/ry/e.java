package ry;

import android.graphics.Paint;
import com.henninghall.date_picker.l;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class e extends g {
    public e(com.henninghall.date_picker.pickers.a aVar, l lVar) {
        super(aVar, lVar);
    }

    @Override // ry.g
    public String e() {
        return "mm";
    }

    @Override // ry.g
    public Paint.Align l() {
        return this.f109243a.f45233q.h() ? Paint.Align.LEFT : Paint.Align.RIGHT;
    }

    @Override // ry.g
    public ArrayList<String> o() {
        Calendar calendar = Calendar.getInstance();
        ArrayList<String> arrayList = new ArrayList<>();
        int iC = 0;
        calendar.set(12, 0);
        while (iC < 60) {
            arrayList.add(this.f109247e.format(calendar.getTime()));
            calendar.add(12, this.f109243a.C());
            iC += this.f109243a.C();
        }
        return arrayList;
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
