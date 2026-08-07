package ry;

import android.graphics.Paint;
import com.henninghall.date_picker.l;
import com.henninghall.date_picker.m;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class c extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f109239h = 150;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f109240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, String> f109241g;

    public c(com.henninghall.date_picker.pickers.a aVar, l lVar) {
        super(aVar, lVar);
    }

    private Calendar A() {
        Calendar calendarA = this.f109243a.A();
        Calendar calendarB = this.f109243a.B();
        if (calendarA != null) {
            return (Calendar) calendarA.clone();
        }
        if (calendarB != null) {
            Calendar calendar = (Calendar) calendarB.clone();
            calendar.add(5, calendar.getActualMaximum(6) / 2);
            return calendar;
        }
        Calendar calendarE = this.f109243a.E();
        calendarE.add(5, f109239h / 2);
        return calendarE;
    }

    private Calendar B() {
        Calendar calendarA = this.f109243a.A();
        Calendar calendarB = this.f109243a.B();
        if (calendarB != null) {
            return (Calendar) calendarB.clone();
        }
        if (calendarA != null) {
            Calendar calendar = (Calendar) calendarA.clone();
            calendar.add(5, (-calendar.getActualMaximum(6)) / 2);
            return calendar;
        }
        Calendar calendarE = this.f109243a.E();
        calendarE.add(5, (-f109239h) / 2);
        return calendarE;
    }

    private String C(Calendar calendar) {
        return this.f109247e.format(calendar.getTime());
    }

    private Calendar D(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    private String E(String str) {
        String strJ = m.j(this.f109243a.y());
        return Character.isUpperCase(str.charAt(0)) ? m.a(strJ) : strJ;
    }

    private String x(Calendar calendar) {
        return y().format(calendar.getTime());
    }

    private SimpleDateFormat y() {
        return new SimpleDateFormat(z(), this.f109243a.y());
    }

    private String z() {
        return com.henninghall.date_picker.h.d(this.f109243a.z());
    }

    @Override // ry.g
    public String e() {
        return com.henninghall.date_picker.h.b(this.f109243a.y()).replace("EEEE", "EEE").replace("MMMM", "MMM");
    }

    @Override // ry.g
    public Paint.Align l() {
        return Paint.Align.RIGHT;
    }

    @Override // ry.g
    public ArrayList<String> o() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f109241g = new HashMap<>();
        Calendar calendarB = B();
        Calendar calendarA = A();
        do {
            String strC = C(calendarB);
            arrayList.add(strC);
            this.f109241g.put(strC, x(calendarB));
            if (m.g(calendarB)) {
                this.f109240f = strC;
            }
            calendarB.add(5, 1);
        } while (!D((Calendar) calendarB.clone()).after(calendarA));
        return arrayList;
    }

    @Override // ry.g
    public String t(String str) {
        return str.equals(this.f109240f) ? E(str) : this.f109241g.get(str);
    }

    @Override // ry.g
    public boolean v() {
        return this.f109243a.D() == ny.b.datetime;
    }

    @Override // ry.g
    public boolean w() {
        return false;
    }
}
