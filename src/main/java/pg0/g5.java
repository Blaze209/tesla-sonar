package pg0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import ezvcard.property.Gender;
import java.io.File;
import java.util.List;
import oi0.Option;
import oi0.RemoteImageComponent;
import org.webrtc.PeerConnectionFactory;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import sg0.CaptureTipsViewModel;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lpg0/g5;", "", "<init>", "()V", "c", "b", DateTokenConverter.CONVERTER_KEY, "e", "f", "a", "Lpg0/g5$a;", "Lpg0/g5$b;", "Lpg0/g5$c;", "Lpg0/g5$e;", "Lpg0/g5$f;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class g5 {

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B«\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b(\u00100R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b4\u00103R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0006¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b.\u00106R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b)\u00106R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0006¢\u0006\f\n\u0004\b,\u00105\u001a\u0004\b*\u00106¨\u00067"}, d2 = {"Lpg0/g5$a;", "Lpg0/g5;", "", "title", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Loi0/c2;", "countrySelectComponent", "idClassSelectComponent", "countryInputTitle", "idClassInputTitle", "continueButtonText", "", "isContinueEnabled", "Lii0/a;", "navigationState", "Lkotlin/Function1;", "Loi0/e4;", "Ljn0/h0;", "onCountrySelected", "onIdClassSelected", "Lkotlin/Function0;", "onContinueClick", "onBackClick", "onCancelClick", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Loi0/c2;Loi0/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLii0/a;Lwn0/l;Lwn0/l;Lwn0/a;Lwn0/a;Lwn0/a;)V", "a", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "l", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "c", "Loi0/c2;", "()Loi0/c2;", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "Z", "n", "()Z", IntegerTokenConverter.CONVERTER_KEY, "Lii0/a;", "()Lii0/a;", "j", "Lwn0/l;", "()Lwn0/l;", "k", "Lwn0/a;", "()Lwn0/a;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends g5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final oi0.c2 countrySelectComponent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final oi0.c2 idClassSelectComponent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String countryInputTitle;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String idClassInputTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String continueButtonText;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean isContinueEnabled;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final ii0.a navigationState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final wn0.l<Option, jn0.h0> onCountrySelected;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final wn0.l<Option, jn0.h0> onIdClassSelected;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> onContinueClick;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> onBackClick;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> onCancelClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, oi0.c2 countrySelectComponent, oi0.c2 idClassSelectComponent, String str2, String str3, String str4, boolean z11, ii0.a navigationState, wn0.l<? super Option, jn0.h0> onCountrySelected, wn0.l<? super Option, jn0.h0> onIdClassSelected, wn0.a<jn0.h0> onContinueClick, wn0.a<jn0.h0> onBackClick, wn0.a<jn0.h0> onCancelClick) {
            super(null);
            p013kotlin.jvm.internal.s.k(countrySelectComponent, "countrySelectComponent");
            p013kotlin.jvm.internal.s.k(idClassSelectComponent, "idClassSelectComponent");
            p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
            p013kotlin.jvm.internal.s.k(onCountrySelected, "onCountrySelected");
            p013kotlin.jvm.internal.s.k(onIdClassSelected, "onIdClassSelected");
            p013kotlin.jvm.internal.s.k(onContinueClick, "onContinueClick");
            p013kotlin.jvm.internal.s.k(onBackClick, "onBackClick");
            p013kotlin.jvm.internal.s.k(onCancelClick, "onCancelClick");
            this.title = str;
            this.styles = governmentIdStepStyle;
            this.countrySelectComponent = countrySelectComponent;
            this.idClassSelectComponent = idClassSelectComponent;
            this.countryInputTitle = str2;
            this.idClassInputTitle = str3;
            this.continueButtonText = str4;
            this.isContinueEnabled = z11;
            this.navigationState = navigationState;
            this.onCountrySelected = onCountrySelected;
            this.onIdClassSelected = onIdClassSelected;
            this.onContinueClick = onContinueClick;
            this.onBackClick = onBackClick;
            this.onCancelClick = onCancelClick;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContinueButtonText() {
            return this.continueButtonText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCountryInputTitle() {
            return this.countryInputTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final oi0.c2 getCountrySelectComponent() {
            return this.countrySelectComponent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getIdClassInputTitle() {
            return this.idClassInputTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final oi0.c2 getIdClassSelectComponent() {
            return this.idClassSelectComponent;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ii0.a getNavigationState() {
            return this.navigationState;
        }

        public final wn0.a<jn0.h0> g() {
            return this.onBackClick;
        }

        public final wn0.a<jn0.h0> h() {
            return this.onCancelClick;
        }

        public final wn0.a<jn0.h0> i() {
            return this.onContinueClick;
        }

        public final wn0.l<Option, jn0.h0> j() {
            return this.onCountrySelected;
        }

        public final wn0.l<Option, jn0.h0> k() {
            return this.onIdClassSelected;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getIsContinueEnabled() {
            return this.isContinueEnabled;
        }
    }

    @Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bP\u0018\u00002\u00020\u0001:\u0001CBÇ\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012 \b\u0002\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012 \b\u0002\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130#\u0012\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130#j\u0002`&\u0012\u0006\u0010(\u001a\u00020\u001e\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010-\u001a\u00020\u0018\u0012\u001a\b\u0002\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\b\u0002\u00100\u001a\u00020\u0018\u0012\b\b\u0002\u00102\u001a\u000201\u0012\b\b\u0002\u00103\u001a\u00020\u0018\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\u0006\u0010;\u001a\u00020\u0018\u0012\u0006\u0010<\u001a\u00020\u0018\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010FR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R/\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00108\u0006¢\u0006\f\n\u0004\bM\u0010_\u001a\u0004\b`\u0010aR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158\u0006¢\u0006\f\n\u0004\bY\u0010b\u001a\u0004\bc\u0010dR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158\u0006¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bS\u0010dR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bO\u0010hR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00118\u0006¢\u0006\f\n\u0004\bc\u0010i\u001a\u0004\bI\u0010jR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bJ\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bK\u0010pR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR/\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00108\u0006¢\u0006\f\n\u0004\bu\u0010_\u001a\u0004\bG\u0010aR#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130#8\u0006¢\u0006\f\n\u0004\bU\u0010v\u001a\u0004\bw\u0010xR'\u0010'\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130#j\u0002`&8\u0006¢\u0006\f\n\u0004\by\u0010v\u001a\u0004\bz\u0010xR\u0017\u0010(\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b`\u0010o\u001a\u0004\b{\u0010pR\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158\u0006¢\u0006\f\n\u0004\b|\u0010b\u001a\u0004\by\u0010dR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158\u0006¢\u0006\f\n\u0004\bH\u0010b\u001a\u0004\bf\u0010dR\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b]\u0010}\u001a\u0004\b~\u0010\u007fR\u0017\u0010-\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bz\u0010g\u001a\u0004\bq\u0010hR*\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00108\u0006¢\u0006\r\n\u0004\bw\u0010_\u001a\u0005\b\u0080\u0001\u0010aR\u0018\u00100\u001a\u00020\u00188\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010g\u001a\u0004\bn\u0010hR\u0019\u00102\u001a\u0002018\u0006¢\u0006\u000e\n\u0005\bQ\u0010\u0081\u0001\u001a\u0005\b|\u0010\u0082\u0001R\u0018\u00103\u001a\u00020\u00188\u0006¢\u0006\r\n\u0004\b{\u0010g\u001a\u0005\b\u0083\u0001\u0010hR\u001a\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0083\u0001\u0010D\u001a\u0004\bu\u0010FR\u001b\u00106\u001a\u0004\u0018\u0001058\u0006¢\u0006\u000e\n\u0005\bl\u0010\u0084\u0001\u001a\u0005\be\u0010\u0085\u0001R\u001c\u00108\u001a\u0004\u0018\u0001078\u0006¢\u0006\u000f\n\u0005\bs\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010:\u001a\u0004\u0018\u0001098\u0006¢\u0006\u000e\n\u0005\bE\u0010\u0089\u0001\u001a\u0005\bC\u0010\u008a\u0001R\u0018\u0010;\u001a\u00020\u00188\u0006¢\u0006\r\n\u0004\b~\u0010g\u001a\u0005\b\u0081\u0001\u0010hR\u0018\u0010<\u001a\u00020\u00188\u0006¢\u0006\r\n\u0005\b\u0087\u0001\u0010g\u001a\u0004\bo\u0010hR\u0019\u0010>\u001a\u00020=8\u0006¢\u0006\u000e\n\u0005\bo\u0010\u008b\u0001\u001a\u0005\b[\u0010\u008c\u0001R\u001a\u0010@\u001a\u00020?8\u0006¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u008d\u0001\u001a\u0005\bW\u0010\u008e\u0001¨\u0006\u008f\u0001"}, d2 = {"Lpg0/g5$b;", "Lpg0/g5;", "", "title", "message", "disclaimer", "Lpg0/g5$b$a;", "captureButtonState", "Lpg0/g5$d;", "overlay", "Lwg0/e;", "idClass", "Lpg0/d4$e;", "captureSide", "Lii0/a;", "navigationState", "Lkotlin/Function2;", "", "Lzf0/u;", "Ljn0/h0;", "manuallyCapture", "Lkotlin/Function0;", "close", "back", "", "autoCapturing", "Lzf0/e;", "autoCaptureRules", "Lpg0/n1;", "state", "", "autoCaptureRulesId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "autoCapture", "Lkotlin/Function1;", "", "onCaptureError", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "onCameraError", "remainingCaptureCount", "manualCaptureClicked", "checkPermissions", "Lfg0/a;", "videoCaptureMethod", "finalizeLocalVideo", "Ljava/io/File;", "onLocalVideoFinalized", "enableAnalyzer", "", "maxRecordingLengthMs", "showFinalizeUi", "hintText", "Lsg0/h;", "captureTips", "Lej0/a;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "isEnabled", "isAudioRequired", "Lzf0/y$a;", "cameraXControllerFactory", "Lbg0/e$a;", "camera2ManagerFactoryFactory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpg0/g5$b$a;Lpg0/g5$d;Lwg0/e;Lpg0/d4$e;Lii0/a;Lwn0/p;Lwn0/a;Lwn0/a;ZLjava/util/List;Lpg0/n1;ILcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lwn0/p;Lwn0/l;Lwn0/l;ILwn0/a;Lwn0/a;Lfg0/a;ZLwn0/p;ZJZLjava/lang/String;Lsg0/h;Lej0/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLzf0/y$a;Lbg0/e$a;)V", "a", "Ljava/lang/String;", Gender.FEMALE, "()Ljava/lang/String;", "b", "v", "c", "n", DateTokenConverter.CONVERTER_KEY, "Lpg0/g5$b$a;", IntegerTokenConverter.CONVERTER_KEY, "()Lpg0/g5$b$a;", "e", "Lpg0/g5$d;", "A", "()Lpg0/g5$d;", "f", "Lwg0/e;", "r", "()Lwg0/e;", "g", "Lpg0/d4$e;", "j", "()Lpg0/d4$e;", "h", "Lii0/a;", "w", "()Lii0/a;", "Lwn0/p;", "t", "()Lwn0/p;", "Lwn0/a;", "m", "()Lwn0/a;", "k", "l", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "Lpg0/n1;", "D", "()Lpg0/n1;", "o", "I", "()I", "p", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "E", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "q", "Lwn0/l;", "y", "()Lwn0/l;", "s", "x", "B", "u", "Lfg0/a;", "G", "()Lfg0/a;", "z", "J", "()J", "C", "Lsg0/h;", "()Lsg0/h;", "Lej0/a;", "H", "()Lej0/a;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Lzf0/y$a;", "()Lzf0/y$a;", "Lbg0/e$a;", "()Lbg0/e$a;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends g5 {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private final long maxRecordingLengthMs;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private final boolean showFinalizeUi;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private final String hintText;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        private final CaptureTipsViewModel captureTips;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        private final ej0.a webRtcManager;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final boolean isEnabled;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        private final boolean isAudioRequired;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        private final zf0.y.a cameraXControllerFactory;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        private final bg0.e.a camera2ManagerFactoryFactory;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String disclaimer;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final a captureButtonState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final d overlay;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final wg0.e idClass;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final IdConfig.e captureSide;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final ii0.a navigationState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final wn0.p<List<String>, zf0.u, jn0.h0> manuallyCapture;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> close;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> back;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final boolean autoCapturing;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final List<zf0.e> autoCaptureRules;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final n1 state;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final int autoCaptureRulesId;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final wn0.p<List<String>, zf0.u, jn0.h0> autoCapture;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final wn0.l<Throwable, jn0.h0> onCaptureError;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final wn0.l<Throwable, jn0.h0> onCameraError;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final int remainingCaptureCount;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> manualCaptureClicked;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> checkPermissions;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private final fg0.a videoCaptureMethod;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private final boolean finalizeLocalVideo;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private final wn0.p<File, zf0.u, jn0.h0> onLocalVideoFinalized;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private final boolean enableAnalyzer;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lpg0/g5$b$a;", "", "<init>", "(Ljava/lang/String;I)V", "Disabled", PeerConnectionFactory.TRIAL_ENABLED, "Hidden", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum a {
            Disabled,
            Enabled,
            Hidden;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String title, String message, String disclaimer, a captureButtonState, d overlay, wg0.e idClass, IdConfig.e captureSide, ii0.a navigationState, wn0.p<? super List<String>, ? super zf0.u, jn0.h0> manuallyCapture, wn0.a<jn0.h0> close, wn0.a<jn0.h0> back, boolean z11, List<? extends zf0.e> autoCaptureRules, n1 state, int i11, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, wn0.p<? super List<String>, ? super zf0.u, jn0.h0> autoCapture, wn0.l<? super Throwable, jn0.h0> onCaptureError, wn0.l<? super Throwable, jn0.h0> onCameraError, int i12, wn0.a<jn0.h0> manualCaptureClicked, wn0.a<jn0.h0> checkPermissions, fg0.a videoCaptureMethod, boolean z12, wn0.p<? super File, ? super zf0.u, jn0.h0> onLocalVideoFinalized, boolean z13, long j11, boolean z14, String str, CaptureTipsViewModel hVar, ej0.a aVar, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z15, boolean z16, zf0.y.a cameraXControllerFactory, bg0.e.a camera2ManagerFactoryFactory) {
            super(null);
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(message, "message");
            p013kotlin.jvm.internal.s.k(disclaimer, "disclaimer");
            p013kotlin.jvm.internal.s.k(captureButtonState, "captureButtonState");
            p013kotlin.jvm.internal.s.k(overlay, "overlay");
            p013kotlin.jvm.internal.s.k(idClass, "idClass");
            p013kotlin.jvm.internal.s.k(captureSide, "captureSide");
            p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
            p013kotlin.jvm.internal.s.k(manuallyCapture, "manuallyCapture");
            p013kotlin.jvm.internal.s.k(close, "close");
            p013kotlin.jvm.internal.s.k(back, "back");
            p013kotlin.jvm.internal.s.k(autoCaptureRules, "autoCaptureRules");
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(autoCapture, "autoCapture");
            p013kotlin.jvm.internal.s.k(onCaptureError, "onCaptureError");
            p013kotlin.jvm.internal.s.k(onCameraError, "onCameraError");
            p013kotlin.jvm.internal.s.k(manualCaptureClicked, "manualCaptureClicked");
            p013kotlin.jvm.internal.s.k(checkPermissions, "checkPermissions");
            p013kotlin.jvm.internal.s.k(videoCaptureMethod, "videoCaptureMethod");
            p013kotlin.jvm.internal.s.k(onLocalVideoFinalized, "onLocalVideoFinalized");
            p013kotlin.jvm.internal.s.k(cameraXControllerFactory, "cameraXControllerFactory");
            p013kotlin.jvm.internal.s.k(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
            this.title = title;
            this.message = message;
            this.disclaimer = disclaimer;
            this.captureButtonState = captureButtonState;
            this.overlay = overlay;
            this.idClass = idClass;
            this.captureSide = captureSide;
            this.navigationState = navigationState;
            this.manuallyCapture = manuallyCapture;
            this.close = close;
            this.back = back;
            this.autoCapturing = z11;
            this.autoCaptureRules = autoCaptureRules;
            this.state = state;
            this.autoCaptureRulesId = i11;
            this.styles = governmentIdStepStyle;
            this.autoCapture = autoCapture;
            this.onCaptureError = onCaptureError;
            this.onCameraError = onCameraError;
            this.remainingCaptureCount = i12;
            this.manualCaptureClicked = manualCaptureClicked;
            this.checkPermissions = checkPermissions;
            this.videoCaptureMethod = videoCaptureMethod;
            this.finalizeLocalVideo = z12;
            this.onLocalVideoFinalized = onLocalVideoFinalized;
            this.enableAnalyzer = z13;
            this.maxRecordingLengthMs = j11;
            this.showFinalizeUi = z14;
            this.hintText = str;
            this.captureTips = hVar;
            this.webRtcManager = aVar;
            this.assetConfig = capturePage;
            this.isEnabled = z15;
            this.isAudioRequired = z16;
            this.cameraXControllerFactory = cameraXControllerFactory;
            this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final d getOverlay() {
            return this.overlay;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final int getRemainingCaptureCount() {
            return this.remainingCaptureCount;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getShowFinalizeUi() {
            return this.showFinalizeUi;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final n1 getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final fg0.a getVideoCaptureMethod() {
            return this.videoCaptureMethod;
        }

        /* JADX INFO: renamed from: H, reason: from getter */
        public final ej0.a getWebRtcManager() {
            return this.webRtcManager;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final boolean getIsAudioRequired() {
            return this.isAudioRequired;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.CapturePage getAssetConfig() {
            return this.assetConfig;
        }

        public final wn0.p<List<String>, zf0.u, jn0.h0> b() {
            return this.autoCapture;
        }

        public final List<zf0.e> c() {
            return this.autoCaptureRules;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getAutoCaptureRulesId() {
            return this.autoCaptureRulesId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getAutoCapturing() {
            return this.autoCapturing;
        }

        public final wn0.a<jn0.h0> f() {
            return this.back;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final bg0.e.a getCamera2ManagerFactoryFactory() {
            return this.camera2ManagerFactoryFactory;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final zf0.y.a getCameraXControllerFactory() {
            return this.cameraXControllerFactory;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final a getCaptureButtonState() {
            return this.captureButtonState;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final IdConfig.e getCaptureSide() {
            return this.captureSide;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final CaptureTipsViewModel getCaptureTips() {
            return this.captureTips;
        }

        public final wn0.a<jn0.h0> l() {
            return this.checkPermissions;
        }

        public final wn0.a<jn0.h0> m() {
            return this.close;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getEnableAnalyzer() {
            return this.enableAnalyzer;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getFinalizeLocalVideo() {
            return this.finalizeLocalVideo;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getHintText() {
            return this.hintText;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final wg0.e getIdClass() {
            return this.idClass;
        }

        public final wn0.a<jn0.h0> s() {
            return this.manualCaptureClicked;
        }

        public final wn0.p<List<String>, zf0.u, jn0.h0> t() {
            return this.manuallyCapture;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final long getMaxRecordingLengthMs() {
            return this.maxRecordingLengthMs;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final ii0.a getNavigationState() {
            return this.navigationState;
        }

        public final wn0.l<Throwable, jn0.h0> x() {
            return this.onCameraError;
        }

        public final wn0.l<Throwable, jn0.h0> y() {
            return this.onCaptureError;
        }

        public final wn0.p<File, zf0.u, jn0.h0> z() {
            return this.onLocalVideoFinalized;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\u001d\u00105R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\"\u00106\u001a\u0004\b7\u00108R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b+\u0010:R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b1\u00109\u001a\u0004\b/\u0010:R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b%\u0010 R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b3\u0010:¨\u0006;"}, d2 = {"Lpg0/g5$c;", "Lpg0/g5;", "", "title", "prompt", "chooseText", "disclaimer", "", "Lpg0/b0;", "enabledIdClasses", "Lii0/a;", "navigationState", "Lkotlin/Function1;", "Lpg0/d4;", "Ljn0/h0;", "selectIdClass", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "assetConfig", "", "isEnabled", "Lkotlin/Function0;", "onBack", "onCancel", AnalyticsAttribute.Error, "onErrorDismissed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lii0/a;Lwn0/l;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;ZLwn0/a;Lwn0/a;Ljava/lang/String;Lwn0/a;)V", "a", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "b", "j", "c", DateTokenConverter.CONVERTER_KEY, "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lii0/a;", "()Lii0/a;", "g", "Lwn0/l;", "k", "()Lwn0/l;", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "l", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "Z", "n", "()Z", "Lwn0/a;", "()Lwn0/a;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends g5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String prompt;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String chooseText;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String disclaimer;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<EnabledIdClass> enabledIdClasses;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final ii0.a navigationState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final wn0.l<IdConfig, jn0.h0> selectIdClass;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final boolean isEnabled;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> onBack;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> onCancel;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final String error;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> onErrorDismissed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String title, String prompt, String chooseText, String disclaimer, List<EnabledIdClass> enabledIdClasses, ii0.a navigationState, wn0.l<? super IdConfig, jn0.h0> selectIdClass, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, boolean z11, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel, String str, wn0.a<jn0.h0> onErrorDismissed) {
            super(null);
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(prompt, "prompt");
            p013kotlin.jvm.internal.s.k(chooseText, "chooseText");
            p013kotlin.jvm.internal.s.k(disclaimer, "disclaimer");
            p013kotlin.jvm.internal.s.k(enabledIdClasses, "enabledIdClasses");
            p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
            p013kotlin.jvm.internal.s.k(selectIdClass, "selectIdClass");
            p013kotlin.jvm.internal.s.k(onBack, "onBack");
            p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
            p013kotlin.jvm.internal.s.k(onErrorDismissed, "onErrorDismissed");
            this.title = title;
            this.prompt = prompt;
            this.chooseText = chooseText;
            this.disclaimer = disclaimer;
            this.enabledIdClasses = enabledIdClasses;
            this.navigationState = navigationState;
            this.selectIdClass = selectIdClass;
            this.styles = governmentIdStepStyle;
            this.assetConfig = selectPage;
            this.isEnabled = z11;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.error = str;
            this.onErrorDismissed = onErrorDismissed;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.SelectPage getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getChooseText() {
            return this.chooseText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final List<EnabledIdClass> d() {
            return this.enabledIdClasses;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ii0.a getNavigationState() {
            return this.navigationState;
        }

        public final wn0.a<jn0.h0> g() {
            return this.onBack;
        }

        public final wn0.a<jn0.h0> h() {
            return this.onCancel;
        }

        public final wn0.a<jn0.h0> i() {
            return this.onErrorDismissed;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getPrompt() {
            return this.prompt;
        }

        public final wn0.l<IdConfig, jn0.h0> k() {
            return this.selectIdClass;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lpg0/g5$d;", "Landroid/os/Parcelable;", "<init>", "()V", "f", "e", "a", "b", DateTokenConverter.CONVERTER_KEY, "c", "Lpg0/g5$d$a;", "Lpg0/g5$d$b;", "Lpg0/g5$d$c;", "Lpg0/g5$d$d;", "Lpg0/g5$d$e;", "Lpg0/g5$d$f;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class d implements Parcelable {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpg0/g5$d$a;", "Lpg0/g5$d;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f102493a = new a();
            public static final Parcelable.Creator<a> CREATOR = new C2177a();

            /* JADX INFO: renamed from: pg0.g5$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2177a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return a.f102493a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            private a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1779545178;
            }

            public String toString() {
                return "Barcode";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpg0/g5$d$b;", "Lpg0/g5$d;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f102494a = new b();
            public static final Parcelable.Creator<b> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return b.f102494a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            private b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1450323044;
            }

            public String toString() {
                return "CornersOnly";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpg0/g5$d$c;", "Lpg0/g5$d;", "Loi0/l4;", "customImage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "config", "<init>", "(Loi0/l4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Loi0/l4;", "b", "()Loi0/l4;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends d {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final RemoteImageComponent customImage;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final RemoteImage config;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new c((RemoteImageComponent) parcel.readParcelable(c.class.getClassLoader()), (RemoteImage) parcel.readParcelable(c.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i11) {
                    return new c[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(RemoteImageComponent customImage, RemoteImage config) {
                super(null);
                p013kotlin.jvm.internal.s.k(customImage, "customImage");
                p013kotlin.jvm.internal.s.k(config, "config");
                this.customImage = customImage;
                this.config = config;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final RemoteImage getConfig() {
                return this.config;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final RemoteImageComponent getCustomImage() {
                return this.customImage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeParcelable(this.customImage, flags);
                dest.writeParcelable(this.config, flags);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public c(RemoteImage config) {
                this(new RemoteImageComponent(config), config);
                p013kotlin.jvm.internal.s.k(config, "config");
            }
        }

        /* JADX INFO: renamed from: pg0.g5$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpg0/g5$d$d;", "Lpg0/g5$d;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C2178d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2178d f102497a = new C2178d();
            public static final Parcelable.Creator<C2178d> CREATOR = new a();

            /* JADX INFO: renamed from: pg0.g5$d$d$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<C2178d> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C2178d createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return C2178d.f102497a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C2178d[] newArray(int i11) {
                    return new C2178d[i11];
                }
            }

            private C2178d() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2178d);
            }

            public int hashCode() {
                return 212467448;
            }

            public String toString() {
                return "GenericFront";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpg0/g5$d$e;", "Lpg0/g5$d;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f102498a = new e();
            public static final Parcelable.Creator<e> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<e> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return e.f102498a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i11) {
                    return new e[i11];
                }
            }

            private e() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1995687048;
            }

            public String toString() {
                return "Passport";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpg0/g5$d$f;", "Lpg0/g5$d;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f102499a = new f();
            public static final Parcelable.Creator<f> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<f> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return f.f102499a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i11) {
                    return new f[i11];
                }
            }

            private f() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return 319154889;
            }

            public String toString() {
                return "Rectangle";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b/\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b9\u0010?\u001a\u0004\b%\u0010@R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b)\u0010,R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\bA\u0010@R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\bB\u0010,R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010*\u001a\u0004\b5\u0010,R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\b3\u0010@R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b1\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\b;\u0010,R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010@R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b-\u0010IR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010 \u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bM\u0010LR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bK\u0010N\u001a\u0004\bG\u0010O¨\u0006P"}, d2 = {"Lpg0/g5$e;", "Lpg0/g5;", "Lec/r;", "imageLoader", "", "message", "disclaimer", "Lpg0/g5$d;", "overlay", "imagePath", "Lpg0/d4$e;", "captureSide", "Lwg0/e;", "idClass", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "acceptImage", "acceptText", "retryImage", "retryText", "confirmCaptureTitle", "close", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", AnalyticsAttribute.Error, "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "", "isEnabled", "isAutoClassifying", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "<init>", "(Lec/r;Ljava/lang/String;Ljava/lang/String;Lpg0/g5$d;Ljava/lang/String;Lpg0/d4$e;Lwg0/e;Lii0/a;Lwn0/a;Ljava/lang/String;Lwn0/a;Ljava/lang/String;Ljava/lang/String;Lwn0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lwn0/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;)V", "a", "Lec/r;", "j", "()Lec/r;", "b", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "c", "g", DateTokenConverter.CONVERTER_KEY, "Lpg0/g5$d;", "o", "()Lpg0/g5$d;", "e", "k", "f", "Lpg0/d4$e;", "()Lpg0/d4$e;", "Lwg0/e;", IntegerTokenConverter.CONVERTER_KEY, "()Lwg0/e;", "h", "Lii0/a;", "m", "()Lii0/a;", "Lwn0/a;", "()Lwn0/a;", "p", "q", "n", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "s", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "r", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Z", "u", "()Z", "t", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends g5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ec.r imageLoader;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String disclaimer;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final d overlay;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String imagePath;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final IdConfig.e captureSide;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final wg0.e idClass;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final ii0.a navigationState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> acceptImage;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final String acceptText;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> retryImage;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final String retryText;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final String confirmCaptureTitle;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> close;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final String error;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> onErrorDismissed;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final boolean isEnabled;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final boolean isAutoClassifying;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final StyleElements.Axis reviewCaptureButtonsAxis;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ec.r imageLoader, String message, String disclaimer, d overlay, String imagePath, IdConfig.e captureSide, wg0.e idClass, ii0.a navigationState, wn0.a<jn0.h0> acceptImage, String acceptText, wn0.a<jn0.h0> retryImage, String retryText, String confirmCaptureTitle, wn0.a<jn0.h0> close, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, String str, wn0.a<jn0.h0> onErrorDismissed, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z11, boolean z12, StyleElements.Axis reviewCaptureButtonsAxis) {
            super(null);
            p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
            p013kotlin.jvm.internal.s.k(message, "message");
            p013kotlin.jvm.internal.s.k(disclaimer, "disclaimer");
            p013kotlin.jvm.internal.s.k(overlay, "overlay");
            p013kotlin.jvm.internal.s.k(imagePath, "imagePath");
            p013kotlin.jvm.internal.s.k(captureSide, "captureSide");
            p013kotlin.jvm.internal.s.k(idClass, "idClass");
            p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
            p013kotlin.jvm.internal.s.k(acceptImage, "acceptImage");
            p013kotlin.jvm.internal.s.k(acceptText, "acceptText");
            p013kotlin.jvm.internal.s.k(retryImage, "retryImage");
            p013kotlin.jvm.internal.s.k(retryText, "retryText");
            p013kotlin.jvm.internal.s.k(confirmCaptureTitle, "confirmCaptureTitle");
            p013kotlin.jvm.internal.s.k(close, "close");
            p013kotlin.jvm.internal.s.k(onErrorDismissed, "onErrorDismissed");
            p013kotlin.jvm.internal.s.k(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            this.imageLoader = imageLoader;
            this.message = message;
            this.disclaimer = disclaimer;
            this.overlay = overlay;
            this.imagePath = imagePath;
            this.captureSide = captureSide;
            this.idClass = idClass;
            this.navigationState = navigationState;
            this.acceptImage = acceptImage;
            this.acceptText = acceptText;
            this.retryImage = retryImage;
            this.retryText = retryText;
            this.confirmCaptureTitle = confirmCaptureTitle;
            this.close = close;
            this.styles = governmentIdStepStyle;
            this.error = str;
            this.onErrorDismissed = onErrorDismissed;
            this.assetConfig = capturePage;
            this.isEnabled = z11;
            this.isAutoClassifying = z12;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
        }

        public final wn0.a<jn0.h0> a() {
            return this.acceptImage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAcceptText() {
            return this.acceptText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.CapturePage getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final IdConfig.e getCaptureSide() {
            return this.captureSide;
        }

        public final wn0.a<jn0.h0> e() {
            return this.close;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getConfirmCaptureTitle() {
            return this.confirmCaptureTitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final wg0.e getIdClass() {
            return this.idClass;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final ec.r getImageLoader() {
            return this.imageLoader;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final ii0.a getNavigationState() {
            return this.navigationState;
        }

        public final wn0.a<jn0.h0> n() {
            return this.onErrorDismissed;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final d getOverlay() {
            return this.overlay;
        }

        public final wn0.a<jn0.h0> p() {
            return this.retryImage;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getRetryText() {
            return this.retryText;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsAutoClassifying() {
            return this.isAutoClassifying;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0013\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001c\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001f\u0010$R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b\"\u0010&¨\u0006'"}, d2 = {"Lpg0/g5$f;", "Lpg0/g5;", "", "title", "description", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "assetConfig", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;Lii0/a;Lwn0/a;Lwn0/a;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", DateTokenConverter.CONVERTER_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "e", "Lii0/a;", "()Lii0/a;", "f", "Lwn0/a;", "()Lwn0/a;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends g5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final NextStep.GovernmentId.AssetConfig.PendingPage assetConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final ii0.a navigationState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> onBack;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> onCancel;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String title, String description, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.PendingPage pendingPage, ii0.a navigationState, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel, PendingPageTextPosition pendingPageTextVerticalPosition) {
            super(null);
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
            p013kotlin.jvm.internal.s.k(onBack, "onBack");
            p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
            p013kotlin.jvm.internal.s.k(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            this.title = title;
            this.description = description;
            this.styles = governmentIdStepStyle;
            this.assetConfig = pendingPage;
            this.navigationState = navigationState;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.PendingPage getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ii0.a getNavigationState() {
            return this.navigationState;
        }

        public final wn0.a<jn0.h0> d() {
            return this.onBack;
        }

        public final wn0.a<jn0.h0> e() {
            return this.onCancel;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    public /* synthetic */ g5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private g5() {
    }
}
