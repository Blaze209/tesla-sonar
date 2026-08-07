package androidx.work;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import tb.NetworkRequestCompat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0003&.*B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0097\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010/R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010/R\u001a\u0010\r\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b*\u00102R\u001a\u0010\u000e\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b&\u00102R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b.\u00104R\u0013\u00107\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b0\u00106¨\u00068"}, d2 = {"Landroidx/work/e;", "", "Landroidx/work/a0;", "requiredNetworkType", "", "requiresCharging", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(Landroidx/work/a0;ZZZ)V", "requiresDeviceIdle", "(Landroidx/work/a0;ZZZZ)V", "", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "Landroidx/work/e$c;", "contentUriTriggers", "(Landroidx/work/a0;ZZZZJJLjava/util/Set;)V", "Ltb/u;", "requiredNetworkRequestCompat", "(Ltb/u;Landroidx/work/a0;ZZZZJJLjava/util/Set;)V", "other", "(Landroidx/work/e;)V", IntegerTokenConverter.CONVERTER_KEY, "()Z", "j", "h", "k", "g", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/work/a0;", "f", "()Landroidx/work/a0;", "b", "Ltb/u;", "e", "()Ltb/u;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "J", "()J", "Ljava/util/Set;", "()Ljava/util/Set;", "Landroid/net/NetworkRequest;", "()Landroid/net/NetworkRequest;", "requiredNetworkRequest", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f14507k = new e(null, false, false, false, 15, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 requiredNetworkType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final NetworkRequestCompat requiredNetworkRequestCompat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresCharging;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresDeviceIdle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresBatteryNotLow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresStorageNotLow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentTriggerUpdateDelayMillis;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentTriggerMaxDelayMillis;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<c> contentUriTriggers;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0007J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0007J\u001f\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010 J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010)R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0016\u0010,\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010+R\u0016\u0010-\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00100¨\u00062"}, d2 = {"Landroidx/work/e$a;", "", "<init>", "()V", "", "requiresCharging", "f", "(Z)Landroidx/work/e$a;", "requiresDeviceIdle", "g", "Landroidx/work/a0;", "networkType", DateTokenConverter.CONVERTER_KEY, "(Landroidx/work/a0;)Landroidx/work/e$a;", "Landroid/net/NetworkRequest;", "networkRequest", "c", "(Landroid/net/NetworkRequest;Landroidx/work/a0;)Landroidx/work/e$a;", "requiresBatteryNotLow", "e", "requiresStorageNotLow", "h", "Landroid/net/Uri;", "uri", "triggerForDescendants", "a", "(Landroid/net/Uri;Z)Landroidx/work/e$a;", "", "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "j", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/e$a;", IntegerTokenConverter.CONVERTER_KEY, "Landroidx/work/e;", "b", "()Landroidx/work/e;", "Z", "Ltb/u;", "Ltb/u;", "requiredNetworkRequest", "Landroidx/work/a0;", "requiredNetworkType", "J", "triggerContentUpdateDelay", "triggerContentMaxDelay", "", "Landroidx/work/e$c;", "Ljava/util/Set;", "contentUriTriggers", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean requiresCharging;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean requiresDeviceIdle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean requiresBatteryNotLow;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean requiresStorageNotLow;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private NetworkRequestCompat requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private a0 requiredNetworkType = a0.NOT_REQUIRED;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private long triggerContentUpdateDelay = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private long triggerContentMaxDelay = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Set<c> contentUriTriggers = new LinkedHashSet();

        public final a a(Uri uri, boolean triggerForDescendants) {
            p013kotlin.jvm.internal.s.k(uri, "uri");
            this.contentUriTriggers.add(new c(uri, triggerForDescendants));
            return this;
        }

        public final e b() {
            Set setR1 = p013kotlin.collections.v.r1(this.contentUriTriggers);
            return new e(this.requiredNetworkRequest, this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, this.triggerContentUpdateDelay, this.triggerContentMaxDelay, setR1);
        }

        public final a c(NetworkRequest networkRequest, a0 networkType) {
            p013kotlin.jvm.internal.s.k(networkRequest, "networkRequest");
            p013kotlin.jvm.internal.s.k(networkType, "networkType");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 28) {
                this.requiredNetworkType = networkType;
                return this;
            }
            if (i11 >= 31 && tb.s.f113097a.a(networkRequest) != null) {
                throw new IllegalArgumentException("NetworkRequests with NetworkSpecifiers set aren't supported.");
            }
            this.requiredNetworkRequest = new NetworkRequestCompat(networkRequest);
            this.requiredNetworkType = a0.NOT_REQUIRED;
            return this;
        }

        public final a d(a0 networkType) {
            p013kotlin.jvm.internal.s.k(networkType, "networkType");
            this.requiredNetworkType = networkType;
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            return this;
        }

        public final a e(boolean requiresBatteryNotLow) {
            this.requiresBatteryNotLow = requiresBatteryNotLow;
            return this;
        }

        public final a f(boolean requiresCharging) {
            this.requiresCharging = requiresCharging;
            return this;
        }

        public final a g(boolean requiresDeviceIdle) {
            this.requiresDeviceIdle = requiresDeviceIdle;
            return this;
        }

        public final a h(boolean requiresStorageNotLow) {
            this.requiresStorageNotLow = requiresStorageNotLow;
            return this;
        }

        public final a i(long duration, TimeUnit timeUnit) {
            p013kotlin.jvm.internal.s.k(timeUnit, "timeUnit");
            this.triggerContentMaxDelay = timeUnit.toMillis(duration);
            return this;
        }

        public final a j(long duration, TimeUnit timeUnit) {
            p013kotlin.jvm.internal.s.k(timeUnit, "timeUnit");
            this.triggerContentUpdateDelay = timeUnit.toMillis(duration);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/work/e$c;", "", "Landroid/net/Uri;", "uri", "", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "b", "Z", "()Z", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Uri uri;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isTriggeredForDescendants;

        public c(Uri uri, boolean z11) {
            p013kotlin.jvm.internal.s.k(uri, "uri");
            this.uri = uri;
            this.isTriggeredForDescendants = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!p013kotlin.jvm.internal.s.f(c.class, other != null ? other.getClass() : null)) {
                return false;
            }
            p013kotlin.jvm.internal.s.i(other, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(this.uri, cVar.uri) && this.isTriggeredForDescendants == cVar.isTriggeredForDescendants;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + Boolean.hashCode(this.isTriggeredForDescendants);
        }
    }

    public /* synthetic */ e(a0 a0Var, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? a0.NOT_REQUIRED : a0Var, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    public final Set<c> c() {
        return this.contentUriTriggers;
    }

    public final NetworkRequest d() {
        return this.requiredNetworkRequestCompat.b();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final NetworkRequestCompat getRequiredNetworkRequestCompat() {
        return this.requiredNetworkRequestCompat;
    }

    @SuppressLint({"NewApi"})
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !p013kotlin.jvm.internal.s.f(e.class, other.getClass())) {
            return false;
        }
        e eVar = (e) other;
        if (this.requiresCharging == eVar.requiresCharging && this.requiresDeviceIdle == eVar.requiresDeviceIdle && this.requiresBatteryNotLow == eVar.requiresBatteryNotLow && this.requiresStorageNotLow == eVar.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == eVar.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == eVar.contentTriggerMaxDelayMillis && p013kotlin.jvm.internal.s.f(d(), eVar.d()) && this.requiredNetworkType == eVar.requiredNetworkType) {
            return p013kotlin.jvm.internal.s.f(this.contentUriTriggers, eVar.contentUriTriggers);
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a0 getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean g() {
        return !this.contentUriTriggers.isEmpty();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRequiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        int iHashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j11 = this.contentTriggerUpdateDelayMillis;
        int i11 = (iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.contentTriggerMaxDelayMillis;
        int iHashCode2 = (((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.contentUriTriggers.hashCode()) * 31;
        NetworkRequest networkRequestD = d();
        return iHashCode2 + (networkRequestD != null ? networkRequestD.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getRequiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getRequiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    @SuppressLint({"NewApi"})
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.requiredNetworkType + ", requiresCharging=" + this.requiresCharging + ", requiresDeviceIdle=" + this.requiresDeviceIdle + ", requiresBatteryNotLow=" + this.requiresBatteryNotLow + ", requiresStorageNotLow=" + this.requiresStorageNotLow + ", contentTriggerUpdateDelayMillis=" + this.contentTriggerUpdateDelayMillis + ", contentTriggerMaxDelayMillis=" + this.contentTriggerMaxDelayMillis + ", contentUriTriggers=" + this.contentUriTriggers + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    public e(a0 requiredNetworkType, boolean z11, boolean z12, boolean z13) {
        this(requiredNetworkType, z11, false, z12, z13);
        p013kotlin.jvm.internal.s.k(requiredNetworkType, "requiredNetworkType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(a0 requiredNetworkType, boolean z11, boolean z12, boolean z13, boolean z14) {
        this(requiredNetworkType, z11, z12, z13, z14, -1L, 0L, null, 192, null);
        p013kotlin.jvm.internal.s.k(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ e(a0 a0Var, boolean z11, boolean z12, boolean z13, boolean z14, long j11, long j12, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? a0.NOT_REQUIRED : a0Var, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? false : z14, (i11 & 32) != 0 ? -1L : j11, (i11 & 64) != 0 ? -1L : j12, (i11 & 128) != 0 ? p013kotlin.collections.d1.d() : set);
    }

    public e(a0 requiredNetworkType, boolean z11, boolean z12, boolean z13, boolean z14, long j11, long j12, Set<c> contentUriTriggers) {
        p013kotlin.jvm.internal.s.k(requiredNetworkType, "requiredNetworkType");
        p013kotlin.jvm.internal.s.k(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkRequestCompat = new NetworkRequestCompat(null, 1, null);
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z11;
        this.requiresDeviceIdle = z12;
        this.requiresBatteryNotLow = z13;
        this.requiresStorageNotLow = z14;
        this.contentTriggerUpdateDelayMillis = j11;
        this.contentTriggerMaxDelayMillis = j12;
        this.contentUriTriggers = contentUriTriggers;
    }

    public e(NetworkRequestCompat requiredNetworkRequestCompat, a0 requiredNetworkType, boolean z11, boolean z12, boolean z13, boolean z14, long j11, long j12, Set<c> contentUriTriggers) {
        p013kotlin.jvm.internal.s.k(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        p013kotlin.jvm.internal.s.k(requiredNetworkType, "requiredNetworkType");
        p013kotlin.jvm.internal.s.k(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkRequestCompat = requiredNetworkRequestCompat;
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z11;
        this.requiresDeviceIdle = z12;
        this.requiresBatteryNotLow = z13;
        this.requiresStorageNotLow = z14;
        this.contentTriggerUpdateDelayMillis = j11;
        this.contentTriggerMaxDelayMillis = j12;
        this.contentUriTriggers = contentUriTriggers;
    }

    @SuppressLint({"NewApi"})
    public e(e other) {
        p013kotlin.jvm.internal.s.k(other, "other");
        this.requiresCharging = other.requiresCharging;
        this.requiresDeviceIdle = other.requiresDeviceIdle;
        this.requiredNetworkRequestCompat = other.requiredNetworkRequestCompat;
        this.requiredNetworkType = other.requiredNetworkType;
        this.requiresBatteryNotLow = other.requiresBatteryNotLow;
        this.requiresStorageNotLow = other.requiresStorageNotLow;
        this.contentUriTriggers = other.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = other.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = other.contentTriggerMaxDelayMillis;
    }
}
