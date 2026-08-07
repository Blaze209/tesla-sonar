package sn;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsn/a;", "Lsn/b;", "<init>", "()V", "b", "()Lsn/a;", "Lsn/b$a;", "a", "()Lsn/b$a;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f111450a = new a();

    /* JADX INFO: renamed from: sn.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lsn/a$a;", "Lsn/b$a;", "<init>", "()V", "Landroid/view/Choreographer$FrameCallback;", "callback", "Ljn0/h0;", "b", "(Landroid/view/Choreographer$FrameCallback;)V", "a", "Landroid/view/Choreographer;", "Landroid/view/Choreographer;", "instance", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C2379a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Choreographer instance;

        public C2379a() {
            Choreographer choreographer = Choreographer.getInstance();
            s.j(choreographer, "getInstance(...)");
            this.instance = choreographer;
        }

        @Override // sn.b.a
        public void a(Choreographer.FrameCallback callback) {
            s.k(callback, "callback");
            this.instance.removeFrameCallback(callback);
        }

        @Override // sn.b.a
        public void b(Choreographer.FrameCallback callback) {
            s.k(callback, "callback");
            this.instance.postFrameCallback(callback);
        }
    }

    private a() {
    }

    public static final a b() {
        return f111450a;
    }

    @Override // sn.b
    public b.a a() {
        UiThreadUtil.assertOnUiThread();
        return new C2379a();
    }
}
