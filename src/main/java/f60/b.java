package f60;

import c60.LinkConfiguration;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8 X \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8 X \u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lf60/b;", "", "<init>", "()V", "Ld60/c;", "c", "()Ld60/c;", "linkAccountManager", "Lc60/c;", "a", "()Lc60/c;", "configuration", "Lf60/c;", "b", "()Lf60/c;", "inlineSignupViewModelFactory", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf60/b$a;", "", "Lc60/c;", "configuration", "a", "(Lc60/c;)Lf60/b$a;", "Lf60/b;", "build", "()Lf60/b;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(LinkConfiguration configuration);

        b build();
    }

    public abstract LinkConfiguration a();

    public abstract c b();

    public abstract d60.c c();
}
