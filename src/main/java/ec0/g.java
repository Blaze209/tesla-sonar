package ec0;

import com.plaid.internal.EnumC4419g;
import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ec0.g, still in use, count: 1, list:
  (r0v0 ec0.g) from 0x0684: CONSTRUCTOR 
  (wrap co0.d:0x067c: INVOKE (wrap java.lang.Class:0x067a: CONST_CLASS  A[WRAPPED] (LINE:1659) ec0.g.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:1661))
  (wrap com.squareup.wire.o:0x0680: SGET  A[WRAPPED] (LINE:1665) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 ec0.g)
 A[MD:(co0.d<ec0.g>, com.squareup.wire.o, ec0.g):void (m), WRAPPED] (LINE:1669) call: ec0.g.a.<init>(co0.d, com.squareup.wire.o, ec0.g):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0003\b\u008b\u0001\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001¨\u0006\u008e\u0001"}, d2 = {"Lec0/g;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "INVALID_ALERT_NAME", "BMS_a007_SW_Slowed_Chg_Batt_Cold_OBSOLETE", "BMS_a076_SW_Dch_While_Charging", "CC_a001_gndMonIntrptLineSide", "CC_a002_gndMonIntrptLoadSide", "CC_a003_CCIDTripped", "CC_a004_CCIDSelfTestFault", "CC_a005_groundedNeutral", "CC_a006_inputOverCurrent", "CC_a007_inputOverVoltage", "CC_a008_inputUnderVoltage", "CC_a009_inputMiswired", "CC_a010_contactorWelded", "CC_a011_ambientOT", "CC_a012_wallPlugOT", "CC_a013_vehConnOT", "CC_a014_mcuSelfTestFault", "CC_a015_PilotAFault", "CC_a016_PilotBFault", "CC_a017_PilotCFault", "CC_a018_PilotDFault", "CC_a019_proxDisconnected", "CC_a020_3vRailIncorrect", "CC_a021_CB_noMaster", "CC_a022_CB_tooManyMasters", "CC_a023_CB_tooManySlaves", "CC_a024_CB_masterISetTooLow", "CC_a025_evseTemp", "CC_a026_wallPlugTemp", "CC_a027_vehicleHandleTemp", "CC_a028_CB_rotarySelect", "CC_a029_PilotFFault", "CC_a030_masterSlaveMismatch", "CC_a041_inputWiringFoldback", "CC_a042_pcbaTempFoldback", "CC_a043_configurationRequired", "CP_a004_proximityRationality", "CP_a010_pilotRationality", "CP_a046_lostCommsEVSE", "CP_a049_multipleCablesDetected", "CP_a052_chademoNotSupported", "CP_a053_proxLatchedNoPilot", "CP_a055_chargeStoppedNoPilot", "CP_a058_acChargingBlocked", "CP_a062_scOutOfService", "CP_a063_scUpdateInProgress", "CP_a064_superchargingBlocked", "CP_a066_proxLatchedIdlePilot", "CP_a067_gbdcConnFault", "CP_a074_failedToEstablishV2gComm", "CP_a091_wrongSuperchargerHandle", "CP_a101_wcFoldbackActive", "CP_a102_wcOvertempFault", "CP_a108_chademoOvertempFault", "CP_a110_thermalVelocityHigh", "CP_a120_comboAdapterFoldback", "CP_a131_evseCommTimeout", "CP_a132_contractAuthTimeout", "CP_a133_proxNeverLatched", "CP_a135_sdpAttemptsFailed", "CP_a139_pilotFaulted", "CP_a140_superchargerFaulted", "CP_a141_chademoAdapterFault", "CP_a142_gbdcScConnFault", "CP_a143_unsupportedChargeAdapter", "CP_a146_ccsEvseMalfunction", "CP_a151_badPilotDiodeDetected", "CP_a152_pilotEdgeDetectionFailed", "FC_a141_CA_vehConn_OT", "FC_a142_CA_evseConn_OT", "FC_a143_CA_pcb_OT", "FC_a151_CA_vehToEvseDeltaLo", "FC_a154_CA_vehToPcbDeltaLo", "FC_a161_CA_vehTempHiFoldBk", "FC_a162_CA_evseTempHiFoldBk", "FC_a163_CA_pcbTempHiFoldBk", "FC_a266_GB_negPin_OT", "FC_a267_GB_posPin_OT", "FC_a268_GB_pcb_OT", "FC_a272_GB_negToPosDeltaHi", "FC_a273_GB_negToPosDeltaLo", "FC_a274_GB_negToPcbDeltaHi", "FC_a282_GB_negTempHiFoldBk", "FC_a283_GB_posTempHiFoldBk", "FC_a284_GB_pcbTempHiFoldBk", "FC_a286_GB_evseConnUnlocked", "PCS_a007_chgPhaseTempHot", "PCS_a016_chgAllPhasesFaulted", "PCS_a017_chgWallPowerRemoval", "PCS_a019_acChargePowerLimited", "PCS_a032_excessiveGridTransientsDetected", "PCS_a052_acVoltageNotPresent", "PCS_a053_chgInputVDropHigh", "PCS_a054_chgInputVDropTooHigh", "PCS_a055_chgLineImpedanceHigh", "PCS_a056_chgLineImpedanceTooHigh", "PCS_a059_chgInputOvRms", "PCS_a073_unexpectedAcInputVoltage", "PCS_a078_chgStopDcdcTooHot", "PCS_a088_gridFreqDroopDetected", "PCS_a090_expectedAcVoltageSourceMissing", "PCS_a096_microGridOverLoaded", "PCS2_a019_DcacADcTempTooHigh", "PCS2_a020_DcacBDcTempTooHigh", "PCS2_a024_DcacATxTempTooHigh", "PCS2_a025_DcacBTxTempTooHigh", "PCS2_a062_acVoltageNotPresent", "PCS2_a063_chgUnknownGridConfig", "PCS2_a112_chgInputVDropTooHigh", "PCS2_a115_chgWallPowerRemoval", "PCS2_a116_chgPersistentFault", "UMC_a001_gndMonIntrptLineSide", "UMC_a002_GFCITripped", "UMC_a003_GFCISelfTestFault", "UMC_a004_inputOverVoltage", "UMC_a005_inputUnderVoltage", "UMC_a006_contactorWelded", "UMC_a007_pcbaOT", "UMC_a008_wallPlugOT", "UMC_a009_vehConnOT", "UMC_a010_inputOT", "UMC_a011_proxDisconnected", "UMC_a012_pilotFault", "UMC_a013_SA_Temperature", "UMC_a014_SA_Genealogy", "UMC_a015_SA_Connection", "UMC_a016_pcbaOTFoldback", "UMC_a017_wallPlugOTFoldback", "UMC_a018_vehConnOTFoldback", "UMC_a019_inputOTFoldback", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements com.squareup.wire.p {
    INVALID_ALERT_NAME(0),
    BMS_a007_SW_Slowed_Chg_Batt_Cold_OBSOLETE(1),
    BMS_a076_SW_Dch_While_Charging(2),
    CC_a001_gndMonIntrptLineSide(3),
    CC_a002_gndMonIntrptLoadSide(4),
    CC_a003_CCIDTripped(5),
    CC_a004_CCIDSelfTestFault(6),
    CC_a005_groundedNeutral(7),
    CC_a006_inputOverCurrent(8),
    CC_a007_inputOverVoltage(9),
    CC_a008_inputUnderVoltage(10),
    CC_a009_inputMiswired(11),
    CC_a010_contactorWelded(12),
    CC_a011_ambientOT(13),
    CC_a012_wallPlugOT(14),
    CC_a013_vehConnOT(15),
    CC_a014_mcuSelfTestFault(16),
    CC_a015_PilotAFault(17),
    CC_a016_PilotBFault(18),
    CC_a017_PilotCFault(19),
    CC_a018_PilotDFault(20),
    CC_a019_proxDisconnected(21),
    CC_a020_3vRailIncorrect(22),
    CC_a021_CB_noMaster(23),
    CC_a022_CB_tooManyMasters(24),
    CC_a023_CB_tooManySlaves(25),
    CC_a024_CB_masterISetTooLow(26),
    CC_a025_evseTemp(27),
    CC_a026_wallPlugTemp(28),
    CC_a027_vehicleHandleTemp(29),
    CC_a028_CB_rotarySelect(30),
    CC_a029_PilotFFault(31),
    CC_a030_masterSlaveMismatch(32),
    CC_a041_inputWiringFoldback(33),
    CC_a042_pcbaTempFoldback(34),
    CC_a043_configurationRequired(35),
    CP_a004_proximityRationality(36),
    CP_a010_pilotRationality(37),
    CP_a046_lostCommsEVSE(38),
    CP_a049_multipleCablesDetected(39),
    CP_a052_chademoNotSupported(40),
    CP_a053_proxLatchedNoPilot(41),
    CP_a055_chargeStoppedNoPilot(42),
    CP_a058_acChargingBlocked(43),
    CP_a062_scOutOfService(44),
    CP_a063_scUpdateInProgress(45),
    CP_a064_superchargingBlocked(46),
    CP_a066_proxLatchedIdlePilot(47),
    CP_a067_gbdcConnFault(48),
    CP_a074_failedToEstablishV2gComm(49),
    CP_a091_wrongSuperchargerHandle(50),
    CP_a101_wcFoldbackActive(51),
    CP_a102_wcOvertempFault(52),
    CP_a108_chademoOvertempFault(53),
    CP_a110_thermalVelocityHigh(54),
    CP_a120_comboAdapterFoldback(55),
    CP_a131_evseCommTimeout(56),
    CP_a132_contractAuthTimeout(57),
    CP_a133_proxNeverLatched(58),
    CP_a135_sdpAttemptsFailed(59),
    CP_a139_pilotFaulted(60),
    CP_a140_superchargerFaulted(61),
    CP_a141_chademoAdapterFault(62),
    CP_a142_gbdcScConnFault(63),
    CP_a143_unsupportedChargeAdapter(64),
    CP_a146_ccsEvseMalfunction(65),
    CP_a151_badPilotDiodeDetected(66),
    CP_a152_pilotEdgeDetectionFailed(67),
    FC_a141_CA_vehConn_OT(68),
    FC_a142_CA_evseConn_OT(69),
    FC_a143_CA_pcb_OT(70),
    FC_a151_CA_vehToEvseDeltaLo(71),
    FC_a154_CA_vehToPcbDeltaLo(72),
    FC_a161_CA_vehTempHiFoldBk(73),
    FC_a162_CA_evseTempHiFoldBk(74),
    FC_a163_CA_pcbTempHiFoldBk(75),
    FC_a266_GB_negPin_OT(76),
    FC_a267_GB_posPin_OT(77),
    FC_a268_GB_pcb_OT(78),
    FC_a272_GB_negToPosDeltaHi(79),
    FC_a273_GB_negToPosDeltaLo(80),
    FC_a274_GB_negToPcbDeltaHi(81),
    FC_a282_GB_negTempHiFoldBk(82),
    FC_a283_GB_posTempHiFoldBk(83),
    FC_a284_GB_pcbTempHiFoldBk(84),
    FC_a286_GB_evseConnUnlocked(85),
    PCS_a007_chgPhaseTempHot(86),
    PCS_a016_chgAllPhasesFaulted(87),
    PCS_a017_chgWallPowerRemoval(88),
    PCS_a019_acChargePowerLimited(89),
    PCS_a032_excessiveGridTransientsDetected(90),
    PCS_a052_acVoltageNotPresent(91),
    PCS_a053_chgInputVDropHigh(92),
    PCS_a054_chgInputVDropTooHigh(93),
    PCS_a055_chgLineImpedanceHigh(94),
    PCS_a056_chgLineImpedanceTooHigh(95),
    PCS_a059_chgInputOvRms(96),
    PCS_a073_unexpectedAcInputVoltage(97),
    PCS_a078_chgStopDcdcTooHot(98),
    PCS_a088_gridFreqDroopDetected(99),
    PCS_a090_expectedAcVoltageSourceMissing(100),
    PCS_a096_microGridOverLoaded(101),
    PCS2_a019_DcacADcTempTooHigh(102),
    PCS2_a020_DcacBDcTempTooHigh(103),
    PCS2_a024_DcacATxTempTooHigh(104),
    PCS2_a025_DcacBTxTempTooHigh(105),
    PCS2_a062_acVoltageNotPresent(106),
    PCS2_a063_chgUnknownGridConfig(107),
    PCS2_a112_chgInputVDropTooHigh(108),
    PCS2_a115_chgWallPowerRemoval(109),
    PCS2_a116_chgPersistentFault(110),
    UMC_a001_gndMonIntrptLineSide(111),
    UMC_a002_GFCITripped(112),
    UMC_a003_GFCISelfTestFault(113),
    UMC_a004_inputOverVoltage(114),
    UMC_a005_inputUnderVoltage(115),
    UMC_a006_contactorWelded(116),
    UMC_a007_pcbaOT(117),
    UMC_a008_wallPlugOT(118),
    UMC_a009_vehConnOT(119),
    UMC_a010_inputOT(120),
    UMC_a011_proxDisconnected(121),
    UMC_a012_pilotFault(122),
    UMC_a013_SA_Temperature(123),
    UMC_a014_SA_Genealogy(124),
    UMC_a015_SA_Connection(125),
    UMC_a016_pcbaOTFoldback(126),
    UMC_a017_wallPlugOTFoldback(127),
    UMC_a018_vehConnOTFoldback(128),
    UMC_a019_inputOTFoldback(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<g> ADAPTER = new com.squareup.wire.a<g>(o0.b(g.class), com.squareup.wire.o.PROTO_3, new g(0)) { // from class: ec0.g.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public g d(int value) {
            return g.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: ec0.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lec0/g$b;", "", "<init>", "()V", "", "value", "Lec0/g;", "a", "(I)Lec0/g;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int value) {
            switch (value) {
                case 0:
                    return g.INVALID_ALERT_NAME;
                case 1:
                    return g.BMS_a007_SW_Slowed_Chg_Batt_Cold_OBSOLETE;
                case 2:
                    return g.BMS_a076_SW_Dch_While_Charging;
                case 3:
                    return g.CC_a001_gndMonIntrptLineSide;
                case 4:
                    return g.CC_a002_gndMonIntrptLoadSide;
                case 5:
                    return g.CC_a003_CCIDTripped;
                case 6:
                    return g.CC_a004_CCIDSelfTestFault;
                case 7:
                    return g.CC_a005_groundedNeutral;
                case 8:
                    return g.CC_a006_inputOverCurrent;
                case 9:
                    return g.CC_a007_inputOverVoltage;
                case 10:
                    return g.CC_a008_inputUnderVoltage;
                case 11:
                    return g.CC_a009_inputMiswired;
                case 12:
                    return g.CC_a010_contactorWelded;
                case 13:
                    return g.CC_a011_ambientOT;
                case 14:
                    return g.CC_a012_wallPlugOT;
                case 15:
                    return g.CC_a013_vehConnOT;
                case 16:
                    return g.CC_a014_mcuSelfTestFault;
                case 17:
                    return g.CC_a015_PilotAFault;
                case 18:
                    return g.CC_a016_PilotBFault;
                case 19:
                    return g.CC_a017_PilotCFault;
                case 20:
                    return g.CC_a018_PilotDFault;
                case 21:
                    return g.CC_a019_proxDisconnected;
                case 22:
                    return g.CC_a020_3vRailIncorrect;
                case 23:
                    return g.CC_a021_CB_noMaster;
                case 24:
                    return g.CC_a022_CB_tooManyMasters;
                case 25:
                    return g.CC_a023_CB_tooManySlaves;
                case 26:
                    return g.CC_a024_CB_masterISetTooLow;
                case 27:
                    return g.CC_a025_evseTemp;
                case 28:
                    return g.CC_a026_wallPlugTemp;
                case 29:
                    return g.CC_a027_vehicleHandleTemp;
                case 30:
                    return g.CC_a028_CB_rotarySelect;
                case 31:
                    return g.CC_a029_PilotFFault;
                case 32:
                    return g.CC_a030_masterSlaveMismatch;
                case 33:
                    return g.CC_a041_inputWiringFoldback;
                case 34:
                    return g.CC_a042_pcbaTempFoldback;
                case 35:
                    return g.CC_a043_configurationRequired;
                case 36:
                    return g.CP_a004_proximityRationality;
                case 37:
                    return g.CP_a010_pilotRationality;
                case 38:
                    return g.CP_a046_lostCommsEVSE;
                case 39:
                    return g.CP_a049_multipleCablesDetected;
                case 40:
                    return g.CP_a052_chademoNotSupported;
                case 41:
                    return g.CP_a053_proxLatchedNoPilot;
                case 42:
                    return g.CP_a055_chargeStoppedNoPilot;
                case 43:
                    return g.CP_a058_acChargingBlocked;
                case 44:
                    return g.CP_a062_scOutOfService;
                case 45:
                    return g.CP_a063_scUpdateInProgress;
                case 46:
                    return g.CP_a064_superchargingBlocked;
                case 47:
                    return g.CP_a066_proxLatchedIdlePilot;
                case 48:
                    return g.CP_a067_gbdcConnFault;
                case 49:
                    return g.CP_a074_failedToEstablishV2gComm;
                case 50:
                    return g.CP_a091_wrongSuperchargerHandle;
                case 51:
                    return g.CP_a101_wcFoldbackActive;
                case 52:
                    return g.CP_a102_wcOvertempFault;
                case 53:
                    return g.CP_a108_chademoOvertempFault;
                case 54:
                    return g.CP_a110_thermalVelocityHigh;
                case 55:
                    return g.CP_a120_comboAdapterFoldback;
                case 56:
                    return g.CP_a131_evseCommTimeout;
                case 57:
                    return g.CP_a132_contractAuthTimeout;
                case 58:
                    return g.CP_a133_proxNeverLatched;
                case 59:
                    return g.CP_a135_sdpAttemptsFailed;
                case 60:
                    return g.CP_a139_pilotFaulted;
                case 61:
                    return g.CP_a140_superchargerFaulted;
                case 62:
                    return g.CP_a141_chademoAdapterFault;
                case 63:
                    return g.CP_a142_gbdcScConnFault;
                case 64:
                    return g.CP_a143_unsupportedChargeAdapter;
                case 65:
                    return g.CP_a146_ccsEvseMalfunction;
                case 66:
                    return g.CP_a151_badPilotDiodeDetected;
                case 67:
                    return g.CP_a152_pilotEdgeDetectionFailed;
                case 68:
                    return g.FC_a141_CA_vehConn_OT;
                case 69:
                    return g.FC_a142_CA_evseConn_OT;
                case 70:
                    return g.FC_a143_CA_pcb_OT;
                case 71:
                    return g.FC_a151_CA_vehToEvseDeltaLo;
                case 72:
                    return g.FC_a154_CA_vehToPcbDeltaLo;
                case 73:
                    return g.FC_a161_CA_vehTempHiFoldBk;
                case 74:
                    return g.FC_a162_CA_evseTempHiFoldBk;
                case 75:
                    return g.FC_a163_CA_pcbTempHiFoldBk;
                case 76:
                    return g.FC_a266_GB_negPin_OT;
                case 77:
                    return g.FC_a267_GB_posPin_OT;
                case 78:
                    return g.FC_a268_GB_pcb_OT;
                case 79:
                    return g.FC_a272_GB_negToPosDeltaHi;
                case 80:
                    return g.FC_a273_GB_negToPosDeltaLo;
                case 81:
                    return g.FC_a274_GB_negToPcbDeltaHi;
                case 82:
                    return g.FC_a282_GB_negTempHiFoldBk;
                case 83:
                    return g.FC_a283_GB_posTempHiFoldBk;
                case 84:
                    return g.FC_a284_GB_pcbTempHiFoldBk;
                case 85:
                    return g.FC_a286_GB_evseConnUnlocked;
                case 86:
                    return g.PCS_a007_chgPhaseTempHot;
                case 87:
                    return g.PCS_a016_chgAllPhasesFaulted;
                case 88:
                    return g.PCS_a017_chgWallPowerRemoval;
                case 89:
                    return g.PCS_a019_acChargePowerLimited;
                case 90:
                    return g.PCS_a032_excessiveGridTransientsDetected;
                case 91:
                    return g.PCS_a052_acVoltageNotPresent;
                case 92:
                    return g.PCS_a053_chgInputVDropHigh;
                case 93:
                    return g.PCS_a054_chgInputVDropTooHigh;
                case 94:
                    return g.PCS_a055_chgLineImpedanceHigh;
                case 95:
                    return g.PCS_a056_chgLineImpedanceTooHigh;
                case 96:
                    return g.PCS_a059_chgInputOvRms;
                case 97:
                    return g.PCS_a073_unexpectedAcInputVoltage;
                case 98:
                    return g.PCS_a078_chgStopDcdcTooHot;
                case 99:
                    return g.PCS_a088_gridFreqDroopDetected;
                case 100:
                    return g.PCS_a090_expectedAcVoltageSourceMissing;
                case 101:
                    return g.PCS_a096_microGridOverLoaded;
                case 102:
                    return g.PCS2_a019_DcacADcTempTooHigh;
                case 103:
                    return g.PCS2_a020_DcacBDcTempTooHigh;
                case 104:
                    return g.PCS2_a024_DcacATxTempTooHigh;
                case 105:
                    return g.PCS2_a025_DcacBTxTempTooHigh;
                case 106:
                    return g.PCS2_a062_acVoltageNotPresent;
                case 107:
                    return g.PCS2_a063_chgUnknownGridConfig;
                case 108:
                    return g.PCS2_a112_chgInputVDropTooHigh;
                case 109:
                    return g.PCS2_a115_chgWallPowerRemoval;
                case 110:
                    return g.PCS2_a116_chgPersistentFault;
                case 111:
                    return g.UMC_a001_gndMonIntrptLineSide;
                case 112:
                    return g.UMC_a002_GFCITripped;
                case 113:
                    return g.UMC_a003_GFCISelfTestFault;
                case 114:
                    return g.UMC_a004_inputOverVoltage;
                case 115:
                    return g.UMC_a005_inputUnderVoltage;
                case 116:
                    return g.UMC_a006_contactorWelded;
                case 117:
                    return g.UMC_a007_pcbaOT;
                case 118:
                    return g.UMC_a008_wallPlugOT;
                case 119:
                    return g.UMC_a009_vehConnOT;
                case 120:
                    return g.UMC_a010_inputOT;
                case 121:
                    return g.UMC_a011_proxDisconnected;
                case 122:
                    return g.UMC_a012_pilotFault;
                case 123:
                    return g.UMC_a013_SA_Temperature;
                case 124:
                    return g.UMC_a014_SA_Genealogy;
                case 125:
                    return g.UMC_a015_SA_Connection;
                case 126:
                    return g.UMC_a016_pcbaOTFoldback;
                case 127:
                    return g.UMC_a017_wallPlugOTFoldback;
                case 128:
                    return g.UMC_a018_vehConnOTFoldback;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return g.UMC_a019_inputOTFoldback;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private g(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final g fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<g> getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
