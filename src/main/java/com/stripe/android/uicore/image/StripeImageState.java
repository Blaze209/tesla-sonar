package com.stripe.android.uicore.image;

import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageState;", "", "<init>", "()V", "a", "b", "Success", "Lcom/stripe/android/uicore/image/StripeImageState$a;", "Lcom/stripe/android/uicore/image/StripeImageState$b;", "Lcom/stripe/android/uicore/image/StripeImageState$Success;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
abstract class StripeImageState {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageState$Success;", "Lcom/stripe/android/uicore/image/StripeImageState;", "Landroidx/compose/ui/graphics/painter/b;", PlaceTypes.PAINTER, "<init>", "(Landroidx/compose/ui/graphics/painter/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/b;", "a", "()Landroidx/compose/ui/graphics/painter/b;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends StripeImageState {
        private final androidx.compose.ui.graphics.painter.b painter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(androidx.compose.ui.graphics.painter.b painter) {
            super(null);
            s.k(painter, "painter");
            this.painter = painter;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final androidx.compose.ui.graphics.painter.b getPainter() {
            return this.painter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && s.f(this.painter, ((Success) other).painter);
        }

        public int hashCode() {
            return this.painter.hashCode();
        }

        public String toString() {
            return "Success(painter=" + this.painter + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageState$a;", "Lcom/stripe/android/uicore/image/StripeImageState;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends StripeImageState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54353a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageState$b;", "Lcom/stripe/android/uicore/image/StripeImageState;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends StripeImageState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f54354a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ StripeImageState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StripeImageState() {
    }
}
