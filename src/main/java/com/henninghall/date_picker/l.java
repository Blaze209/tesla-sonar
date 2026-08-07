package com.henninghall.date_picker;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Dynamic;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import oy.n;
import oy.o;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Calendar f45217a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oy.a f45218b = new oy.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oy.k f45219c = new oy.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oy.g f45220d = new oy.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final oy.c f45221e = new oy.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final oy.m f45222f = new oy.m();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final oy.j f45223g = new oy.j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final oy.i f45224h = new oy.i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final oy.h f45225i = new oy.h();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n f45226j = new n();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final oy.d f45227k = new oy.d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o f45228l = new o();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final oy.b f45229m = new oy.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oy.f f45230n = new oy.f();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final oy.e f45231o = new oy.e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final HashMap f45232p = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d f45233q = new d(this);

    class a extends HashMap<String, oy.l> {
        a() {
            put(InquiryField.DateField.TYPE, l.this.f45218b);
            put("mode", l.this.f45219c);
            put("locale", l.this.f45220d);
            put("fadeToColor", l.this.f45221e);
            put("textColor", l.this.f45222f);
            put("minuteInterval", l.this.f45223g);
            put("minimumDate", l.this.f45224h);
            put("maximumDate", l.this.f45225i);
            put("timezoneOffsetInMinutes", l.this.f45226j);
            put(Snapshot.HEIGHT, l.this.f45227k);
            put("androidVariant", l.this.f45228l);
            put("dividerHeight", l.this.f45229m);
            put("is24hourSource", l.this.f45230n);
            put("id", l.this.f45231o);
        }
    }

    private oy.l F(String str) {
        return (oy.l) this.f45232p.get(str);
    }

    private Calendar o(oy.l<String> lVar) {
        Calendar calendarH = m.h(lVar.a(), H());
        p(calendarH);
        return calendarH;
    }

    private void p(Calendar calendar) {
        if (calendar == null) {
            return;
        }
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    private Calendar q() {
        return m.h(w(), H());
    }

    public Calendar A() {
        return o(this.f45225i);
    }

    public Calendar B() {
        return o(this.f45224h);
    }

    public int C() {
        return this.f45223g.a().intValue();
    }

    public ny.b D() {
        return this.f45219c.a();
    }

    public Calendar E() {
        Calendar calendarQ = q();
        int iC = C();
        if (iC <= 1) {
            return calendarQ;
        }
        calendarQ.add(12, -(Integer.parseInt(new SimpleDateFormat("mm", y()).format(calendarQ.getTime())) % iC));
        return (Calendar) calendarQ.clone();
    }

    public String G() {
        return this.f45222f.a();
    }

    public TimeZone H() {
        try {
            String strA = this.f45226j.a();
            if (strA != null && !strA.equals("")) {
                int i11 = Integer.parseInt(strA);
                int iAbs = Math.abs(i11);
                char c11 = i11 < 0 ? CoreConstants.DASH_CHAR : '+';
                int iFloor = (int) Math.floor(iAbs / 60.0f);
                return DesugarTimeZone.getTimeZone("GMT" + c11 + iFloor + ":" + m.l(iAbs - (iFloor * 60)));
            }
            return TimeZone.getDefault();
        } catch (Exception e11) {
            e11.printStackTrace();
            return TimeZone.getDefault();
        }
    }

    public ny.c I() {
        return this.f45228l.a();
    }

    public void J(Calendar calendar) {
        this.f45217a = calendar;
    }

    void K(String str, Dynamic dynamic) {
        F(str).b(dynamic);
    }

    public int r() {
        return this.f45229m.a().intValue();
    }

    public String s() {
        return this.f45221e.a();
    }

    public Integer t() {
        return this.f45227k.a();
    }

    public String u() {
        return this.f45231o.a();
    }

    public ny.a v() {
        return this.f45230n.a();
    }

    public String w() {
        return this.f45218b.a();
    }

    public Calendar x() {
        return this.f45217a;
    }

    public Locale y() {
        return this.f45220d.a();
    }

    public String z() {
        return this.f45220d.f();
    }
}
