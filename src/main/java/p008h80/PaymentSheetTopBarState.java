package p008h80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import f30.d0;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: h80.g0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0016BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u001d\u0010!R\u0011\u0010\"\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012¨\u0006#"}, d2 = {"Lh80/g0;", "", "", "icon", "contentDescription", "", "showTestModeLabel", "showEditMenu", "isEditing", "Lkotlin/Function0;", "Ljn0/h0;", "onEditIconPressed", "<init>", "(IIZZZLwn0/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Z", "f", "()Z", DateTokenConverter.CONVERTER_KEY, "e", "g", "Lwn0/a;", "()Lwn0/a;", "editMenuLabel", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentSheetTopBarState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int contentDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showTestModeLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showEditMenu;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEditing;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<h0> onEditIconPressed;

    /* JADX INFO: renamed from: h80.g0$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lh80/g0$a;", "", "a", "b", "Lh80/g0$a$a;", "Lh80/g0$a$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: h80.g0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lh80/g0$a$a;", "Lh80/g0$a;", "", "isEditing", "canEdit", "Lkotlin/Function0;", "Ljn0/h0;", "onEditIconPressed", "<init>", "(ZZLwn0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lwn0/a;", "()Lwn0/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Maybe implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isEditing;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean canEdit;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<h0> onEditIconPressed;

            public Maybe(boolean z11, boolean z12, wn0.a<h0> onEditIconPressed) {
                s.k(onEditIconPressed, "onEditIconPressed");
                this.isEditing = z11;
                this.canEdit = z12;
                this.onEditIconPressed = onEditIconPressed;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getCanEdit() {
                return this.canEdit;
            }

            public final wn0.a<h0> b() {
                return this.onEditIconPressed;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getIsEditing() {
                return this.isEditing;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Maybe)) {
                    return false;
                }
                Maybe maybe = (Maybe) other;
                return this.isEditing == maybe.isEditing && this.canEdit == maybe.canEdit && s.f(this.onEditIconPressed, maybe.onEditIconPressed);
            }

            public int hashCode() {
                return (((Boolean.hashCode(this.isEditing) * 31) + Boolean.hashCode(this.canEdit)) * 31) + this.onEditIconPressed.hashCode();
            }

            public String toString() {
                return "Maybe(isEditing=" + this.isEditing + ", canEdit=" + this.canEdit + ", onEditIconPressed=" + this.onEditIconPressed + ")";
            }
        }

        /* JADX INFO: renamed from: h80.g0$a$b */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lh80/g0$a$b;", "Lh80/g0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f71083a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 2105449614;
            }

            public String toString() {
                return "Never";
            }
        }
    }

    public PaymentSheetTopBarState(int i11, int i12, boolean z11, boolean z12, boolean z13, wn0.a<h0> onEditIconPressed) {
        s.k(onEditIconPressed, "onEditIconPressed");
        this.icon = i11;
        this.contentDescription = i12;
        this.showTestModeLabel = z11;
        this.showEditMenu = z12;
        this.isEditing = z13;
        this.onEditIconPressed = onEditIconPressed;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getContentDescription() {
        return this.contentDescription;
    }

    public final int b() {
        return this.isEditing ? d0.f63953j0 : d0.f63955k0;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    public final wn0.a<h0> d() {
        return this.onEditIconPressed;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowEditMenu() {
        return this.showEditMenu;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSheetTopBarState)) {
            return false;
        }
        PaymentSheetTopBarState paymentSheetTopBarState = (PaymentSheetTopBarState) other;
        return this.icon == paymentSheetTopBarState.icon && this.contentDescription == paymentSheetTopBarState.contentDescription && this.showTestModeLabel == paymentSheetTopBarState.showTestModeLabel && this.showEditMenu == paymentSheetTopBarState.showEditMenu && this.isEditing == paymentSheetTopBarState.isEditing && s.f(this.onEditIconPressed, paymentSheetTopBarState.onEditIconPressed);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowTestModeLabel() {
        return this.showTestModeLabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.icon) * 31) + Integer.hashCode(this.contentDescription)) * 31) + Boolean.hashCode(this.showTestModeLabel)) * 31) + Boolean.hashCode(this.showEditMenu)) * 31) + Boolean.hashCode(this.isEditing)) * 31) + this.onEditIconPressed.hashCode();
    }

    public String toString() {
        return "PaymentSheetTopBarState(icon=" + this.icon + ", contentDescription=" + this.contentDescription + ", showTestModeLabel=" + this.showTestModeLabel + ", showEditMenu=" + this.showEditMenu + ", isEditing=" + this.isEditing + ", onEditIconPressed=" + this.onEditIconPressed + ")";
    }
}
