package qg0;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import oi0.Option;
import oi0.c2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import pg0.IdConfig;
import pg0.IdConfigForCountry;
import pg0.c4;
import pg0.g3;
import pg0.g5;
import pg0.n1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00152&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lqg0/o;", "", "Lii0/b;", "navigationStateManager", "<init>", "(Lii0/b;)V", "Lpg0/g3$a;", "renderProps", "Lpg0/n1$a;", "renderState", "Ly20/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Ly20/k;", "Lpg0/n1;", "Lpg0/g3$b;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxg0/k;", "videoCaptureHelper", "Lqg0/w;", "n", "(Lpg0/g3$a;Lpg0/n1$a;Ly20/k$a;Lxg0/k;)Lqg0/w;", "Lpg0/n1$b;", "Lpg0/g5$a;", "t", "(Lpg0/g3$a;Lpg0/n1$b;Ly20/k$a;Lxg0/k;)Lpg0/g5$a;", "a", "Lii0/b;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ii0.b navigationStateManager;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105467a;

        static {
            int[] iArr = new int[pg0.c.values().length];
            try {
                iArr[pg0.c.IdTypeRejected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pg0.c.UnableToClassify.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105467a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"qg0/o$b", "Loi0/c2;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "b", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "a", "()Z", "canSelectMultipleValues", "", "Loi0/e4;", "getOptions", "()Ljava/util/List;", "options", "", "getLabel", "()Ljava/lang/String;", AnnotatedPrivateKey.LABEL, "c", "selectedOptions", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g3.a f105468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n1.AutoClassificationManualSelect f105469b;

        b(g3.a aVar, n1.AutoClassificationManualSelect autoClassificationManualSelect) {
            this.f105468a = aVar;
            this.f105469b = autoClassificationManualSelect;
        }

        @Override // oi0.c2
        /* JADX INFO: renamed from: a */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // oi0.c2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InputSelectComponentStyle getStyles() {
            StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle;
            StepStyles.InputSelectStyleContainer base;
            StepStyles.GovernmentIdStepStyle styles = this.f105468a.getStyles();
            if (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null || (base = inputSelectStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // oi0.c2
        public List<Option> c() {
            Object next;
            List<Option> listE;
            List<IdConfigForCountry> listU = this.f105469b.u();
            n1.AutoClassificationManualSelect autoClassificationManualSelect = this.f105469b;
            Iterator<T> it = listU.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p013kotlin.jvm.internal.s.f(((IdConfigForCountry) next).getCountryCode(), autoClassificationManualSelect.getSelectedCountryCode()));
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) next;
            return (idConfigForCountry == null || (listE = p013kotlin.collections.v.e(new Option(idConfigForCountry.getCountryName(), idConfigForCountry.getCountryCode()))) == null) ? p013kotlin.collections.v.m() : listE;
        }

        @Override // oi0.c2
        public String getLabel() {
            return null;
        }

        @Override // oi0.c2
        public List<Option> getOptions() {
            List<IdConfigForCountry> listU = this.f105469b.u();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listU, 10));
            for (IdConfigForCountry idConfigForCountry : listU) {
                arrayList.add(new Option(idConfigForCountry.getCountryName(), idConfigForCountry.getCountryCode()));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"qg0/o$c", "Loi0/c2;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "b", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "a", "()Z", "canSelectMultipleValues", "", "Loi0/e4;", "getOptions", "()Ljava/util/List;", "options", "", "getLabel", "()Ljava/lang/String;", AnnotatedPrivateKey.LABEL, "c", "selectedOptions", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g3.a f105470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Option> f105471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n1.AutoClassificationManualSelect f105472c;

        c(g3.a aVar, List<Option> list, n1.AutoClassificationManualSelect autoClassificationManualSelect) {
            this.f105470a = aVar;
            this.f105471b = list;
            this.f105472c = autoClassificationManualSelect;
        }

        @Override // oi0.c2
        /* JADX INFO: renamed from: a */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // oi0.c2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InputSelectComponentStyle getStyles() {
            StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle;
            StepStyles.InputSelectStyleContainer base;
            StepStyles.GovernmentIdStepStyle styles = this.f105470a.getStyles();
            if (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null || (base = inputSelectStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // oi0.c2
        public List<Option> c() {
            List<Option> list = this.f105471b;
            n1.AutoClassificationManualSelect autoClassificationManualSelect = this.f105472c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (p013kotlin.jvm.internal.s.f(((Option) obj).getValue(), autoClassificationManualSelect.getSelectedIdClass())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        @Override // oi0.c2
        public String getLabel() {
            return null;
        }

        @Override // oi0.c2
        public List<Option> getOptions() {
            return this.f105471b;
        }
    }

    public o(ii0.b navigationStateManager) {
        p013kotlin.jvm.internal.s.k(navigationStateManager, "navigationStateManager");
        this.navigationStateManager = navigationStateManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 A(y20.k.a aVar, final Option it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: qg0.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return o.B(it, (y20.r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 B(Option option, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.AutoClassificationManualSelect autoClassificationManualSelect = objC instanceof n1.AutoClassificationManualSelect ? (n1.AutoClassificationManualSelect) objC : null;
        if (autoClassificationManualSelect == null) {
            return h0.f84049a;
        }
        action.e(n1.AutoClassificationManualSelect.q(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, option.getValue(), null, 1535, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(y20.k.a aVar) {
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: qg0.n
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return o.p((y20.r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 p(y20.r.c action) {
        String countryCode;
        String str;
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.AutoClassificationError autoClassificationError = objC instanceof n1.AutoClassificationError ? (n1.AutoClassificationError) objC : null;
        if (autoClassificationError == null) {
            return h0.f84049a;
        }
        if (autoClassificationError.s().size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) p013kotlin.collections.v.o0(autoClassificationError.s());
            String idClassKey = idConfigForCountry.b().size() == 1 ? ((IdConfig) p013kotlin.collections.v.o0(idConfigForCountry.b())).getIdClassKey() : null;
            countryCode = idConfigForCountry.getCountryCode();
            str = idClassKey;
        } else {
            countryCode = null;
            str = null;
        }
        action.e(new n1.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.k(), autoClassificationError.j(), autoClassificationError.getPartIndex(), c4.w(action, true), autoClassificationError.getCountryCode(), autoClassificationError.m(), new zf0.u(null, null, null, 0, 15, null), autoClassificationError.s(), countryCode, str));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 q(y20.k.a aVar, xg0.k kVar) {
        c4.N(aVar, kVar);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 r(y20.k.a aVar) {
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: qg0.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return o.s((y20.r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 s(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(g3.b.C2176b.f102421a);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 u(y20.k.a aVar, final Option it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: qg0.m
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return o.v(it, (y20.r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 v(Option option, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.AutoClassificationManualSelect autoClassificationManualSelect = objC instanceof n1.AutoClassificationManualSelect ? (n1.AutoClassificationManualSelect) objC : null;
        if (autoClassificationManualSelect == null) {
            return h0.f84049a;
        }
        action.e(n1.AutoClassificationManualSelect.q(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, null, option.getValue(), 1023, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 w(IdConfig idConfig, n1.AutoClassificationManualSelect autoClassificationManualSelect, y20.k.a aVar, g3.a aVar2, xg0.k kVar) {
        if (idConfig == null) {
            return h0.f84049a;
        }
        c4.R(autoClassificationManualSelect, aVar, aVar2, null, idConfig, kVar, autoClassificationManualSelect.getCameraProperties(), (3584 & 128) != 0, (3584 & 256) != 0 ? autoClassificationManualSelect.j() : idConfig.b(), (3584 & 512) != 0 ? autoClassificationManualSelect.getPartIndex() : -1, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? autoClassificationManualSelect.getCountryCode() : autoClassificationManualSelect.getSelectedCountryCode());
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 x(y20.k.a aVar, xg0.k kVar) {
        c4.N(aVar, kVar);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 y(y20.k.a aVar) {
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: qg0.e
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return o.z((y20.r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 z(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(g3.b.C2176b.f102421a);
        return h0.f84049a;
    }

    public final w n(g3.a renderProps, n1.AutoClassificationError renderState, final y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a context, final xg0.k videoCaptureHelper) {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(videoCaptureHelper, "videoCaptureHelper");
        pg0.c errorType = renderState.getErrorType();
        int[] iArr = a.f105467a;
        int i11 = iArr[errorType.ordinal()];
        if (i11 == 1) {
            idClassRejectedTitle = renderProps.getStrings().getIdClassRejectedTitle();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            idClassRejectedTitle = renderProps.getStrings().getUnableToClassifyDocumentTitle();
        }
        int i12 = iArr[renderState.getErrorType().ordinal()];
        if (i12 == 1) {
            idClassRejectedContinueButtonText = renderProps.getStrings().getIdClassRejectedContinueButtonText();
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            idClassRejectedContinueButtonText = renderProps.getStrings().getUnableToClassifyDocumentContinueButtonText();
        }
        return new w(idClassRejectedTitle, idClassRejectedContinueButtonText, renderProps.getStyles(), this.navigationStateManager.b(), new wn0.a() { // from class: qg0.b
            @Override // wn0.a
            public final Object invoke() {
                return o.o(context);
            }
        }, new wn0.a() { // from class: qg0.f
            @Override // wn0.a
            public final Object invoke() {
                return o.q(context, videoCaptureHelper);
            }
        }, new wn0.a() { // from class: qg0.g
            @Override // wn0.a
            public final Object invoke() {
                return o.r(context);
            }
        });
    }

    public final g5.a t(final g3.a renderProps, final n1.AutoClassificationManualSelect renderState, final y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a context, final xg0.k videoCaptureHelper) {
        Object next;
        List<IdConfig> listM;
        String idClassKey;
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(videoCaptureHelper, "videoCaptureHelper");
        b bVar = new b(renderProps, renderState);
        final IdConfig idConfig = null;
        Object obj = null;
        if (renderState.getSelectedCountryCode() == null) {
            listM = p013kotlin.collections.v.m();
        } else {
            Iterator<T> it = renderState.u().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p013kotlin.jvm.internal.s.f(((IdConfigForCountry) next).getCountryCode(), renderState.getSelectedCountryCode()));
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) next;
            if (idConfigForCountry == null || (listM = idConfigForCountry.b()) == null) {
                listM = p013kotlin.collections.v.m();
            }
        }
        List<IdConfig> list = listM;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        for (IdConfig idConfig2 : list) {
            List<NextStep.GovernmentId.LocalizationOverride> listM2 = renderProps.getStrings().M();
            if ((listM2 == null || (idClassKey = p.b(listM2, renderState.getSelectedCountryCode(), idConfig2.getIdClassKey(), "selectPage")) == null) && (idClassKey = renderProps.getStrings().G().get(idConfig2.getIdClassKey())) == null) {
                idClassKey = idConfig2.getIdClassKey();
            }
            arrayList.add(new Option(idClassKey, idConfig2.getIdClassKey()));
        }
        if (renderState.getSelectedIdClass() != null) {
            for (Object obj2 : list) {
                if (p013kotlin.jvm.internal.s.f(((IdConfig) obj2).getIdClassKey(), renderState.getSelectedIdClass())) {
                    obj = obj2;
                    break;
                }
            }
            idConfig = (IdConfig) obj;
        }
        return new g5.a(renderProps.getStrings().getManualClassificationTitle(), renderProps.getStyles(), bVar, new c(renderProps, arrayList, renderState), renderProps.getStrings().getCountryInputTitle(), renderProps.getStrings().getIdClassInputTitle(), renderProps.getStrings().getManualClassificationContinueButtonText(), idConfig != null, this.navigationStateManager.b(), new wn0.l() { // from class: qg0.h
            @Override // wn0.l
            public final Object invoke(Object obj3) {
                return o.A(context, (Option) obj3);
            }
        }, new wn0.l() { // from class: qg0.i
            @Override // wn0.l
            public final Object invoke(Object obj3) {
                return o.u(context, (Option) obj3);
            }
        }, new wn0.a() { // from class: qg0.j
            @Override // wn0.a
            public final Object invoke() {
                return o.w(idConfig, renderState, context, renderProps, videoCaptureHelper);
            }
        }, new wn0.a() { // from class: qg0.k
            @Override // wn0.a
            public final Object invoke() {
                return o.x(context, videoCaptureHelper);
            }
        }, new wn0.a() { // from class: qg0.l
            @Override // wn0.a
            public final Object invoke() {
                return o.y(context);
            }
        });
    }
}
