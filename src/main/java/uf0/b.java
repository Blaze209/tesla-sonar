package uf0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;
import rf0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Luf0/b;", "", "Lrf0/c;", "audioDevice", "", "b", "(Lrf0/c;)Z", "Luf0/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "a", "(Luf0/b$a;)Z", "stop", "()Z", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
public interface b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Luf0/b$a;", "", "Lrf0/c;", "audioDevice", "Ljn0/h0;", "b", "(Lrf0/c;)V", "a", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public interface a {
        void a(c audioDevice);

        void b(c audioDevice);
    }

    boolean a(a listener);

    boolean b(c audioDevice);

    boolean stop();
}
