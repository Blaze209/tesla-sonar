package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimCarrierId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class protocolError extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKAppID = 1;
    private static int[] getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimCarrierId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] AuthenticationRequestParameters;
        private static char ChallengeResult;
        private static int ChallengeResultCancelled;
        private static long getDeviceData;
        private static int getMessageVersion;
        private static char getSDKAppID;
        private static char getSDKReferenceNumber;
        private static char getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getMessageVersion = 0;
            ChallengeResultCancelled = 1;
            AuthenticationRequestParameters = new char[]{46414, 48141, 42926, 43342, 36901, 39832, 36204, 62681, 65453, 57600, 59637, 55015, 57265, 50256, 51966, 62366, 63551, 61127, 38778, 35048, 33195, 39432, 38128, 44432, 42531, 45258, 51581, 49673, 56480, 54552, 61411, 63627, 61743, 3018, 1149, 7447, 6026, 8299, 14593, 13228, 19545, 18152, 24457, 26665, 25280, 31587, 29698, 36535, 34638, 'W', 2371, 4784, 7169, 9519, 11975, 14370, 16771, 19196, 21529, 23992, 26398, 28795, 31194, 33649, 35998, 38397, 40740, 43153, 45541, 47943, 50351, 52750, 55142, 57549, 60024, 62342, 64753, '\n', 2377, 4842, 7174, 9573, 11980, 14393, 16781, 19183, 21591, 23990, 26398, 28789, 'I', 25, 2370, 4774, 7229, 9579, 11979, 14389, 16793, 63415, 65274, 58650, 60325, 53952, 55655, 47256, 45519, 43573, 42133, 40417, 38488, 32940, 27909, 25692, 32697, 28930, 18489, 17374, 21821, 11420, 10217, 14661, 12526, 2580, 7527, 2843, 604, 6571, 5914, 11884, 9623, 22289, 24140, 17830, 19223, 29280, 31193, 28474, 5766, 7678, 839, 2815, 12292, 10081, 11994, 54315, 56203, 53353, 55596, 49865, 52343, 62735, 65197, 59486, 32869, 35133, '\f', 2388, 4773, 7169, 9573, 11998, 14381, 16798, 19168, 63022, 65398, 58503, 59939, 54087, 55548, 52751, 47036, 48322, 41506, '\f', 2388, 4773, 7169, 9573, 11996, 14371, 16799, 19196, 21587, 24034, 19893, 17648, 24331, 20915, 26838, 25458, 30123, 3131, 1886, 6632, 4099, 54369, 56612, 50911, 51303, 61698, 64166, 60543, 38388, 40577, 32829, 35303, 45943, 42002, 44468, 22367, 48660, 46869, 44277, 41550, 39712, 37058, 34428, 65484, 62631, 59923, 58296, 55618, 52775, 51100, 15723, 13004, 11176, 'W', 2370, 4769, 7188, 47102, 48892, 42260, 43960, 37597, 39266, 36744, 63084, 64835, 58358, 59923, 'W', 2389, 4797, 7185, 9588, 11979, 14369, 16837, 19195, 21588, 23997, 26396, 55948, 54155, 51322, 50903, 65471, 62490, 58085, 39710, 36913, 36484, 34657, 'W', 2371, 4784, 7169, 18539, 16680, 23179, 21601, 27924, 26278, 28737, 2543, 711, 7231, 5594, 12128, 14341, 27, 2399, 4773, 7180, 9583, 11977, 14377, 16772, 19173, 21593, 23984, 41447, 43198, 45915, 48608, 34008, 36651, 39372, 57471, 60240, 62899, 64599, 50907, 53634, 55337, 8911, 11617, 13313, 16094, 30322, 32569, 25804, 27243, 21267, 22695, 20034, 14270, 15489, 8757, 11229, 4390, 1560, 4011, 62793, 64244, 58301, 59741, 57085, 51099, 52543, 45767, 47205, 'W', 2389, 4774, 7179, 9582, 11905, 'W', 2389, 4797, 7185, 9588, 11979, 14369, 16837, 19178, 21599, 23994, 26461, 28790, 31199, 33589, 35990, 38379, 40743, 43138, 45543, 47887, 'W', 2389, 4797, 7185, 9588, 11979, 14369, 16837, 19195, 21586, 24059, 26378, 28786, 31191, 33586, 36053, 'W', 2389, 4797, 7185, 9588, 11979, 14369, 16837, 19184, 21588, 23997, 26396, 28735, 6999, 4691, 2487, 1808, 15919, 13772, 8997, 23172, 20903, 'W', 2390, 4790, 7181, 9571, 11905, 14399, 16783, 19172, 21584, 24059, 26399, 28799, 31179, 33586, 35982, 38379, 'W', 2390, 4790, 7181, 9571, 11905, 'W', 2389, 4797, 7185, 9519, 11976, 14399, 16837, 19195, 21587, 23992, 26395, 28798, 31179, 33572, 36053, 38376, 40745, 43144, 45547, 47939, 50359, 18, 2375, 4786, 7171, 9518, 11970, 14381, 16772, 19183, 21528, 23936, 26394, 28770, 31195, 33597, 35998, 6359, 4494, 2681, 1228, 15784};
            getDeviceData = -9087220511890470618L;
            getSDKAppID = (char) 6198;
            getSDKReferenceNumber = (char) 60465;
            getSDKTransactionID = (char) 25552;
            ChallengeResult = '3';
        }

        private getSDKReferenceNumber() {
        }

        /* JADX WARN: Failed to calculate best type for var: r13v242 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v242 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r6v315 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v315 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 6 more
         */
        /* JADX WARN: Failed to calculate best type for var: r6v315 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v315 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r6v316 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v316 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r6v318 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v318 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r6v319 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v319 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r6v320 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v320 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /*  JADX ERROR: Types fix failed
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v315 ??, new type: long
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
            	... 5 more
            */
        public static java.lang.Object[] AuthenticationRequestParameters$4d2bbf64(int r77, java.lang.Object r78) {
            /*
                Method dump skipped, instruction units count: 15171
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.protocolError.getSDKReferenceNumber.AuthenticationRequestParameters$4d2bbf64(int, java.lang.Object):java.lang.Object[]");
        }

        private static void a(byte b11, byte b12, short s11, Object[] objArr) {
            byte[] bArr = $$a;
            int i11 = b11 + 4;
            int i12 = 122 - b12;
            byte[] bArr2 = new byte[21 - s11];
            int i13 = 20 - s11;
            int i14 = -1;
            if (bArr == null) {
                i12 = (i12 + i13) - 3;
            }
            while (true) {
                i14++;
                bArr2[i14] = (byte) i12;
                i11++;
                if (i14 == i13) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i12 = (i12 + bArr[i11]) - 3;
            }
        }

        /* JADX WARN: Code duplicated, block: B:38:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:39:0x01c7  */
        private static void b(char c11, int i11, int i12, Object[] objArr) throws Throwable {
            Throwable cause;
            int i13;
            int i14;
            atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
            long[] jArr = new long[i12];
            int i15 = 0;
            buildConfig.getDeviceData = 0;
            $10 = ($11 + 13) % 128;
            while (true) {
                int i16 = buildConfig.getDeviceData;
                if (i16 >= i12) {
                    break;
                }
                $10 = ($11 + 91) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(AuthenticationRequestParameters[i11 + i16])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(1019086628);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i14 = i15;
                        i13 = 2;
                    } else {
                        i13 = 2;
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1773 - (ExpandableListView.getPackedPositionForChild(i15, i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i15, i15) == 0L ? 0 : -1)), (char) ((Process.getThreadPriority(i15) + 20) >> 6), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32);
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        i14 = i15;
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, (byte) (b12 | 8), objArr3);
                        method = cls2.getMethod((String) objArr3[i14], cls);
                        map.put(1019086628, method);
                    }
                    Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                    l11.longValue();
                    long j11 = buildConfig.getDeviceData;
                    long j12 = getDeviceData;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(c11);
                    objArr4[i13] = Long.valueOf(j12);
                    objArr4[1] = Long.valueOf(j11);
                    objArr4[i14] = l11;
                    Object method2 = map.get(-1106061844);
                    if (method2 == null) {
                        int i17 = i14;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(441 - (TypedValue.complexToFloat(i14) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i14) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 37 - View.MeasureSpec.makeMeasureSpec(i17, i17));
                        Class cls4 = Long.TYPE;
                        method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                        map.put(-1106061844, method2);
                    }
                    jArr[i16] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = new Object[i13];
                    objArr5[1] = buildConfig;
                    objArr5[0] = buildConfig;
                    Object method3 = map.get(1947342796);
                    if (method3 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 1919, (char) (ViewConfiguration.getScrollBarSize() >> 8), View.combineMeasuredStates(0, 0) + 29);
                        byte b13 = (byte) 0;
                        Object[] objArr6 = new Object[1];
                        d(b13, b13, (byte) (-$$d[1]), objArr6);
                        method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1947342796, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    jArr = jArr;
                    i15 = 0;
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            long[] jArr2 = jArr;
            char[] cArr = new char[i12];
            buildConfig.getDeviceData = 0;
            while (true) {
                int i18 = buildConfig.getDeviceData;
                if (i18 >= i12) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i18] = (char) jArr2[i18];
                Object[] objArr7 = {buildConfig, buildConfig};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method4 = map2.get(1947342796);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.green(0) + 1919, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 29 - KeyEvent.getDeadChar(0, 0));
                    byte b14 = (byte) 0;
                    Object[] objArr8 = new Object[1];
                    d(b14, b14, (byte) (-$$d[1]), objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(1947342796, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
        }

        private static void c(String str, int i11, Object[] objArr) throws Throwable {
            int i12;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.az.ChallengeStatusHandler challengeStatusHandler = new atd.az.ChallengeStatusHandler();
            char[] cArr = new char[charArray.length];
            int i13 = 0;
            challengeStatusHandler.getSDKReferenceNumber = 0;
            int i14 = 2;
            char[] cArr2 = new char[2];
            $11 = ($10 + 77) % 128;
            while (true) {
                int i15 = challengeStatusHandler.getSDKReferenceNumber;
                if (i15 >= charArray.length) {
                    objArr[0] = new String(cArr, 0, i11);
                    return;
                }
                $11 = ($10 + 115) % 128;
                cArr2[i13] = charArray[i15];
                int i16 = 1;
                cArr2[1] = charArray[i15 + 1];
                int i17 = 58224;
                int i18 = i13;
                while (i18 < 16) {
                    char c11 = cArr2[i16];
                    char c12 = cArr2[i13];
                    int i19 = i14;
                    char[] cArr3 = cArr2;
                    int i21 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) getSDKTransactionID) ^ (-2881362678149017980L))));
                    int i22 = c12 >>> 5;
                    int i23 = i16;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(ChallengeResult);
                        objArr2[i19] = Integer.valueOf(i22);
                        objArr2[i23] = Integer.valueOf(i21);
                        objArr2[i13] = Integer.valueOf(c11);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i12 = i13;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1746 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 16682), 29 - TextUtils.getTrimmedLength(""));
                            byte b11 = (byte) i13;
                            i12 = i13;
                            Object[] objArr3 = new Object[i23];
                            d(b11, b11, (byte) $$d.length, objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c13 = cArr3[i12];
                        int i24 = ((cCharValue << 4) + ((char) (((long) getSDKAppID) ^ (-2881362678149017980L)))) ^ (cCharValue + i17);
                        int i25 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(getSDKReferenceNumber);
                        objArr4[i19] = Integer.valueOf(i25);
                        objArr4[1] = Integer.valueOf(i24);
                        objArr4[i12] = Integer.valueOf(c13);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            int i26 = i12;
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.getDefaultSize(i26, i26) + 1745, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 16682), TextUtils.indexOf("", "") + 29);
                            byte b12 = (byte) 0;
                            Object[] objArr5 = new Object[1];
                            d(b12, b12, (byte) $$d.length, objArr5);
                            method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i17 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i18++;
                        i14 = i19;
                        cArr2 = cArr3;
                        charArray = charArray;
                        i13 = 0;
                        i16 = 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                char[] cArr4 = charArray;
                int i27 = i14;
                char[] cArr5 = cArr2;
                int i28 = challengeStatusHandler.getSDKReferenceNumber;
                cArr[i28] = cArr5[0];
                cArr[i28 + 1] = cArr5[1];
                Object[] objArr6 = new Object[i27];
                objArr6[1] = challengeStatusHandler;
                objArr6[0] = challengeStatusHandler;
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(1312076635);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1596 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (27823 - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionChild(0L) + 26);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    d(b13, b14, b14, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i14 = i27;
                cArr2 = cArr5;
                charArray = cArr4;
                i13 = 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = atd.w.protocolError.getSDKReferenceNumber.$$d
                int r5 = r5 * 3
                int r5 = r5 + 4
                int r6 = r6 * 3
                int r1 = 1 - r6
                int r7 = 116 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
                if (r0 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L24:
                r4 = r0[r5]
                int r3 = r3 + 1
            L28:
                int r5 = r5 + 1
                int r7 = r7 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.protocolError.getSDKReferenceNumber.d(short, short, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{107, 31, -31, -112, -30, 1, 18, -30, -12, 10, 10, 22, 4, 2, Tnaf.POW_2_WIDTH, -10, 12, -8, 5, -20, 42, -5, -8, 6, Tnaf.POW_2_WIDTH, 8, -18, -44, 44, -2, -20, 1, 18, -45, 36, 20, -10, -3, 5, -30, 32, 22, -16};
            $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
        }

        static void init$1() {
            $$d = new byte[]{47, -3, 31, -125};
            $$e = 14;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        View.getDefaultSize(0, 0);
        new getSDKReferenceNumber((byte) 0);
        getSDKAppID = (AuthenticationRequestParameters + 19) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public protocolError(Application application) {
        super(application);
        s.k(application, "");
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = new int[]{-1875887350, 1197959747, 361649148, 2031716088, -663408709, 1206209923, 1944165574, -660733440, 205290989, -2053782915, 356005480, 554546943, 269748507, 770200972, 1075167804, 1446875902, 561676240, -1238342520};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        if (Build.VERSION.SDK_INT < 28) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
            int i11 = AuthenticationRequestParameters + 115;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 90 / 0;
            }
            return failure;
        }
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i13 = getSDKAppID + 65;
        AuthenticationRequestParameters = i13 % 128;
        int i14 = i13 % 2;
        int iM36constructorimpl = DeviceParameterResult.Success.IntValue.m36constructorimpl(telephonyManagerCF_.getSimCarrierId());
        if (i14 == 0) {
            return DeviceParameterResult.Success.IntValue.m35boximpl(iM36constructorimpl);
        }
        DeviceParameterResult.Success.IntValue.m35boximpl(iM36constructorimpl);
        throw null;
    }
}
