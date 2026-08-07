package ef0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.teslamotors.plugins.ble.messages.NfcSwipeStatus;
import gc0.r;
import j$.time.Instant;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import vc0.c3;
import vc0.i1;
import vc0.m1;
import vc0.m2;
import vc0.n1;
import vc0.p1;
import vc0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0017\u0010\r\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0016\u001a\u0004\u0018\u00010\u0012*\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhf0/m;", "Lxc0/b;", "g", "(Lhf0/m;)Lxc0/b;", "", "e", "(Lhf0/m;)Z", "", "a", "([B)[B", "f", "Lvc0/n1;", "Lvc0/m1;", "b", "(Lvc0/n1;)Lvc0/m1;", "", "keyID", "vin", "Lcom/teslamotors/plugins/ble/messages/NfcSwipeStatus;", "c", "(Lvc0/m1;Ljava/lang/String;Ljava/lang/String;)Lcom/teslamotors/plugins/ble/messages/NfcSwipeStatus;", "Lvc0/c3;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/c3;Ljava/lang/String;Ljava/lang/String;)Lcom/teslamotors/plugins/ble/messages/NfcSwipeStatus;", "tesla-ble_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g {
    public static final byte[] a(byte[] bArr) {
        s.k(bArr, "<this>");
        return p013kotlin.collections.n.G(new byte[]{(byte) ((bArr.length >> 8) & 255), (byte) (bArr.length & 255)}, bArr);
    }

    public static final m1 b(n1 n1Var) {
        List<m1> listC;
        if (n1Var == null || (listC = n1Var.c()) == null) {
            return null;
        }
        return (m1) v.r0(listC, 0);
    }

    public static final NfcSwipeStatus c(m1 m1Var, String keyID, String vin) {
        okio.k kVarC;
        String strH;
        okio.k kVarC2;
        String strH2;
        okio.k kVarC3;
        s.k(m1Var, "<this>");
        s.k(keyID, "keyID");
        s.k(vin, "vin");
        i1 i1VarE = m1Var.getKeyId();
        if (s.f((i1VarE == null || (kVarC3 = i1VarE.getPublicKeySHA1()) == null) ? null : kVarC3.m(), keyID)) {
            return null;
        }
        i1 i1VarE2 = m1Var.getKeyId();
        String str = (i1VarE2 == null || (kVarC2 = i1VarE2.getPublicKeySHA1()) == null || (strH2 = ie0.n.h(kVarC2)) == null) ? "" : strH2;
        m2 m2VarG = m1Var.getPublicKey();
        return new NfcSwipeStatus(vin, str, (m2VarG == null || (kVarC = m2VarG.getPublicKeyRaw()) == null || (strH = ie0.n.h(kVarC)) == null) ? "" : strH, m1Var.getNfcPresence(), m1Var.getBlePresence(), false);
    }

    public static final NfcSwipeStatus d(c3 c3Var, String keyID, String vin) {
        u uVarC;
        p1 p1VarF;
        okio.k kVarC;
        String strH;
        okio.k kVarC2;
        okio.k kVarB;
        String strH2;
        i1 i1VarE;
        okio.k kVarC3;
        s.k(c3Var, "<this>");
        s.k(keyID, "keyID");
        s.k(vin, "vin");
        m1 keyStatus = c3Var.getKeyStatus();
        if (s.f((keyStatus == null || (i1VarE = keyStatus.getKeyId()) == null || (kVarC3 = i1VarE.getPublicKeySHA1()) == null) ? null : kVarC3.m(), keyID)) {
            return null;
        }
        m2 publicKey = c3Var.getPublicKey();
        String str = (publicKey == null || (kVarC2 = publicKey.getPublicKeyRaw()) == null || (kVarB = kVarC2.B()) == null || (strH2 = ie0.n.h(kVarB)) == null) ? "" : strH2;
        m2 publicKey2 = c3Var.getPublicKey();
        String str2 = (publicKey2 == null || (kVarC = publicKey2.getPublicKeyRaw()) == null || (strH = ie0.n.h(kVarC)) == null) ? "" : strH;
        m1 keyStatus2 = c3Var.getKeyStatus();
        if (keyStatus2 == null || (uVarC = keyStatus2.getBlePresence()) == null) {
            uVarC = u.BLE_PRESENCE_PRESENT;
        }
        u uVar = uVarC;
        m1 keyStatus3 = c3Var.getKeyStatus();
        if (keyStatus3 == null || (p1VarF = keyStatus3.getNfcPresence()) == null) {
            p1VarF = p1.NFC_PRESENCE_NOT_PRESENT;
        }
        return new NfcSwipeStatus(vin, str, str2, p1VarF, uVar, true);
    }

    public static final boolean e(hf0.m mVar) {
        Set<String> set;
        return (mVar == null || (set = mVar.f72691x) == null || !(set.isEmpty() ^ true) || !mVar.f72683p || mVar.f72690w == null) ? false : true;
    }

    public static final byte[] f(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return null;
        }
        return p013kotlin.collections.n.u(bArr, 2, bArr.length);
    }

    public static final xc0.b g(hf0.m mVar) {
        s.k(mVar, "<this>");
        Set<String> whitelistKeys = mVar.f72691x;
        s.j(whitelistKeys, "whitelistKeys");
        boolean z11 = true;
        if (whitelistKeys.isEmpty() || !mVar.f72683p || mVar.f72690w == null) {
            z11 = false;
        }
        Boolean bool = mVar.f72676i;
        Boolean bool2 = Boolean.TRUE;
        boolean zF = s.f(bool, bool2);
        boolean z12 = mVar.f72689v;
        Integer num = mVar.f72668a;
        boolean z13 = (num != null ? num.intValue() : 0) > 0;
        Integer num2 = mVar.f72670c;
        boolean z14 = (num2 != null ? num2.intValue() : 0) > 0 ? z11 : false;
        Integer num3 = mVar.f72669b;
        boolean z15 = (num3 != null ? num3.intValue() : 0) > 0 ? z11 : false;
        Integer num4 = mVar.f72671d;
        return new xc0.b(z11, zF, z12, new r(false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, null, null, null, null, Instant.ofEpochMilli((long) mVar.f72686s), Boolean.valueOf(z13), Boolean.valueOf(z14), Boolean.valueOf(z15), Boolean.valueOf((num4 != null ? num4.intValue() : 0) > 0), Boolean.valueOf(s.f(mVar.f72674g, bool2)), Boolean.valueOf(s.f(mVar.f72675h, bool2)), null, null, null, null, null, Boolean.valueOf(mVar.f72678k), null, Boolean.valueOf(mVar.f72681n), null, null, null, null, null, null, null, null, null, null, null, -266338305, 32757, null), null, 16, null);
    }
}
