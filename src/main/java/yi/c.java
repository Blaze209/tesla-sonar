package yi;

import androidx.media3.exoplayer.source.r;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.brentvatne.exoplayer.w;
import java.util.ArrayList;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p7.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b&\u0010'R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00010(j\b\u0012\u0004\u0012\u00020\u0001`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010,R&\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00040(j\b\u0012\u0004\u0012\u00020\u0004`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*¨\u0006/"}, d2 = {"Lyi/c;", "Lyi/b;", "<init>", "()V", "", "newInstance", "Ljn0/h0;", "k", "(Ljava/lang/Object;)V", "l", "", "id", "player", "g", "(Ljava/lang/String;Ljava/lang/Object;)V", "c", "Lcom/brentvatne/exoplayer/g;", "j", "()Lcom/brentvatne/exoplayer/g;", "Lvi/i;", "source", "Landroidx/media3/exoplayer/drm/i;", "drmSessionManager", "a", "(Lvi/i;Landroidx/media3/exoplayer/drm/i;)Landroidx/media3/exoplayer/drm/i;", "Landroidx/media3/datasource/a$a;", "mediaDataSourceFactory", DateTokenConverter.CONVERTER_KEY, "(Lvi/i;Landroidx/media3/datasource/a$a;)Landroidx/media3/datasource/a$a;", "Landroidx/media3/exoplayer/source/r$a;", "mediaSourceFactory", "b", "(Lvi/i;Landroidx/media3/exoplayer/source/r$a;Landroidx/media3/datasource/a$a;)Landroidx/media3/exoplayer/source/r$a;", "Lp7/y$c;", "mediaItemBuilder", "f", "(Lvi/i;Lp7/y$c;)Lp7/y$c;", "", "e", "(Lvi/i;)Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "pluginList", "Lcom/brentvatne/exoplayer/g;", "customDRMManager", "instanceList", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f125604e;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private com.brentvatne.exoplayer.g customDRMManager;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<b> pluginList = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Object> instanceList = new ArrayList<>();

    /* JADX INFO: renamed from: yi.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyi/c$a;", "", "<init>", "()V", "Lyi/c;", "a", "()Lyi/c;", "", "TAG", "Ljava/lang/String;", "instance", "Lyi/c;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            c cVar;
            c cVar2 = c.f125604e;
            if (cVar2 != null) {
                return cVar2;
            }
            synchronized (this) {
                cVar = c.f125604e;
                if (cVar == null) {
                    cVar = new c();
                    c.f125604e = cVar;
                }
            }
            return cVar;
        }

        private Companion() {
        }
    }

    public final androidx.media3.exoplayer.drm.i a(vi.i source, androidx.media3.exoplayer.drm.i drmSessionManager) {
        androidx.media3.exoplayer.drm.i iVarA;
        s.k(source, "source");
        s.k(drmSessionManager, "drmSessionManager");
        Iterator<b> it = this.pluginList.iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            b next = it.next();
            s.j(next, "next(...)");
            b bVar = next;
            if ((bVar instanceof w) && (iVarA = ((w) bVar).a(source, drmSessionManager)) != null) {
                return iVarA;
            }
        }
        return null;
    }

    public final r.a b(vi.i source, r.a mediaSourceFactory, androidx.media3.datasource.a.InterfaceC0192a mediaDataSourceFactory) {
        r.a aVarB;
        s.k(source, "source");
        s.k(mediaSourceFactory, "mediaSourceFactory");
        s.k(mediaDataSourceFactory, "mediaDataSourceFactory");
        Iterator<b> it = this.pluginList.iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            b next = it.next();
            s.j(next, "next(...)");
            b bVar = next;
            if ((bVar instanceof w) && (aVarB = ((w) bVar).b(source, mediaSourceFactory, mediaDataSourceFactory)) != null) {
                return aVarB;
            }
        }
        return null;
    }

    @Override // yi.b
    public void c(String id2, Object player) {
        s.k(id2, "id");
        s.k(player, "player");
        Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).c(id2, player);
        }
    }

    public final androidx.media3.datasource.a.InterfaceC0192a d(vi.i source, androidx.media3.datasource.a.InterfaceC0192a mediaDataSourceFactory) {
        androidx.media3.datasource.a.InterfaceC0192a interfaceC0192aD;
        s.k(source, "source");
        s.k(mediaDataSourceFactory, "mediaDataSourceFactory");
        Iterator<b> it = this.pluginList.iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            b next = it.next();
            s.j(next, "next(...)");
            b bVar = next;
            if ((bVar instanceof w) && (interfaceC0192aD = ((w) bVar).d(source, mediaDataSourceFactory)) != null) {
                return interfaceC0192aD;
            }
        }
        return null;
    }

    public final boolean e(vi.i source) {
        s.k(source, "source");
        Iterator<b> it = this.pluginList.iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            b next = it.next();
            s.j(next, "next(...)");
            b bVar = next;
            if ((bVar instanceof w) && ((w) bVar).e(source)) {
                return true;
            }
        }
        return false;
    }

    public final y.c f(vi.i source, y.c mediaItemBuilder) {
        y.c cVarF;
        s.k(source, "source");
        s.k(mediaItemBuilder, "mediaItemBuilder");
        Iterator<b> it = this.pluginList.iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            b next = it.next();
            s.j(next, "next(...)");
            b bVar = next;
            if ((bVar instanceof w) && (cVarF = ((w) bVar).f(source, mediaItemBuilder)) != null) {
                return cVarF;
            }
        }
        return null;
    }

    @Override // yi.b
    public void g(String id2, Object player) {
        s.k(id2, "id");
        s.k(player, "player");
        Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).g(id2, player);
        }
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final com.brentvatne.exoplayer.g getCustomDRMManager() {
        return this.customDRMManager;
    }

    public final void k(Object newInstance) {
        s.k(newInstance, "newInstance");
        if (this.instanceList.size() > 2) {
            xi.a.a("ReactNativeVideoManager", "multiple Video displayed ?");
        }
        this.instanceList.add(newInstance);
    }

    public final void l(Object newInstance) {
        s.k(newInstance, "newInstance");
        this.instanceList.remove(newInstance);
    }
}
