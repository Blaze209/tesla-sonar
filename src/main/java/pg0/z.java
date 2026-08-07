package pg0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import zf0.AamvaExtraction;
import zf0.AutoCaptureRuleSet;
import zf0.ExtractedTexts;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010,\u001a\u00020+*\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010.\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/\u001a)\u00101\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b1\u00102\u001a\u0011\u00105\u001a\u000204*\u000203¢\u0006\u0004\b5\u00106\u001a\u0011\u00108\u001a\u000204*\u000207¢\u0006\u0004\b8\u00109\u001a\u001b\u0010<\u001a\u00020;*\u0004\u0018\u00010:2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "", "countryCode", "", "defaultManualCaptureDelayMs", "Lpg0/d4;", "o", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;Ljava/lang/String;J)Lpg0/d4;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "Lpg0/d4$e;", "side", "Lwg0/e;", "type", "Lpg0/d4$c;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;Lpg0/d4$e;Lwg0/e;Ljava/lang/String;J)Lpg0/d4$c;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "Lpg0/d4$a;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;)Lpg0/d4$a;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "defaultManualCaptureDelay", "Lpg0/d4$d;", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;J)Lpg0/d4$d;", "b", "(J)Lpg0/d4$d;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "Lzf0/f;", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;)Lzf0/f;", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;)Z", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "Lzf0/e;", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;)Lzf0/e;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "Lpg0/g5$d;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;)Lpg0/g5$d;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "Lpg0/h4;", "n", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)Lpg0/h4;", "a", "(Lpg0/d4$e;)Lpg0/d4$a;", "currentSide", "c", "(Lwg0/e;Lpg0/d4$e;Ljava/lang/String;)Lpg0/g5$d;", "Lzf0/c0;", "Lpg0/k0;", "m", "(Lzf0/c0;)Lpg0/k0;", "Lzf0/g;", "l", "(Lzf0/g;)Lpg0/k0;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "Lqg0/a;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;J)Lqg0/a;", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class z {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f102968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f102969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f102970d;

        static {
            int[] iArr = new int[CapturePageConfig.RuleType.values().length];
            try {
                iArr[CapturePageConfig.RuleType.ID_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CapturePageConfig.RuleType.ID_FRONT_OR_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CapturePageConfig.RuleType.BARCODE_PDF417.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CapturePageConfig.RuleType.PASSPORT_MRZ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CapturePageConfig.RuleType.TEXT_EXTRACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f102967a = iArr;
            int[] iArr2 = new int[CapturePageConfig.OverlayLocalIcon.values().length];
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.BARCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.ID_FRONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.ID_BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.CORNERS_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.EMPTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            f102968b = iArr2;
            int[] iArr3 = new int[Id.IdLocalIcon.values().length];
            try {
                iArr3[Id.IdLocalIcon.WORLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Id.IdLocalIcon.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Id.IdLocalIcon.FLAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Id.IdLocalIcon.HOUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            f102969c = iArr3;
            int[] iArr4 = new int[IdConfig.e.values().length];
            try {
                iArr4[IdConfig.e.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[IdConfig.e.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[IdConfig.e.BarcodePdf417.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[IdConfig.e.FrontOrBack.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[IdConfig.e.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            f102970d = iArr4;
        }
    }

    private static final IdConfig.AutoCaptureConfig a(IdConfig.e eVar) {
        int i11 = a.f102970d[eVar.ordinal()];
        if (i11 == 1) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(p013kotlin.collections.v.e(new zf0.e.FrontRule(false, 1, null))));
        }
        if (i11 == 2) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(p013kotlin.collections.v.e(new zf0.e.BarcodePdf417Rule(false, 1, null))));
        }
        if (i11 == 3) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(p013kotlin.collections.v.e(new zf0.e.BarcodePdf417Rule(false, 1, null))));
        }
        if (i11 == 4) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(p013kotlin.collections.v.e(new zf0.e.FrontOrBackRule(false, 1, null))));
        }
        if (i11 == 5) {
            return new IdConfig.AutoCaptureConfig(null, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final IdConfig.ManualCaptureConfig b(long j11) {
        return new IdConfig.ManualCaptureConfig(true, j11);
    }

    private static final g5.d c(wg0.e eVar, IdConfig.e eVar2, String str) {
        if (eVar2 == IdConfig.e.BarcodePdf417) {
            return g5.d.a.f102493a;
        }
        if (eVar2 == IdConfig.e.PassportSignature) {
            return g5.d.f.f102499a;
        }
        wg0.e eVar3 = wg0.e.DriverLicense;
        if (eVar == eVar3 && eVar2 == IdConfig.e.Back && p013kotlin.jvm.internal.s.f(str, "US")) {
            return g5.d.a.f102493a;
        }
        if (eVar == wg0.e.Passport) {
            return g5.d.e.f102498a;
        }
        if (eVar == wg0.e.Visa) {
            return g5.d.e.f102498a;
        }
        if (eVar == eVar3) {
            return g5.d.C2178d.f102497a;
        }
        if (eVar == wg0.e.StateID) {
            return g5.d.C2178d.f102497a;
        }
        return eVar == wg0.e.ResidencyPermit ? g5.d.C2178d.f102497a : g5.d.f.f102499a;
    }

    private static final boolean d(CapturePageConfig.RuleSet ruleSet) {
        boolean z11;
        boolean z12;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules != null) {
            z11 = true;
            z12 = false;
            for (CapturePageConfig.Rule rule : rules) {
                if (p013kotlin.jvm.internal.s.f(rule.isRequired(), Boolean.TRUE) && rule.getType() == null) {
                    z11 = false;
                } else if (rule.getType() != null) {
                    z12 = true;
                }
            }
        } else {
            z11 = true;
            z12 = false;
        }
        return z11 && z12;
    }

    public static final IdConfig.AutoCaptureConfig e(CapturePageConfig.AutoCaptureConfig autoCaptureConfig) {
        Object next;
        p013kotlin.jvm.internal.s.k(autoCaptureConfig, "<this>");
        List<CapturePageConfig.RuleSet> ruleSets = autoCaptureConfig.getRuleSets();
        if (ruleSets == null) {
            return null;
        }
        if (ruleSets.isEmpty()) {
            return new IdConfig.AutoCaptureConfig(null, 1, null);
        }
        Iterator<T> it = ruleSets.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!d((CapturePageConfig.RuleSet) next));
        CapturePageConfig.RuleSet ruleSet = (CapturePageConfig.RuleSet) next;
        return ruleSet == null ? new IdConfig.AutoCaptureConfig(null, 1, null) : new IdConfig.AutoCaptureConfig(k(ruleSet));
    }

    public static final IdConfig.IdSideConfig f(CapturePageConfig capturePageConfig, IdConfig.e side, wg0.e type, String countryCode, long j11) {
        IdConfig.AutoCaptureConfig autoCaptureConfigA;
        IdConfig.ManualCaptureConfig manualCaptureConfigB;
        g5.d dVarC;
        CapturePageConfig.OverlayConfig overlay;
        CapturePageConfig.ManualCaptureConfig manualCaptureConfig;
        CapturePageConfig.AutoCaptureConfig autoCaptureConfig;
        p013kotlin.jvm.internal.s.k(side, "side");
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        if (capturePageConfig == null || (autoCaptureConfig = capturePageConfig.getAutoCaptureConfig()) == null || (autoCaptureConfigA = e(autoCaptureConfig)) == null) {
            autoCaptureConfigA = a(side);
        }
        if (capturePageConfig == null || (manualCaptureConfig = capturePageConfig.getManualCaptureConfig()) == null || (manualCaptureConfigB = g(manualCaptureConfig, j11)) == null) {
            manualCaptureConfigB = b(j11);
        }
        IdConfig.ManualCaptureConfig manualCaptureConfig2 = manualCaptureConfigB;
        if (autoCaptureConfigA.getRuleSet().a().isEmpty() && !manualCaptureConfig2.getIsEnabled()) {
            return null;
        }
        String key = side.getKey();
        if (capturePageConfig == null || (overlay = capturePageConfig.getOverlay()) == null || (dVarC = h(overlay)) == null) {
            dVarC = c(type, side, countryCode);
        }
        return new IdConfig.IdSideConfig(key, side, dVarC, autoCaptureConfigA, manualCaptureConfig2);
    }

    public static final IdConfig.ManualCaptureConfig g(CapturePageConfig.ManualCaptureConfig manualCaptureConfig, long j11) {
        p013kotlin.jvm.internal.s.k(manualCaptureConfig, "<this>");
        Boolean boolIsEnabled = manualCaptureConfig.isEnabled();
        boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
        Long delayMs = manualCaptureConfig.getDelayMs();
        if (delayMs != null) {
            j11 = delayMs.longValue();
        }
        return new IdConfig.ManualCaptureConfig(zBooleanValue, j11);
    }

    private static final g5.d h(CapturePageConfig.OverlayConfig overlayConfig) {
        RemoteImage overlay = overlayConfig.getOverlay();
        if (overlay != null) {
            return new g5.d.c(overlay);
        }
        CapturePageConfig.OverlayLocalIcon overlayFallback = overlayConfig.getOverlayFallback();
        switch (overlayFallback == null ? -1 : a.f102968b[overlayFallback.ordinal()]) {
            case -1:
                return g5.d.f.f102499a;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return g5.d.a.f102493a;
            case 2:
                return g5.d.e.f102498a;
            case 3:
                return g5.d.C2178d.f102497a;
            case 4:
                return g5.d.a.f102493a;
            case 5:
                return g5.d.b.f102494a;
            case 6:
                return g5.d.f.f102499a;
        }
    }

    public static final qg0.a i(NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig, long j11) {
        CapturePageConfig capturePageConfig;
        qg0.a.Companion companion = qg0.a.INSTANCE;
        IdConfig.IdSideConfig idSideConfigF = null;
        Boolean boolIsEnabled = autoClassificationConfig != null ? autoClassificationConfig.isEnabled() : null;
        Boolean extractTextFromImage = autoClassificationConfig != null ? autoClassificationConfig.getExtractTextFromImage() : null;
        if (autoClassificationConfig != null && (capturePageConfig = autoClassificationConfig.getCapturePageConfig()) != null) {
            idSideConfigF = f(capturePageConfig, IdConfig.e.Front, wg0.e.Unknown, "", j11);
        }
        return companion.b(boolIsEnabled, extractTextFromImage, idSideConfigF);
    }

    private static final zf0.e j(CapturePageConfig.Rule rule) {
        CapturePageConfig.RuleType type = rule.getType();
        int i11 = type == null ? -1 : a.f102967a[type.ordinal()];
        if (i11 == -1) {
            return null;
        }
        if (i11 == 1) {
            return new zf0.e.FrontRule(p013kotlin.jvm.internal.s.f(rule.isRequired(), Boolean.TRUE));
        }
        if (i11 == 2) {
            return new zf0.e.FrontOrBackRule(p013kotlin.jvm.internal.s.f(rule.isRequired(), Boolean.TRUE));
        }
        if (i11 == 3) {
            return new zf0.e.BarcodePdf417Rule(p013kotlin.jvm.internal.s.f(rule.isRequired(), Boolean.TRUE));
        }
        if (i11 == 4) {
            return new zf0.e.MrzRule(p013kotlin.jvm.internal.s.f(rule.isRequired(), Boolean.TRUE));
        }
        if (i11 == 5) {
            return new zf0.e.TextExtractionRule(p013kotlin.jvm.internal.s.f(rule.isRequired(), Boolean.TRUE));
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final AutoCaptureRuleSet k(CapturePageConfig.RuleSet ruleSet) {
        List listM;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules != null) {
            listM = new ArrayList();
            Iterator<T> it = rules.iterator();
            while (it.hasNext()) {
                zf0.e eVarJ = j((CapturePageConfig.Rule) it.next());
                if (eVarJ != null) {
                    listM.add(eVarJ);
                }
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        return new AutoCaptureRuleSet(listM);
    }

    public static final GovernmentIdDetails l(zf0.g gVar) {
        p013kotlin.jvm.internal.s.k(gVar, "<this>");
        if (gVar instanceof zf0.g.MrzBarcodeInfo) {
            zf0.g.MrzBarcodeInfo mrzBarcodeInfo = (zf0.g.MrzBarcodeInfo) gVar;
            return new GovernmentIdDetails(mrzBarcodeInfo.getBirthdate(), mrzBarcodeInfo.getExpirationDate());
        }
        if (!(gVar instanceof zf0.g.Pdf417BarcodeInfo)) {
            throw new NoWhenBranchMatchedException();
        }
        zf0.g.Pdf417BarcodeInfo pdf417BarcodeInfo = (zf0.g.Pdf417BarcodeInfo) gVar;
        AamvaExtraction aamvaExtractionB = pdf417BarcodeInfo.b();
        Date birthdate = aamvaExtractionB != null ? aamvaExtractionB.getBirthdate() : null;
        AamvaExtraction aamvaExtractionB2 = pdf417BarcodeInfo.b();
        return new GovernmentIdDetails(birthdate, aamvaExtractionB2 != null ? aamvaExtractionB2.getExpirationDate() : null);
    }

    public static final GovernmentIdDetails m(ExtractedTexts extractedTexts) {
        p013kotlin.jvm.internal.s.k(extractedTexts, "<this>");
        return new GovernmentIdDetails(extractedTexts.getDateOfBirth(), extractedTexts.getExpirationDate());
    }

    private static final h4 n(Id.IdLocalIcon idLocalIcon) {
        int i11 = idLocalIcon == null ? -1 : a.f102969c[idLocalIcon.ordinal()];
        if (i11 == -1) {
            return h4.Card;
        }
        if (i11 == 1) {
            return h4.World;
        }
        if (i11 == 2) {
            return h4.Card;
        }
        if (i11 == 3) {
            return h4.Flag;
        }
        if (i11 == 4) {
            return h4.House;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final IdConfig o(Id id2, String countryCode, long j11) {
        h4 icon;
        String str;
        long j12;
        IdConfig.IdSideConfig idSideConfigF;
        p013kotlin.jvm.internal.s.k(id2, "<this>");
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        wg0.e eVarA = wg0.e.INSTANCE.a(id2.getClass());
        if (eVarA == wg0.e.Unknown && !id2.isDynamicGovId()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<CapturePageConfig> capturePageConfigs = id2.getCapturePageConfigs();
        if (capturePageConfigs != null) {
            for (CapturePageConfig capturePageConfig : capturePageConfigs) {
                String side = capturePageConfig.getSide();
                if (side != null) {
                    linkedHashMap.put(side, capturePageConfig);
                }
            }
        }
        List<String> requiresSides = id2.getRequiresSides();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(requiresSides, 10));
        for (String str2 : requiresSides) {
            IdConfig.e eVarA2 = IdConfig.e.INSTANCE.a(str2);
            if (eVarA2 == null || (idSideConfigF = f((CapturePageConfig) linkedHashMap.get(str2), eVarA2, eVarA, (str = countryCode), (j12 = j11))) == null) {
                return null;
            }
            arrayList.add(idSideConfigF);
            countryCode = str;
            j11 = j12;
        }
        String str3 = id2.getClass();
        if (id2.isDynamicGovId()) {
            Id.IdIcon icon2 = id2.getIcon();
            icon = n(icon2 != null ? icon2.getIconFallback() : null);
        } else {
            icon = eVarA.toIcon();
        }
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new i4.SideIdPart(((IdConfig.IdSideConfig) it.next()).getSide()));
        }
        return new IdConfig(str3, icon, arrayList, arrayList2, eVarA);
    }
}
