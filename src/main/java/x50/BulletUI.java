package x50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.Image;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import v50.f;
import v50.g;

/* JADX INFO: renamed from: x50.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lx50/a;", "", "Lv50/g;", "title", "content", "Lv50/f;", "imageResource", "<init>", "(Lv50/g;Lv50/g;Lv50/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv50/g;", "c", "()Lv50/g;", "b", "Lv50/f;", "()Lv50/f;", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BulletUI {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final g title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final g content;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f imageResource;

    /* JADX INFO: renamed from: x50.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx50/a$a;", "", "<init>", "()V", "Lcom/stripe/android/financialconnections/model/e;", "bullet", "Lx50/a;", "a", "(Lcom/stripe/android/financialconnections/model/e;)Lx50/a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BulletUI a(Bullet bullet) {
            String str;
            s.k(bullet, "bullet");
            Image icon = bullet.getIcon();
            f.Network network = (icon == null || (str = icon.getDefault()) == null) ? null : new f.Network(str);
            String title = bullet.getTitle();
            g.Text text = title != null ? new g.Text(b.a(title)) : null;
            String content = bullet.getContent();
            return new BulletUI(text, content != null ? new g.Text(b.a(content)) : null, network);
        }

        private Companion() {
        }
    }

    public BulletUI(g gVar, g gVar2, f fVar) {
        this.title = gVar;
        this.content = gVar2;
        this.imageResource = fVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getImageResource() {
        return this.imageResource;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulletUI)) {
            return false;
        }
        BulletUI bulletUI = (BulletUI) other;
        return s.f(this.title, bulletUI.title) && s.f(this.content, bulletUI.content) && s.f(this.imageResource, bulletUI.imageResource);
    }

    public int hashCode() {
        g gVar = this.title;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        g gVar2 = this.content;
        int iHashCode2 = (iHashCode + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
        f fVar = this.imageResource;
        return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "BulletUI(title=" + this.title + ", content=" + this.content + ", imageResource=" + this.imageResource + ")";
    }
}
