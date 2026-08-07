package q90;

import k3.q1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lq90/b;", "", "<init>", "()V", "a", "b", "Lq90/b$a;", "Lq90/b$b;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: q90.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lq90/b$a;", "Lq90/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Bitmap extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final android.graphics.Bitmap bitmap;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Bitmap) && s.f(this.bitmap, ((Bitmap) other).bitmap);
        }

        public int hashCode() {
            return this.bitmap.hashCode();
        }

        public String toString() {
            return "Bitmap(bitmap=" + this.bitmap + ")";
        }
    }

    /* JADX INFO: renamed from: q90.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lq90/b$b;", "Lq90/b;", "", "id", "contentDescription", "Lk3/q1;", "colorFilter", "<init>", "(IILk3/q1;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lk3/q1;", "()Lk3/q1;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Drawable extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f105124d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int contentDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1 colorFilter;

        public /* synthetic */ Drawable(int i11, int i12, q1 q1Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, i12, (i13 & 4) != 0 ? null : q1Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q1 getColorFilter() {
            return this.colorFilter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getContentDescription() {
            return this.contentDescription;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Drawable)) {
                return false;
            }
            Drawable drawable = (Drawable) other;
            return this.id == drawable.id && this.contentDescription == drawable.contentDescription && s.f(this.colorFilter, drawable.colorFilter);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.contentDescription)) * 31;
            q1 q1Var = this.colorFilter;
            return iHashCode + (q1Var == null ? 0 : q1Var.hashCode());
        }

        public String toString() {
            return "Drawable(id=" + this.id + ", contentDescription=" + this.contentDescription + ", colorFilter=" + this.colorFilter + ")";
        }

        public Drawable(int i11, int i12, q1 q1Var) {
            super(null);
            this.id = i11;
            this.contentDescription = i12;
            this.colorFilter = q1Var;
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
