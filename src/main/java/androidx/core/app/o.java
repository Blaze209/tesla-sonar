package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class o {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f7500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f7501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x[] f7502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final x[] f7503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f7504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f7505f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f7506g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f7507h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f7508i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f7509j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f7510k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f7511l;

        /* JADX INFO: renamed from: androidx.core.app.o$a$a, reason: collision with other inner class name */
        public static final class C0152a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f7512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f7513b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f7514c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f7515d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f7516e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList<x> f7517f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f7518g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f7519h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f7520i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f7521j;

            public C0152a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void b() {
                if (this.f7520i && this.f7514c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<x> arrayList3 = this.f7517f;
                if (arrayList3 != null) {
                    for (x xVar : arrayList3) {
                        if (xVar.j()) {
                            arrayList.add(xVar);
                        } else {
                            arrayList2.add(xVar);
                        }
                    }
                }
                return new a(this.f7512a, this.f7513b, this.f7514c, this.f7516e, arrayList2.isEmpty() ? null : (x[]) arrayList2.toArray(new x[arrayList2.size()]), arrayList.isEmpty() ? null : (x[]) arrayList.toArray(new x[arrayList.size()]), this.f7515d, this.f7518g, this.f7519h, this.f7520i, this.f7521j);
            }

            private C0152a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x[] xVarArr, boolean z11, int i11, boolean z12, boolean z13, boolean z14) {
                this.f7515d = true;
                this.f7519h = true;
                this.f7512a = iconCompat;
                this.f7513b = e.e(charSequence);
                this.f7514c = pendingIntent;
                this.f7516e = bundle;
                this.f7517f = xVarArr == null ? null : new ArrayList<>(Arrays.asList(xVarArr));
                this.f7515d = z11;
                this.f7518g = i11;
                this.f7519h = z12;
                this.f7520i = z13;
                this.f7521j = z14;
            }
        }

        public a(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i11 != 0 ? IconCompat.d(null, "", i11) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f7510k;
        }

        public boolean b() {
            return this.f7504e;
        }

        public Bundle c() {
            return this.f7500a;
        }

        public IconCompat d() {
            int i11;
            if (this.f7501b == null && (i11 = this.f7508i) != 0) {
                this.f7501b = IconCompat.d(null, "", i11);
            }
            return this.f7501b;
        }

        public x[] e() {
            return this.f7502c;
        }

        public int f() {
            return this.f7506g;
        }

        public boolean g() {
            return this.f7505f;
        }

        public CharSequence h() {
            return this.f7509j;
        }

        public boolean i() {
            return this.f7511l;
        }

        public boolean j() {
            return this.f7507h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x[] xVarArr, x[] xVarArr2, boolean z11, int i11, boolean z12, boolean z13, boolean z14) {
            this.f7505f = true;
            this.f7501b = iconCompat;
            if (iconCompat != null && iconCompat.h() == 2) {
                this.f7508i = iconCompat.f();
            }
            this.f7509j = e.e(charSequence);
            this.f7510k = pendingIntent;
            this.f7500a = bundle == null ? new Bundle() : bundle;
            this.f7502c = xVarArr;
            this.f7503d = xVarArr2;
            this.f7504e = z11;
            this.f7506g = i11;
            this.f7505f = z12;
            this.f7507h = z13;
            this.f7511l = z14;
        }
    }

    public static class b extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f7522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f7523f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f7524g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f7525h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f7526i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.o$b$b, reason: collision with other inner class name */
        private static class C0153b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z11) {
                bigPictureStyle.showBigPictureWhenCollapsed(z11);
            }
        }

        @Override // androidx.core.app.o.h
        public void b(n nVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(nVar.a()).setBigContentTitle(this.f7565b);
            IconCompat iconCompat = this.f7522e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0153b.a(bigContentTitle, this.f7522e.o(nVar instanceof p ? ((p) nVar).f() : null));
                } else if (iconCompat.h() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f7522e.e());
                }
            }
            if (this.f7524g) {
                if (this.f7523f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f7523f.o(nVar instanceof p ? ((p) nVar).f() : null));
                }
            }
            if (this.f7567d) {
                bigContentTitle.setSummaryText(this.f7566c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0153b.c(bigContentTitle, this.f7526i);
                C0153b.b(bigContentTitle, this.f7525h);
            }
        }

        @Override // androidx.core.app.o.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f7523f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f7524g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f7522e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f7527e;

        @Override // androidx.core.app.o.h
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.o.h
        public void b(n nVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(nVar.a()).setBigContentTitle(this.f7565b).bigText(this.f7527e);
            if (this.f7567d) {
                bigTextStyleBigText.setSummaryText(this.f7566c);
            }
        }

        @Override // androidx.core.app.o.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f7527e = e.e(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class f extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f7554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private v f7555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private PendingIntent f7556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private PendingIntent f7557h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private PendingIntent f7558i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f7559j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f7560k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f7561l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private IconCompat f7562m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CharSequence f7563n;

        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        static class b {
            static Parcelable a(Icon icon) {
                return icon;
            }

            static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        static class c {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }

        static class d {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i11) {
                return callStyle.setAnswerButtonColorHint(i11);
            }

            static Notification.CallStyle e(Notification.CallStyle callStyle, int i11) {
                return callStyle.setDeclineButtonColorHint(i11);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z11) {
                return callStyle.setIsVideo(z11);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private String i() {
            int i11 = this.f7554e;
            if (i11 == 1) {
                return this.f7564a.f7528a.getResources().getString(h5.f.f70814e);
            }
            if (i11 == 2) {
                return this.f7564a.f7528a.getResources().getString(h5.f.f70815f);
            }
            if (i11 != 3) {
                return null;
            }
            return this.f7564a.f7528a.getResources().getString(h5.f.f70816g);
        }

        private boolean j(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a k(int i11, int i12, Integer num, int i13, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.b.getColor(this.f7564a.f7528a, i13));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f7564a.f7528a.getResources().getString(i12));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarA = new a.C0152a(IconCompat.c(this.f7564a.f7528a, i11), spannableStringBuilder, pendingIntent).a();
            aVarA.c().putBoolean("key_action_priority", true);
            return aVarA;
        }

        private a l() {
            int i11 = h5.d.f70782b;
            int i12 = h5.d.f70781a;
            PendingIntent pendingIntent = this.f7556g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z11 = this.f7559j;
            return k(z11 ? i11 : i12, z11 ? h5.f.f70811b : h5.f.f70810a, this.f7560k, h5.b.f70777a, pendingIntent);
        }

        private a m() {
            int i11 = h5.d.f70783c;
            PendingIntent pendingIntent = this.f7557h;
            return pendingIntent == null ? k(i11, h5.f.f70813d, this.f7561l, h5.b.f70778b, this.f7558i) : k(i11, h5.f.f70812c, this.f7561l, h5.b.f70778b, pendingIntent);
        }

        @Override // androidx.core.app.o.h
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f7554e);
            bundle.putBoolean("android.callIsVideo", this.f7559j);
            v vVar = this.f7555f;
            if (vVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(vVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", vVar.i());
                }
            }
            IconCompat iconCompat = this.f7562m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.o(this.f7564a.f7528a)));
            }
            bundle.putCharSequence("android.verificationText", this.f7563n);
            bundle.putParcelable("android.answerIntent", this.f7556g);
            bundle.putParcelable("android.declineIntent", this.f7557h);
            bundle.putParcelable("android.hangUpIntent", this.f7558i);
            Integer num = this.f7560k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f7561l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.o.h
        public void b(n nVar) {
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequenceI = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceI = null;
            if (i11 < 31) {
                Notification.Builder builderA = nVar.a();
                v vVar = this.f7555f;
                builderA.setContentTitle(vVar != null ? vVar.c() : null);
                Bundle bundle = this.f7564a.D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceI = this.f7564a.D.getCharSequence("android.text");
                }
                if (charSequenceI == null) {
                    charSequenceI = i();
                }
                builderA.setContentText(charSequenceI);
                v vVar2 = this.f7555f;
                if (vVar2 != null) {
                    if (vVar2.a() != null) {
                        b.b(builderA, this.f7555f.a().o(this.f7564a.f7528a));
                    }
                    if (i11 >= 28) {
                        c.a(builderA, this.f7555f.h());
                    } else {
                        a.a(builderA, this.f7555f.d());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i12 = this.f7554e;
            if (i12 == 1) {
                callStyleA = d.a(this.f7555f.h(), this.f7557h, this.f7556g);
            } else if (i12 == 2) {
                callStyleA = d.b(this.f7555f.h(), this.f7558i);
            } else if (i12 == 3) {
                callStyleA = d.c(this.f7555f.h(), this.f7558i, this.f7556g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f7554e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(nVar.a());
                Integer num = this.f7560k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f7561l;
                if (num2 != null) {
                    d.e(callStyleA, num2.intValue());
                }
                d.h(callStyleA, this.f7563n);
                IconCompat iconCompat = this.f7562m;
                if (iconCompat != null) {
                    d.g(callStyleA, iconCompat.o(this.f7564a.f7528a));
                }
                d.f(callStyleA, this.f7559j);
            }
        }

        @Override // androidx.core.app.o.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> h() {
            a aVarM = m();
            a aVarL = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarM);
            ArrayList<a> arrayList2 = this.f7564a.f7529b;
            int i11 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!j(aVar) && i11 > 1) {
                        arrayList.add(aVar);
                        i11--;
                    }
                    if (aVarL != null && i11 == 1) {
                        arrayList.add(aVarL);
                        i11--;
                    }
                }
            }
            if (aVarL != null && i11 >= 1) {
                arrayList.add(aVarL);
            }
            return arrayList;
        }
    }

    public static class g extends h {

        static class a {
            static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.o.h
        public void b(n nVar) {
            nVar.a().setStyle(a.a());
        }

        @Override // androidx.core.app.o.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.o.h
        public RemoteViews d(n nVar) {
            return null;
        }

        @Override // androidx.core.app.o.h
        public RemoteViews e(n nVar) {
            return null;
        }

        @Override // androidx.core.app.o.h
        public RemoteViews f(n nVar) {
            return null;
        }
    }

    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected e f7564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f7565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f7566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7567d = false;

        public void a(Bundle bundle) {
            if (this.f7567d) {
                bundle.putCharSequence("android.summaryText", this.f7566c);
            }
            CharSequence charSequence = this.f7565b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(n nVar);

        protected String c() {
            return null;
        }

        public RemoteViews d(n nVar) {
            return null;
        }

        public RemoteViews e(n nVar) {
            return null;
        }

        public RemoteViews f(n nVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f7564a != eVar) {
                this.f7564a = eVar;
                if (eVar != null) {
                    eVar.F(this);
                }
            }
        }
    }

    @Deprecated
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(h5.c.f70780b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(h5.c.f70779a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;

        @Deprecated
        public ArrayList<String> U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f7528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<a> f7529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<v> f7530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<a> f7531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f7532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f7533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f7534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f7535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f7536i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        IconCompat f7537j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f7538k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f7539l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f7540m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f7541n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f7542o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        h f7543p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        CharSequence f7544q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f7545r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence[] f7546s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f7547t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f7548u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f7549v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        String f7550w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f7551x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        String f7552y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f7553z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i11) {
                return builder.setContentType(i11);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i11) {
                return builder.setUsage(i11);
            }
        }

        public e(Context context, String str) {
            this.f7529b = new ArrayList<>();
            this.f7530c = new ArrayList<>();
            this.f7531d = new ArrayList<>();
            this.f7541n = true;
            this.f7553z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f7528a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f7540m = 0;
            this.U = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void r(int i11, boolean z11) {
            if (z11) {
                Notification notification = this.R;
                notification.flags = i11 | notification.flags;
            } else {
                Notification notification2 = this.R;
                notification2.flags = (~i11) & notification2.flags;
            }
        }

        public e A(int i11) {
            this.f7540m = i11;
            return this;
        }

        public e B(int i11, int i12, boolean z11) {
            this.f7547t = i11;
            this.f7548u = i12;
            this.f7549v = z11;
            return this;
        }

        public e C(boolean z11) {
            this.f7541n = z11;
            return this;
        }

        public e D(int i11) {
            this.R.icon = i11;
            return this;
        }

        public e E(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.R.audioAttributes = a.a(builderD);
            return this;
        }

        public e F(h hVar) {
            if (this.f7543p != hVar) {
                this.f7543p = hVar;
                if (hVar != null) {
                    hVar.g(this);
                }
            }
            return this;
        }

        public e G(CharSequence charSequence) {
            this.f7544q = e(charSequence);
            return this;
        }

        public e H(CharSequence charSequence) {
            this.R.tickerText = e(charSequence);
            return this;
        }

        public e I(boolean z11) {
            this.f7542o = z11;
            return this;
        }

        public e J(long[] jArr) {
            this.R.vibrate = jArr;
            return this;
        }

        public e K(int i11) {
            this.F = i11;
            return this;
        }

        public e L(long j11) {
            this.R.when = j11;
            return this;
        }

        public e a(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f7529b.add(new a(i11, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f7529b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new p(this).c();
        }

        public Bundle d() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e f(boolean z11) {
            r(16, z11);
            return this;
        }

        public e g(String str) {
            this.C = str;
            return this;
        }

        public e h(String str) {
            this.K = str;
            return this;
        }

        public e i(int i11) {
            this.E = i11;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f7538k = e(charSequence);
            return this;
        }

        public e k(PendingIntent pendingIntent) {
            this.f7534g = pendingIntent;
            return this;
        }

        public e l(CharSequence charSequence) {
            this.f7533f = e(charSequence);
            return this;
        }

        public e m(CharSequence charSequence) {
            this.f7532e = e(charSequence);
            return this;
        }

        public e n(RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        public e o(RemoteViews remoteViews) {
            this.H = remoteViews;
            return this;
        }

        public e p(int i11) {
            Notification notification = this.R;
            notification.defaults = i11;
            if ((i11 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e q(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public e s(int i11) {
            this.P = i11;
            return this;
        }

        public e t(String str) {
            this.f7550w = str;
            return this;
        }

        public e u(Bitmap bitmap) {
            this.f7537j = bitmap == null ? null : IconCompat.b(o.b(this.f7528a, bitmap));
            return this;
        }

        public e v(int i11, int i12, int i13) {
            Notification notification = this.R;
            notification.ledARGB = i11;
            notification.ledOnMS = i12;
            notification.ledOffMS = i13;
            notification.flags = ((i12 == 0 || i13 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e w(boolean z11) {
            this.f7553z = z11;
            return this;
        }

        public e x(int i11) {
            this.f7539l = i11;
            return this;
        }

        public e y(boolean z11) {
            r(2, z11);
            return this;
        }

        public e z(boolean z11) {
            r(8, z11);
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
