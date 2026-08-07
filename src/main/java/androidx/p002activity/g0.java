package androidx.p002activity;

import android.content.res.Resources;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/activity/g0;", "", "", "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "<init>", "(IIILwn0/l;)V", "isDark", DateTokenConverter.CONVERTER_KEY, "(Z)I", "e", "a", "I", "b", "()I", "c", "Lwn0/l;", "()Lwn0/l;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int lightScrim;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int darkScrim;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int nightMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<Resources, Boolean> detectDarkMode;

    /* JADX INFO: renamed from: androidx.activity.g0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/activity/g0$a;", "", "<init>", "()V", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "Landroidx/activity/g0;", "a", "(IILwn0/l;)Landroidx/activity/g0;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.activity.g0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Resources;", "resources", "", "a", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class C0057a extends u implements l<Resources, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0057a f1904c = new C0057a();

            C0057a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                s.k(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ g0 b(Companion companion, int i11, int i12, l lVar, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                lVar = C0057a.f1904c;
            }
            return companion.a(i11, i12, lVar);
        }

        public final g0 a(int lightScrim, int darkScrim, l<? super Resources, Boolean> detectDarkMode) {
            s.k(detectDarkMode, "detectDarkMode");
            return new g0(lightScrim, darkScrim, 0, detectDarkMode, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ g0(int i11, int i12, int i13, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, lVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDarkScrim() {
        return this.darkScrim;
    }

    public final l<Resources, Boolean> b() {
        return this.detectDarkMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNightMode() {
        return this.nightMode;
    }

    public final int d(boolean isDark) {
        return isDark ? this.darkScrim : this.lightScrim;
    }

    public final int e(boolean isDark) {
        if (this.nightMode == 0) {
            return 0;
        }
        return isDark ? this.darkScrim : this.lightScrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g0(int i11, int i12, int i13, l<? super Resources, Boolean> lVar) {
        this.lightScrim = i11;
        this.darkScrim = i12;
        this.nightMode = i13;
        this.detectDarkMode = lVar;
    }
}
