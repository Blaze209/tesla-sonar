package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public interface Jp {

    public static final class a {
        private static boolean a(Jp jp2) {
            String strG = jp2.g();
            if (strG != null) {
                return C4052y.a.f36872a.a(strG);
            }
            return true;
        }

        public static boolean b(Jp jp2) {
            Date dateB = jp2.b();
            if (dateB != null) {
                return dateB.before(g(jp2));
            }
            return false;
        }

        public static boolean c(Jp jp2) {
            String strA = jp2.a();
            if (strA != null) {
                return !p013kotlin.text.t.y0(strA);
            }
            return false;
        }

        public static boolean d(Jp jp2) {
            return jp2.d() != null;
        }

        public static boolean e(Jp jp2) {
            String strC = jp2.c();
            if (strC != null) {
                return !p013kotlin.text.t.y0(strC);
            }
            return false;
        }

        private static boolean f(Jp jp2) {
            String strH = jp2.h();
            if (strH != null) {
                return C4052y.a.f36872a.a(strH);
            }
            return false;
        }

        private static Date g(Jp jp2) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTime();
        }

        public static boolean h(Jp jp2) {
            return jp2.e() && jp2.f() && f(jp2) && jp2.l() && jp2.j() && a(jp2);
        }
    }

    String a();

    Date b();

    String c();

    Gender d();

    boolean e();

    boolean f();

    String g();

    String h();

    boolean i();

    boolean j();

    String k();

    boolean l();

    String m();
}
