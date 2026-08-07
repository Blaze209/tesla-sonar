package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f7569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o.e f7570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f7571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f7572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Bundle> f7573f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f7574g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f7576i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static String e(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z11) {
            return builder.setGroupSummary(z11);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z11) {
            return builder.setLocalOnly(z11);
        }

        static Notification.Builder i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i11) {
            return builder.setColor(i11);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i11) {
            return builder.setVisibility(i11);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z11) {
            return builder.setAllowGeneratedReplies(z11);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i11) {
            return builder.setBadgeIconType(i11);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z11) {
            return builder.setColorized(z11);
        }

        static Notification.Builder d(Notification.Builder builder, int i11) {
            return builder.setGroupAlertBehavior(i11);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j11) {
            return builder.setTimeoutAfter(j11);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i11) {
            return builder.setSemanticAction(i11);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z11) {
            return builder.setAllowSystemGeneratedContextualActions(z11);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z11) {
            return builder.setContextual(z11);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z11) {
            return builder.setAuthenticationRequired(z11);
        }

        static Notification.Builder b(Notification.Builder builder, int i11) {
            return builder.setForegroundServiceBehavior(i11);
        }
    }

    p(o.e eVar) {
        int i11;
        this.f7570c = eVar;
        Context context = eVar.f7528a;
        this.f7568a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7569b = e.a(context, eVar.K);
        } else {
            this.f7569b = new Notification.Builder(eVar.f7528a);
        }
        Notification notification = eVar.R;
        this.f7569b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f7536i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f7532e).setContentText(eVar.f7533f).setContentInfo(eVar.f7538k).setContentIntent(eVar.f7534g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f7535h, (notification.flags & 128) != 0).setNumber(eVar.f7539l).setProgress(eVar.f7547t, eVar.f7548u, eVar.f7549v);
        Notification.Builder builder = this.f7569b;
        IconCompat iconCompat = eVar.f7537j;
        c.b(builder, iconCompat == null ? null : iconCompat.o(context));
        this.f7569b.setSubText(eVar.f7544q).setUsesChronometer(eVar.f7542o).setPriority(eVar.f7540m);
        o.h hVar = eVar.f7543p;
        if (hVar instanceof o.f) {
            Iterator<o.a> it = ((o.f) hVar).h().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<o.a> it2 = eVar.f7529b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.f7574g.putAll(bundle);
        }
        int i12 = Build.VERSION.SDK_INT;
        this.f7571d = eVar.H;
        this.f7572e = eVar.I;
        this.f7569b.setShowWhen(eVar.f7541n);
        a.h(this.f7569b, eVar.f7553z);
        a.f(this.f7569b, eVar.f7550w);
        a.i(this.f7569b, eVar.f7552y);
        a.g(this.f7569b, eVar.f7551x);
        this.f7575h = eVar.O;
        b.b(this.f7569b, eVar.C);
        b.c(this.f7569b, eVar.E);
        b.f(this.f7569b, eVar.F);
        b.d(this.f7569b, eVar.G);
        b.e(this.f7569b, notification.sound, notification.audioAttributes);
        List listE = i12 < 28 ? e(g(eVar.f7530c), eVar.U) : eVar.U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it3 = listE.iterator();
            while (it3.hasNext()) {
                b.a(this.f7569b, (String) it3.next());
            }
        }
        this.f7576i = eVar.J;
        if (eVar.f7531d.size() > 0) {
            Bundle bundle2 = eVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i13 = 0; i13 < eVar.f7531d.size(); i13++) {
                bundle4.putBundle(Integer.toString(i13), q.a(eVar.f7531d.get(i13)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f7574g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i14 = Build.VERSION.SDK_INT;
        Object obj = eVar.T;
        if (obj != null) {
            c.c(this.f7569b, obj);
        }
        this.f7569b.setExtras(eVar.D);
        d.e(this.f7569b, eVar.f7546s);
        RemoteViews remoteViews = eVar.H;
        if (remoteViews != null) {
            d.c(this.f7569b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.I;
        if (remoteViews2 != null) {
            d.b(this.f7569b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.J;
        if (remoteViews3 != null) {
            d.d(this.f7569b, remoteViews3);
        }
        if (i14 >= 26) {
            e.b(this.f7569b, eVar.L);
            e.e(this.f7569b, eVar.f7545r);
            e.f(this.f7569b, eVar.M);
            e.g(this.f7569b, eVar.N);
            e.d(this.f7569b, eVar.O);
            if (eVar.B) {
                e.c(this.f7569b, eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f7569b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator<v> it4 = eVar.f7530c.iterator();
            while (it4.hasNext()) {
                f.a(this.f7569b, it4.next().h());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            g.a(this.f7569b, eVar.Q);
            g.b(this.f7569b, o.d.a(null));
        }
        if (i15 >= 31 && (i11 = eVar.P) != 0) {
            h.b(this.f7569b, i11);
        }
        if (eVar.S) {
            if (this.f7570c.f7551x) {
                this.f7575h = 2;
            } else {
                this.f7575h = 1;
            }
            this.f7569b.setVibrate(null);
            this.f7569b.setSound(null);
            int i16 = notification.defaults & (-4);
            notification.defaults = i16;
            this.f7569b.setDefaults(i16);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f7570c.f7550w)) {
                    a.f(this.f7569b, "silent");
                }
                e.d(this.f7569b, this.f7575h);
            }
        }
    }

    private void b(o.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.n() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : x.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i11 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i11 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i11 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i11 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f7569b, a.d(builderA));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<v> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<v> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.n
    public Notification.Builder a() {
        return this.f7569b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        o.h hVar = this.f7570c.f7543p;
        if (hVar != null) {
            hVar.b(this);
        }
        RemoteViews remoteViewsE = hVar != null ? hVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f7570c.H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (hVar != null && (remoteViewsD = hVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (hVar != null && (remoteViewsF = this.f7570c.f7543p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (hVar != null && (bundleA = o.a(notificationD)) != null) {
            hVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f7569b.build();
        }
        Notification notificationBuild = this.f7569b.build();
        if (this.f7575h != 0) {
            if (a.e(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f7575h == 2) {
                h(notificationBuild);
            }
            if (a.e(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f7575h == 1) {
                h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    Context f() {
        return this.f7568a;
    }
}
