package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import jn0.h0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.a;
import x30.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Li90/w1;", "", "<init>", "()V", "a", "b", "c", "Li90/w1$a;", "Li90/w1$b;", "Li90/w1$c;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class w1 {

    /* JADX INFO: renamed from: i90.w1$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Li90/w1$a;", "Li90/w1;", "Lx30/c;", "title", "", "hide", "Li90/w1$a$a;", "currentItem", "", "items", "<init>", "(Lx30/c;ZLi90/w1$a$a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "()Lx30/c;", "b", "Z", "()Z", "c", "Li90/w1$a$a;", "()Li90/w1$a$a;", "Ljava/util/List;", "()Ljava/util/List;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dropdown extends w1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f77049e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hide;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Item currentItem;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Item> items;

        /* JADX INFO: renamed from: i90.w1$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Li90/w1$a$a;", "Li90/s1;", "", "id", "Lx30/c;", AnnotatedPrivateKey.LABEL, "", "icon", "<init>", "(Ljava/lang/String;Lx30/c;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lx30/c;", "getLabel", "()Lx30/c;", "c", "I", "getIcon", "()Ljava/lang/Integer;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Item implements s1 {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f77054d = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final c label;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int icon;

            public Item(String id2, c label, int i11) {
                s.k(id2, "id");
                s.k(label, "label");
                this.id = id2;
                this.label = label;
                this.icon = i11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Item)) {
                    return false;
                }
                Item item = (Item) other;
                return s.f(this.id, item.id) && s.f(this.label, item.label) && this.icon == item.icon;
            }

            @Override // p010i90.s1
            public Integer getIcon() {
                return Integer.valueOf(this.icon);
            }

            @Override // p010i90.s1
            public c getLabel() {
                return this.label;
            }

            public int hashCode() {
                return (((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.icon);
            }

            public String toString() {
                return "Item(id=" + this.id + ", label=" + this.label + ", icon=" + this.icon + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dropdown(c title, boolean z11, Item currentItem, List<Item> items) {
            super(null);
            s.k(title, "title");
            s.k(currentItem, "currentItem");
            s.k(items, "items");
            this.title = title;
            this.hide = z11;
            this.currentItem = currentItem;
            this.items = items;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Item getCurrentItem() {
            return this.currentItem;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHide() {
            return this.hide;
        }

        public final List<Item> c() {
            return this.items;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dropdown)) {
                return false;
            }
            Dropdown dropdown = (Dropdown) other;
            return s.f(this.title, dropdown.title) && this.hide == dropdown.hide && s.f(this.currentItem, dropdown.currentItem) && s.f(this.items, dropdown.items);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + Boolean.hashCode(this.hide)) * 31) + this.currentItem.hashCode()) * 31) + this.items.hashCode();
        }

        public String toString() {
            return "Dropdown(title=" + this.title + ", hide=" + this.hide + ", currentItem=" + this.currentItem + ", items=" + this.items + ")";
        }
    }

    /* JADX INFO: renamed from: i90.w1$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Li90/w1$b;", "Li90/w1;", "", "Li90/w1$c;", "staticIcons", "animatedIcons", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MultiTrailing extends w1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Trailing> staticIcons;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Trailing> animatedIcons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiTrailing(List<Trailing> staticIcons, List<Trailing> animatedIcons) {
            super(null);
            s.k(staticIcons, "staticIcons");
            s.k(animatedIcons, "animatedIcons");
            this.staticIcons = staticIcons;
            this.animatedIcons = animatedIcons;
        }

        public final List<Trailing> a() {
            return this.animatedIcons;
        }

        public final List<Trailing> b() {
            return this.staticIcons;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiTrailing)) {
                return false;
            }
            MultiTrailing multiTrailing = (MultiTrailing) other;
            return s.f(this.staticIcons, multiTrailing.staticIcons) && s.f(this.animatedIcons, multiTrailing.animatedIcons);
        }

        public int hashCode() {
            return (this.staticIcons.hashCode() * 31) + this.animatedIcons.hashCode();
        }

        public String toString() {
            return "MultiTrailing(staticIcons=" + this.staticIcons + ", animatedIcons=" + this.animatedIcons + ")";
        }
    }

    /* JADX INFO: renamed from: i90.w1$c, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Li90/w1$c;", "Li90/w1;", "", "idRes", "contentDescription", "", "isTintable", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "<init>", "(ILjava/lang/Integer;ZLwn0/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "Lwn0/a;", "()Lwn0/a;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Trailing extends w1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f77060e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int idRes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer contentDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isTintable;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final a<h0> onClick;

        public /* synthetic */ Trailing(int i11, Integer num, boolean z11, a aVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : num, z11, (i12 & 8) != 0 ? null : aVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getContentDescription() {
            return this.contentDescription;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIdRes() {
            return this.idRes;
        }

        public final a<h0> c() {
            return this.onClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsTintable() {
            return this.isTintable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Trailing)) {
                return false;
            }
            Trailing trailing = (Trailing) other;
            return this.idRes == trailing.idRes && s.f(this.contentDescription, trailing.contentDescription) && this.isTintable == trailing.isTintable && s.f(this.onClick, trailing.onClick);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.idRes) * 31;
            Integer num = this.contentDescription;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isTintable)) * 31;
            a<h0> aVar = this.onClick;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "Trailing(idRes=" + this.idRes + ", contentDescription=" + this.contentDescription + ", isTintable=" + this.isTintable + ", onClick=" + this.onClick + ")";
        }

        public Trailing(int i11, Integer num, boolean z11, a<h0> aVar) {
            super(null);
            this.idRes = i11;
            this.contentDescription = num;
            this.isTintable = z11;
            this.onClick = aVar;
        }
    }

    public /* synthetic */ w1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w1() {
    }
}
