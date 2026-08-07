package h20;

import android.content.Context;
import android.os.RemoteException;
import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lh20/f;", "Lr20/b;", "", "installReferrer", "", "referrerClickTimestamp", "installBeginTimestamp", "", "googlePlayInstantParam", "<init>", "(Ljava/lang/String;JJZ)V", "b", "a", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends r20.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f70418c = f.class.getSimpleName();

    /* JADX INFO: renamed from: h20.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lh20/f$a;", "", "<init>", "()V", "", "b", "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Lh20/f;", "Ljn0/h0;", "callback", "a", "(Landroid/content/Context;Lwn0/l;)V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b() {
            return true;
        }

        public final void a(Context context, wn0.l<? super f, h0> callback) {
            s.k(context, "context");
            s.k(callback, "callback");
            if (!b()) {
                callback.invoke(null);
            } else {
                fi.a aVarA = fi.a.b(context).a();
                aVarA.c(new C1460a(aVarA, callback));
            }
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: h20.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"h20/f$a$a", "Lfi/c;", "", "responseCode", "Ljn0/h0;", "a", "(I)V", "b", "()V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C1460a implements fi.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ fi.a f70419a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ wn0.l<f, h0> f70420b;

            /* JADX WARN: Multi-variable type inference failed */
            C1460a(fi.a aVar, wn0.l<? super f, h0> lVar) {
                this.f70419a = aVar;
                this.f70420b = lVar;
            }

            @Override // fi.c
            public void a(int responseCode) {
                if (responseCode != 0) {
                    if (responseCode == 1) {
                        String TAG = f.f70418c;
                        s.j(TAG, "TAG");
                        g.a(TAG, "Install referrer API connection couldn't be established.", new Object[0]);
                        this.f70420b.invoke(null);
                        return;
                    }
                    if (responseCode != 2) {
                        return;
                    }
                    String TAG2 = f.f70418c;
                    s.j(TAG2, "TAG");
                    g.a(TAG2, "Install referrer API not available on the current Play Store app.", new Object[0]);
                    this.f70420b.invoke(null);
                    return;
                }
                try {
                    fi.d dVarA = this.f70419a.a();
                    s.j(dVarA, "referrerClient.installReferrer");
                    String strC = dVarA.c();
                    s.j(strC, "response.installReferrer");
                    this.f70420b.invoke(new f(strC, dVarA.d(), dVarA.b(), dVarA.a()));
                } catch (RemoteException unused) {
                    String TAG3 = f.f70418c;
                    s.j(TAG3, "TAG");
                    g.a(TAG3, "Install referrer API remote exception.", new Object[0]);
                    this.f70420b.invoke(null);
                } catch (NoSuchMethodError unused2) {
                    String TAG4 = f.f70418c;
                    s.j(TAG4, "TAG");
                    g.a(TAG4, "Upgrade InstallReferrer package to v1.1 or higher to add the install referrer details entity.", new Object[0]);
                    this.f70420b.invoke(null);
                }
            }

            @Override // fi.c
            public void b() {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String installReferrer, long j11, long j12, boolean z11) {
        super("iglu:com.android.installreferrer.api/referrer_details/jsonschema/1-0-0", v0.m(x.a("installReferrer", installReferrer), x.a("referrerClickTimestamp", j11 > 0 ? i20.c.f(j11) : null), x.a("installBeginTimestamp", j12 > 0 ? i20.c.f(j12) : null), x.a("googlePlayInstantParam", Boolean.valueOf(z11))));
        s.k(installReferrer, "installReferrer");
    }
}
