package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b1\u0018\u0000 l2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u0089\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0002H\u0017¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104H\u0096\u0002¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u008f\u0004\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010/\u001a\u00020.¢\u0006\u0004\b?\u0010@R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\bD\u0010CR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010A\u001a\u0004\bH\u0010CR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010CR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010A\u001a\u0004\bL\u0010CR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010A\u001a\u0004\bE\u0010CR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bP\u0010CR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010A\u001a\u0004\bQ\u0010CR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010A\u001a\u0004\bS\u0010CR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010CR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bV\u0010CR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010A\u001a\u0004\bR\u0010CR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010A\u001a\u0004\bG\u0010CR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010A\u001a\u0004\bW\u0010CR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bY\u0010CR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010A\u001a\u0004\b[\u0010CR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010A\u001a\u0004\b]\u0010CR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010A\u001a\u0004\b_\u0010CR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010A\u001a\u0004\bT\u0010CR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010A\u001a\u0004\bI\u0010CR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010A\u001a\u0004\bc\u0010CR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010A\u001a\u0004\bK\u0010CR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bd\u0010CR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010A\u001a\u0004\be\u0010CR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010A\u001a\u0004\bf\u0010CR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010A\u001a\u0004\bg\u0010CR\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010A\u001a\u0004\bh\u0010CR\u001c\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010A\u001a\u0004\bM\u0010CR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010A\u001a\u0004\bi\u0010CR\u001c\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010A\u001a\u0004\bN\u0010CR\u001c\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010A\u001a\u0004\bX\u0010CR\u001c\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010A\u001a\u0004\b`\u0010CR\u001c\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010A\u001a\u0004\bZ\u0010CR\u001c\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010A\u001a\u0004\ba\u0010CR\u001c\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010A\u001a\u0004\b\\\u0010CR\u001c\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010A\u001a\u0004\bb\u0010CR\u001c\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010A\u001a\u0004\b^\u0010CR\u001c\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010A\u001a\u0004\bj\u0010CR\u001c\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010A\u001a\u0004\bk\u0010CR\u001c\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010A\u001a\u0004\bl\u0010C¨\u0006m"}, d2 = {"Lec0/j;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Default", "M3SRPlus2020", "M3LR2020", "M3LRPerformance2020", "M3SRPlus2020Q4GFSH", "MY2020", "M32021", "MY2021", "M3SRPlus2021Q3GFSH", "M3SRPlus2021Q3FREMONT", "MYSRPlus2021Q3GFSH", "MYSRPlus2022Q1TX", "MYRWDEU2022", "M3POPPYSEED2024", "M32023GFSHEXPORT", "MY2023GFSHEXPORT", "MY2024", "MY2023SRRWD", "MY2024C", "MY2024GFSHExportSRRWD", "M3POPPYSEED2024C", "M32025", "MY2025", "M32025B", "MY2025B", "MYRefresh2025Row", "MYStandard2025", "MYRefresh2025CN", "MY2025M53", "M32025M53", "MY2025CNPlus", "M32026B", "MS2024", "MX2024", "MS2025", "MX2025", "MS2026", "MX2026", "MS2026B", "SX2020", "S2", "SX2020H2", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lec0/j;", "Lec0/h0;", "b", "()Lec0/h0;", "m", "c", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "j", "e", "n", "f", "x", "g", "h", "y", "p", "o", "k", "L", "l", Gender.MALE, "I", "z", "q", "B", "r", "A", "s", "C", "t", "D", "u", "v", "w", "E", Gender.FEMALE, "K", Gender.NONE, "J", "H", "G", "P", Gender.OTHER, "Q", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends com.squareup.wire.f {
    public static final ProtoAdapter<j> R = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(j.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 37)
    private final h0 MYStandard2025;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 38)
    private final h0 MYRefresh2025CN;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 41)
    private final h0 MY2025M53;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 42)
    private final h0 M32025M53;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 43)
    private final h0 MY2025CNPlus;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 45)
    private final h0 M32026B;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 22)
    private final h0 MS2024;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 23)
    private final h0 MX2024;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 34)
    private final h0 MS2025;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 35)
    private final h0 MX2025;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 39)
    private final h0 MS2026;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 40)
    private final h0 MX2026;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 44)
    private final h0 MS2026B;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)
    private final h0 SX2020;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)
    private final h0 S2;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 11)
    private final h0 SX2020H2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final h0 Default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final h0 M3SRPlus2020;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final h0 M3LR2020;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final h0 M3LRPerformance2020;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
    private final h0 M3SRPlus2020Q4GFSH;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
    private final h0 MY2020;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)
    private final h0 M32021;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)
    private final h0 MY2021;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 12)
    private final h0 M3SRPlus2021Q3GFSH;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 13)
    private final h0 M3SRPlus2021Q3FREMONT;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 14)
    private final h0 MYSRPlus2021Q3GFSH;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 15)
    private final h0 MYSRPlus2022Q1TX;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 16)
    private final h0 MYRWDEU2022;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 17)
    private final h0 M3POPPYSEED2024;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 18)
    private final h0 M32023GFSHEXPORT;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 19)
    private final h0 MY2023GFSHEXPORT;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 20)
    private final h0 MY2024;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 24)
    private final h0 MY2023SRRWD;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 27)
    private final h0 MY2024C;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 28)
    private final h0 MY2024GFSHExportSRRWD;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 29)
    private final h0 M3POPPYSEED2024C;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 30)
    private final h0 M32025;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 31)
    private final h0 MY2025;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 32)
    private final h0 M32025B;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 33)
    private final h0 MY2025B;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 36)
    private final h0 MYRefresh2025Row;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/j$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/j;", "value", "", "c", "(Lec0/j;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/j;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/j;", DateTokenConverter.CONVERTER_KEY, "(Lec0/j;)Lec0/j;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<j> {
        a(com.squareup.wire.b bVar, co0.d<j> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.EfficiencyPackage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            h0 h0VarDecode = null;
            h0 h0VarDecode2 = null;
            h0 h0VarDecode3 = null;
            h0 h0VarDecode4 = null;
            h0 h0VarDecode5 = null;
            h0 h0VarDecode6 = null;
            h0 h0VarDecode7 = null;
            h0 h0VarDecode8 = null;
            h0 h0VarDecode9 = null;
            h0 h0VarDecode10 = null;
            h0 h0VarDecode11 = null;
            h0 h0VarDecode12 = null;
            h0 h0VarDecode13 = null;
            h0 h0VarDecode14 = null;
            h0 h0VarDecode15 = null;
            h0 h0VarDecode16 = null;
            h0 h0VarDecode17 = null;
            h0 h0VarDecode18 = null;
            h0 h0VarDecode19 = null;
            h0 h0VarDecode20 = null;
            h0 h0VarDecode21 = null;
            h0 h0VarDecode22 = null;
            h0 h0VarDecode23 = null;
            h0 h0VarDecode24 = null;
            h0 h0VarDecode25 = null;
            h0 h0VarDecode26 = null;
            h0 h0VarDecode27 = null;
            h0 h0VarDecode28 = null;
            h0 h0VarDecode29 = null;
            h0 h0VarDecode30 = null;
            h0 h0VarDecode31 = null;
            h0 h0VarDecode32 = null;
            h0 h0VarDecode33 = null;
            h0 h0VarDecode34 = null;
            h0 h0VarDecode35 = null;
            h0 h0VarDecode36 = null;
            h0 h0VarDecode37 = null;
            h0 h0VarDecode38 = null;
            h0 h0VarDecode39 = null;
            h0 h0VarDecode40 = null;
            h0 h0VarDecode41 = null;
            h0 h0VarDecode42 = null;
            while (true) {
                int iG = reader.g();
                h0 h0Var = h0VarDecode;
                if (iG == -1) {
                    return new j(h0VarDecode42, h0Var, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, h0VarDecode7, h0VarDecode8, h0VarDecode9, h0VarDecode10, h0VarDecode11, h0VarDecode12, h0VarDecode13, h0VarDecode14, h0VarDecode15, h0VarDecode16, h0VarDecode17, h0VarDecode18, h0VarDecode19, h0VarDecode20, h0VarDecode21, h0VarDecode22, h0VarDecode23, h0VarDecode24, h0VarDecode25, h0VarDecode26, h0VarDecode27, h0VarDecode28, h0VarDecode29, h0VarDecode30, h0VarDecode31, h0VarDecode32, h0VarDecode33, h0VarDecode34, h0VarDecode35, h0VarDecode36, h0VarDecode37, h0VarDecode38, h0VarDecode39, h0VarDecode40, h0VarDecode41, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        h0VarDecode42 = h0.f62622b.decode(reader);
                        break;
                    case 2:
                        h0VarDecode = h0.f62622b.decode(reader);
                        continue;
                    case 3:
                        h0VarDecode2 = h0.f62622b.decode(reader);
                        break;
                    case 4:
                        h0VarDecode3 = h0.f62622b.decode(reader);
                        break;
                    case 5:
                        h0VarDecode4 = h0.f62622b.decode(reader);
                        break;
                    case 6:
                        h0VarDecode5 = h0.f62622b.decode(reader);
                        break;
                    case 7:
                        h0VarDecode6 = h0.f62622b.decode(reader);
                        break;
                    case 8:
                        h0VarDecode7 = h0.f62622b.decode(reader);
                        break;
                    case 9:
                        h0VarDecode39 = h0.f62622b.decode(reader);
                        break;
                    case 10:
                        h0VarDecode40 = h0.f62622b.decode(reader);
                        break;
                    case 11:
                        h0VarDecode41 = h0.f62622b.decode(reader);
                        break;
                    case 12:
                        h0VarDecode8 = h0.f62622b.decode(reader);
                        break;
                    case 13:
                        h0VarDecode9 = h0.f62622b.decode(reader);
                        break;
                    case 14:
                        h0VarDecode10 = h0.f62622b.decode(reader);
                        break;
                    case 15:
                        h0VarDecode11 = h0.f62622b.decode(reader);
                        break;
                    case 16:
                        h0VarDecode12 = h0.f62622b.decode(reader);
                        break;
                    case 17:
                        h0VarDecode13 = h0.f62622b.decode(reader);
                        break;
                    case 18:
                        h0VarDecode14 = h0.f62622b.decode(reader);
                        break;
                    case 19:
                        h0VarDecode15 = h0.f62622b.decode(reader);
                        break;
                    case 20:
                        h0VarDecode16 = h0.f62622b.decode(reader);
                        break;
                    case 21:
                    case 25:
                    case 26:
                    default:
                        reader.m(iG);
                        break;
                    case 22:
                        h0VarDecode32 = h0.f62622b.decode(reader);
                        break;
                    case 23:
                        h0VarDecode33 = h0.f62622b.decode(reader);
                        break;
                    case 24:
                        h0VarDecode17 = h0.f62622b.decode(reader);
                        break;
                    case 27:
                        h0VarDecode18 = h0.f62622b.decode(reader);
                        break;
                    case 28:
                        h0VarDecode19 = h0.f62622b.decode(reader);
                        break;
                    case 29:
                        h0VarDecode20 = h0.f62622b.decode(reader);
                        break;
                    case 30:
                        h0VarDecode21 = h0.f62622b.decode(reader);
                        break;
                    case 31:
                        h0VarDecode22 = h0.f62622b.decode(reader);
                        break;
                    case 32:
                        h0VarDecode23 = h0.f62622b.decode(reader);
                        break;
                    case 33:
                        h0VarDecode24 = h0.f62622b.decode(reader);
                        break;
                    case 34:
                        h0VarDecode34 = h0.f62622b.decode(reader);
                        break;
                    case 35:
                        h0VarDecode35 = h0.f62622b.decode(reader);
                        break;
                    case 36:
                        h0VarDecode25 = h0.f62622b.decode(reader);
                        break;
                    case 37:
                        h0VarDecode26 = h0.f62622b.decode(reader);
                        break;
                    case 38:
                        h0VarDecode27 = h0.f62622b.decode(reader);
                        break;
                    case 39:
                        h0VarDecode36 = h0.f62622b.decode(reader);
                        break;
                    case 40:
                        h0VarDecode37 = h0.f62622b.decode(reader);
                        break;
                    case 41:
                        h0VarDecode28 = h0.f62622b.decode(reader);
                        break;
                    case 42:
                        h0VarDecode29 = h0.f62622b.decode(reader);
                        break;
                    case 43:
                        h0VarDecode30 = h0.f62622b.decode(reader);
                        break;
                    case 44:
                        h0VarDecode38 = h0.f62622b.decode(reader);
                        break;
                    case 45:
                        h0VarDecode31 = h0.f62622b.decode(reader);
                        break;
                }
                h0VarDecode = h0Var;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, j value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getDefault());
            protoAdapter.encodeWithTag(writer, 2, value.getM3SRPlus2020());
            protoAdapter.encodeWithTag(writer, 3, value.getM3LR2020());
            protoAdapter.encodeWithTag(writer, 4, value.getM3LRPerformance2020());
            protoAdapter.encodeWithTag(writer, 5, value.getM3SRPlus2020Q4GFSH());
            protoAdapter.encodeWithTag(writer, 6, value.getMY2020());
            protoAdapter.encodeWithTag(writer, 7, value.getM32021());
            protoAdapter.encodeWithTag(writer, 8, value.getMY2021());
            protoAdapter.encodeWithTag(writer, 12, value.getM3SRPlus2021Q3GFSH());
            protoAdapter.encodeWithTag(writer, 13, value.getM3SRPlus2021Q3FREMONT());
            protoAdapter.encodeWithTag(writer, 14, value.getMYSRPlus2021Q3GFSH());
            protoAdapter.encodeWithTag(writer, 15, value.getMYSRPlus2022Q1TX());
            protoAdapter.encodeWithTag(writer, 16, value.getMYRWDEU2022());
            protoAdapter.encodeWithTag(writer, 17, value.getM3POPPYSEED2024());
            protoAdapter.encodeWithTag(writer, 18, value.getM32023GFSHEXPORT());
            protoAdapter.encodeWithTag(writer, 19, value.getMY2023GFSHEXPORT());
            protoAdapter.encodeWithTag(writer, 20, value.getMY2024());
            protoAdapter.encodeWithTag(writer, 24, value.getMY2023SRRWD());
            protoAdapter.encodeWithTag(writer, 27, value.getMY2024C());
            protoAdapter.encodeWithTag(writer, 28, value.getMY2024GFSHExportSRRWD());
            protoAdapter.encodeWithTag(writer, 29, value.getM3POPPYSEED2024C());
            protoAdapter.encodeWithTag(writer, 30, value.getM32025());
            protoAdapter.encodeWithTag(writer, 31, value.getMY2025());
            protoAdapter.encodeWithTag(writer, 32, value.getM32025B());
            protoAdapter.encodeWithTag(writer, 33, value.getMY2025B());
            protoAdapter.encodeWithTag(writer, 36, value.getMYRefresh2025Row());
            protoAdapter.encodeWithTag(writer, 37, value.getMYStandard2025());
            protoAdapter.encodeWithTag(writer, 38, value.getMYRefresh2025CN());
            protoAdapter.encodeWithTag(writer, 41, value.getMY2025M53());
            protoAdapter.encodeWithTag(writer, 42, value.getM32025M53());
            protoAdapter.encodeWithTag(writer, 43, value.getMY2025CNPlus());
            protoAdapter.encodeWithTag(writer, 45, value.getM32026B());
            protoAdapter.encodeWithTag(writer, 22, value.getMS2024());
            protoAdapter.encodeWithTag(writer, 23, value.getMX2024());
            protoAdapter.encodeWithTag(writer, 34, value.getMS2025());
            protoAdapter.encodeWithTag(writer, 35, value.getMX2025());
            protoAdapter.encodeWithTag(writer, 39, value.getMS2026());
            protoAdapter.encodeWithTag(writer, 40, value.getMX2026());
            protoAdapter.encodeWithTag(writer, 44, value.getMS2026B());
            protoAdapter.encodeWithTag(writer, 9, value.getSX2020());
            protoAdapter.encodeWithTag(writer, 10, value.getS2());
            protoAdapter.encodeWithTag(writer, 11, value.getSX2020H2());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(j value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getDefault()) + protoAdapter.encodedSizeWithTag(2, value.getM3SRPlus2020()) + protoAdapter.encodedSizeWithTag(3, value.getM3LR2020()) + protoAdapter.encodedSizeWithTag(4, value.getM3LRPerformance2020()) + protoAdapter.encodedSizeWithTag(5, value.getM3SRPlus2020Q4GFSH()) + protoAdapter.encodedSizeWithTag(6, value.getMY2020()) + protoAdapter.encodedSizeWithTag(7, value.getM32021()) + protoAdapter.encodedSizeWithTag(8, value.getMY2021()) + protoAdapter.encodedSizeWithTag(12, value.getM3SRPlus2021Q3GFSH()) + protoAdapter.encodedSizeWithTag(13, value.getM3SRPlus2021Q3FREMONT()) + protoAdapter.encodedSizeWithTag(14, value.getMYSRPlus2021Q3GFSH()) + protoAdapter.encodedSizeWithTag(15, value.getMYSRPlus2022Q1TX()) + protoAdapter.encodedSizeWithTag(16, value.getMYRWDEU2022()) + protoAdapter.encodedSizeWithTag(17, value.getM3POPPYSEED2024()) + protoAdapter.encodedSizeWithTag(18, value.getM32023GFSHEXPORT()) + protoAdapter.encodedSizeWithTag(19, value.getMY2023GFSHEXPORT()) + protoAdapter.encodedSizeWithTag(20, value.getMY2024()) + protoAdapter.encodedSizeWithTag(24, value.getMY2023SRRWD()) + protoAdapter.encodedSizeWithTag(27, value.getMY2024C()) + protoAdapter.encodedSizeWithTag(28, value.getMY2024GFSHExportSRRWD()) + protoAdapter.encodedSizeWithTag(29, value.getM3POPPYSEED2024C()) + protoAdapter.encodedSizeWithTag(30, value.getM32025()) + protoAdapter.encodedSizeWithTag(31, value.getMY2025()) + protoAdapter.encodedSizeWithTag(32, value.getM32025B()) + protoAdapter.encodedSizeWithTag(33, value.getMY2025B()) + protoAdapter.encodedSizeWithTag(36, value.getMYRefresh2025Row()) + protoAdapter.encodedSizeWithTag(37, value.getMYStandard2025()) + protoAdapter.encodedSizeWithTag(38, value.getMYRefresh2025CN()) + protoAdapter.encodedSizeWithTag(41, value.getMY2025M53()) + protoAdapter.encodedSizeWithTag(42, value.getM32025M53()) + protoAdapter.encodedSizeWithTag(43, value.getMY2025CNPlus()) + protoAdapter.encodedSizeWithTag(45, value.getM32026B()) + protoAdapter.encodedSizeWithTag(22, value.getMS2024()) + protoAdapter.encodedSizeWithTag(23, value.getMX2024()) + protoAdapter.encodedSizeWithTag(34, value.getMS2025()) + protoAdapter.encodedSizeWithTag(35, value.getMX2025()) + protoAdapter.encodedSizeWithTag(39, value.getMS2026()) + protoAdapter.encodedSizeWithTag(40, value.getMX2026()) + protoAdapter.encodedSizeWithTag(44, value.getMS2026B()) + protoAdapter.encodedSizeWithTag(9, value.getSX2020()) + protoAdapter.encodedSizeWithTag(10, value.getS2()) + protoAdapter.encodedSizeWithTag(11, value.getSX2020H2());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public j redact(j value) {
            h0 h0VarRedact;
            h0 h0Var;
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 h0Var2 = value.getDefault();
            h0 h0VarRedact2 = h0Var2 != null ? h0.f62622b.redact(h0Var2) : null;
            h0 m3SRPlus2020 = value.getM3SRPlus2020();
            h0 h0VarRedact3 = m3SRPlus2020 != null ? h0.f62622b.redact(m3SRPlus2020) : null;
            h0 m3lr2020 = value.getM3LR2020();
            h0 h0VarRedact4 = m3lr2020 != null ? h0.f62622b.redact(m3lr2020) : null;
            h0 m3LRPerformance2020 = value.getM3LRPerformance2020();
            h0 h0VarRedact5 = m3LRPerformance2020 != null ? h0.f62622b.redact(m3LRPerformance2020) : null;
            h0 m3SRPlus2020Q4GFSH = value.getM3SRPlus2020Q4GFSH();
            h0 h0VarRedact6 = m3SRPlus2020Q4GFSH != null ? h0.f62622b.redact(m3SRPlus2020Q4GFSH) : null;
            h0 my2020 = value.getMY2020();
            h0 h0VarRedact7 = my2020 != null ? h0.f62622b.redact(my2020) : null;
            h0 m32021 = value.getM32021();
            h0 h0VarRedact8 = m32021 != null ? h0.f62622b.redact(m32021) : null;
            h0 my2021 = value.getMY2021();
            h0 h0VarRedact9 = my2021 != null ? h0.f62622b.redact(my2021) : null;
            h0 m3SRPlus2021Q3GFSH = value.getM3SRPlus2021Q3GFSH();
            h0 h0VarRedact10 = m3SRPlus2021Q3GFSH != null ? h0.f62622b.redact(m3SRPlus2021Q3GFSH) : null;
            h0 m3SRPlus2021Q3FREMONT = value.getM3SRPlus2021Q3FREMONT();
            h0 h0VarRedact11 = m3SRPlus2021Q3FREMONT != null ? h0.f62622b.redact(m3SRPlus2021Q3FREMONT) : null;
            h0 mYSRPlus2021Q3GFSH = value.getMYSRPlus2021Q3GFSH();
            h0 h0VarRedact12 = mYSRPlus2021Q3GFSH != null ? h0.f62622b.redact(mYSRPlus2021Q3GFSH) : null;
            h0 mYSRPlus2022Q1TX = value.getMYSRPlus2022Q1TX();
            h0 h0VarRedact13 = mYSRPlus2022Q1TX != null ? h0.f62622b.redact(mYSRPlus2022Q1TX) : null;
            h0 myrwdeu2022 = value.getMYRWDEU2022();
            h0 h0VarRedact14 = myrwdeu2022 != null ? h0.f62622b.redact(myrwdeu2022) : null;
            h0 m3poppyseed2024 = value.getM3POPPYSEED2024();
            h0 h0VarRedact15 = m3poppyseed2024 != null ? h0.f62622b.redact(m3poppyseed2024) : null;
            h0 m32023gfshexport = value.getM32023GFSHEXPORT();
            h0 h0Var3 = h0VarRedact2;
            h0 h0VarRedact16 = m32023gfshexport != null ? h0.f62622b.redact(m32023gfshexport) : null;
            h0 my2023gfshexport = value.getMY2023GFSHEXPORT();
            h0 h0Var4 = h0VarRedact16;
            h0 h0VarRedact17 = my2023gfshexport != null ? h0.f62622b.redact(my2023gfshexport) : null;
            h0 my2024 = value.getMY2024();
            h0 h0Var5 = h0VarRedact17;
            h0 h0VarRedact18 = my2024 != null ? h0.f62622b.redact(my2024) : null;
            h0 my2023srrwd = value.getMY2023SRRWD();
            h0 h0Var6 = h0VarRedact18;
            h0 h0VarRedact19 = my2023srrwd != null ? h0.f62622b.redact(my2023srrwd) : null;
            h0 my2024c = value.getMY2024C();
            h0 h0Var7 = h0VarRedact19;
            h0 h0VarRedact20 = my2024c != null ? h0.f62622b.redact(my2024c) : null;
            h0 mY2024GFSHExportSRRWD = value.getMY2024GFSHExportSRRWD();
            h0 h0Var8 = h0VarRedact20;
            h0 h0VarRedact21 = mY2024GFSHExportSRRWD != null ? h0.f62622b.redact(mY2024GFSHExportSRRWD) : null;
            h0 m3poppyseed2024c = value.getM3POPPYSEED2024C();
            h0 h0Var9 = h0VarRedact21;
            h0 h0VarRedact22 = m3poppyseed2024c != null ? h0.f62622b.redact(m3poppyseed2024c) : null;
            h0 m32025 = value.getM32025();
            h0 h0Var10 = h0VarRedact22;
            h0 h0VarRedact23 = m32025 != null ? h0.f62622b.redact(m32025) : null;
            h0 my2025 = value.getMY2025();
            h0 h0Var11 = h0VarRedact23;
            h0 h0VarRedact24 = my2025 != null ? h0.f62622b.redact(my2025) : null;
            h0 m32025b = value.getM32025B();
            h0 h0Var12 = h0VarRedact24;
            h0 h0VarRedact25 = m32025b != null ? h0.f62622b.redact(m32025b) : null;
            h0 my2025b = value.getMY2025B();
            h0 h0Var13 = h0VarRedact25;
            h0 h0VarRedact26 = my2025b != null ? h0.f62622b.redact(my2025b) : null;
            h0 mYRefresh2025Row = value.getMYRefresh2025Row();
            h0 h0Var14 = h0VarRedact26;
            h0 h0VarRedact27 = mYRefresh2025Row != null ? h0.f62622b.redact(mYRefresh2025Row) : null;
            h0 mYStandard2025 = value.getMYStandard2025();
            h0 h0Var15 = h0VarRedact27;
            h0 h0VarRedact28 = mYStandard2025 != null ? h0.f62622b.redact(mYStandard2025) : null;
            h0 mYRefresh2025CN = value.getMYRefresh2025CN();
            h0 h0Var16 = h0VarRedact28;
            h0 h0VarRedact29 = mYRefresh2025CN != null ? h0.f62622b.redact(mYRefresh2025CN) : null;
            h0 my2025m53 = value.getMY2025M53();
            h0 h0Var17 = h0VarRedact29;
            h0 h0VarRedact30 = my2025m53 != null ? h0.f62622b.redact(my2025m53) : null;
            h0 m32025m53 = value.getM32025M53();
            h0 h0Var18 = h0VarRedact30;
            h0 h0VarRedact31 = m32025m53 != null ? h0.f62622b.redact(m32025m53) : null;
            h0 mY2025CNPlus = value.getMY2025CNPlus();
            h0 h0Var19 = h0VarRedact31;
            h0 h0VarRedact32 = mY2025CNPlus != null ? h0.f62622b.redact(mY2025CNPlus) : null;
            h0 m32026b = value.getM32026B();
            h0 h0Var20 = h0VarRedact32;
            h0 h0VarRedact33 = m32026b != null ? h0.f62622b.redact(m32026b) : null;
            h0 ms2024 = value.getMS2024();
            h0 h0Var21 = h0VarRedact33;
            h0 h0VarRedact34 = ms2024 != null ? h0.f62622b.redact(ms2024) : null;
            h0 mx2024 = value.getMX2024();
            h0 h0Var22 = h0VarRedact34;
            h0 h0VarRedact35 = mx2024 != null ? h0.f62622b.redact(mx2024) : null;
            h0 ms2025 = value.getMS2025();
            h0 h0Var23 = h0VarRedact35;
            h0 h0VarRedact36 = ms2025 != null ? h0.f62622b.redact(ms2025) : null;
            h0 mx2025 = value.getMX2025();
            h0 h0Var24 = h0VarRedact36;
            h0 h0VarRedact37 = mx2025 != null ? h0.f62622b.redact(mx2025) : null;
            h0 ms2026 = value.getMS2026();
            h0 h0Var25 = h0VarRedact37;
            h0 h0VarRedact38 = ms2026 != null ? h0.f62622b.redact(ms2026) : null;
            h0 mx2026 = value.getMX2026();
            h0 h0Var26 = h0VarRedact38;
            h0 h0VarRedact39 = mx2026 != null ? h0.f62622b.redact(mx2026) : null;
            h0 ms2026b = value.getMS2026B();
            h0 h0Var27 = h0VarRedact39;
            h0 h0VarRedact40 = ms2026b != null ? h0.f62622b.redact(ms2026b) : null;
            h0 sx2020 = value.getSX2020();
            h0 h0Var28 = h0VarRedact40;
            h0 h0VarRedact41 = sx2020 != null ? h0.f62622b.redact(sx2020) : null;
            h0 s11 = value.getS2();
            h0 h0Var29 = h0VarRedact41;
            h0 h0VarRedact42 = s11 != null ? h0.f62622b.redact(s11) : null;
            h0 sx2020h2 = value.getSX2020H2();
            if (sx2020h2 != null) {
                h0VarRedact = h0.f62622b.redact(sx2020h2);
                h0Var = h0VarRedact42;
            } else {
                h0VarRedact = null;
                h0Var = h0VarRedact42;
            }
            return value.a(h0Var3, h0VarRedact3, h0VarRedact4, h0VarRedact5, h0VarRedact6, h0VarRedact7, h0VarRedact8, h0VarRedact9, h0VarRedact10, h0VarRedact11, h0VarRedact12, h0VarRedact13, h0VarRedact14, h0VarRedact15, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10, h0Var11, h0Var12, h0Var13, h0Var14, h0Var15, h0Var16, h0Var17, h0Var18, h0Var19, h0Var20, h0Var21, h0Var22, h0Var23, h0Var24, h0Var25, h0Var26, h0Var27, h0Var28, h0Var29, h0Var, h0VarRedact, okio.k.f97943e);
        }
    }

    public j() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final h0 getMY2023SRRWD() {
        return this.MY2023SRRWD;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final h0 getMY2024() {
        return this.MY2024;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final h0 getMY2024C() {
        return this.MY2024C;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final h0 getMY2024GFSHExportSRRWD() {
        return this.MY2024GFSHExportSRRWD;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final h0 getMY2025() {
        return this.MY2025;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final h0 getMY2025B() {
        return this.MY2025B;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final h0 getMY2025CNPlus() {
        return this.MY2025CNPlus;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final h0 getMY2025M53() {
        return this.MY2025M53;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final h0 getMYRWDEU2022() {
        return this.MYRWDEU2022;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final h0 getMYRefresh2025CN() {
        return this.MYRefresh2025CN;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final h0 getMYRefresh2025Row() {
        return this.MYRefresh2025Row;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final h0 getMYSRPlus2021Q3GFSH() {
        return this.MYSRPlus2021Q3GFSH;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final h0 getMYSRPlus2022Q1TX() {
        return this.MYSRPlus2022Q1TX;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final h0 getMYStandard2025() {
        return this.MYStandard2025;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final h0 getS2() {
        return this.S2;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final h0 getSX2020() {
        return this.SX2020;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final h0 getSX2020H2() {
        return this.SX2020H2;
    }

    public final j a(h0 Default, h0 M3SRPlus2020, h0 M3LR2020, h0 M3LRPerformance2020, h0 M3SRPlus2020Q4GFSH, h0 MY2020, h0 M32021, h0 MY2021, h0 M3SRPlus2021Q3GFSH, h0 M3SRPlus2021Q3FREMONT, h0 MYSRPlus2021Q3GFSH, h0 MYSRPlus2022Q1TX, h0 MYRWDEU2022, h0 M3POPPYSEED2024, h0 M32023GFSHEXPORT, h0 MY2023GFSHEXPORT, h0 MY2024, h0 MY2023SRRWD, h0 MY2024C, h0 MY2024GFSHExportSRRWD, h0 M3POPPYSEED2024C, h0 M32025, h0 MY2025, h0 M32025B, h0 MY2025B, h0 MYRefresh2025Row, h0 MYStandard2025, h0 MYRefresh2025CN, h0 MY2025M53, h0 M32025M53, h0 MY2025CNPlus, h0 M32026B, h0 MS2024, h0 MX2024, h0 MS2025, h0 MX2025, h0 MS2026, h0 MX2026, h0 MS2026B, h0 SX2020, h0 S2, h0 SX2020H2, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new j(Default, M3SRPlus2020, M3LR2020, M3LRPerformance2020, M3SRPlus2020Q4GFSH, MY2020, M32021, MY2021, M3SRPlus2021Q3GFSH, M3SRPlus2021Q3FREMONT, MYSRPlus2021Q3GFSH, MYSRPlus2022Q1TX, MYRWDEU2022, M3POPPYSEED2024, M32023GFSHEXPORT, MY2023GFSHEXPORT, MY2024, MY2023SRRWD, MY2024C, MY2024GFSHExportSRRWD, M3POPPYSEED2024C, M32025, MY2025, M32025B, MY2025B, MYRefresh2025Row, MYStandard2025, MYRefresh2025CN, MY2025M53, M32025M53, MY2025CNPlus, M32026B, MS2024, MX2024, MS2025, MX2025, MS2026, MX2026, MS2026B, SX2020, S2, SX2020H2, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getDefault() {
        return this.Default;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getM32021() {
        return this.M32021;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getM32023GFSHEXPORT() {
        return this.M32023GFSHEXPORT;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getM32025() {
        return this.M32025;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), jVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Default, jVar.Default) && p013kotlin.jvm.internal.s.f(this.M3SRPlus2020, jVar.M3SRPlus2020) && p013kotlin.jvm.internal.s.f(this.M3LR2020, jVar.M3LR2020) && p013kotlin.jvm.internal.s.f(this.M3LRPerformance2020, jVar.M3LRPerformance2020) && p013kotlin.jvm.internal.s.f(this.M3SRPlus2020Q4GFSH, jVar.M3SRPlus2020Q4GFSH) && p013kotlin.jvm.internal.s.f(this.MY2020, jVar.MY2020) && p013kotlin.jvm.internal.s.f(this.M32021, jVar.M32021) && p013kotlin.jvm.internal.s.f(this.MY2021, jVar.MY2021) && p013kotlin.jvm.internal.s.f(this.M3SRPlus2021Q3GFSH, jVar.M3SRPlus2021Q3GFSH) && p013kotlin.jvm.internal.s.f(this.M3SRPlus2021Q3FREMONT, jVar.M3SRPlus2021Q3FREMONT) && p013kotlin.jvm.internal.s.f(this.MYSRPlus2021Q3GFSH, jVar.MYSRPlus2021Q3GFSH) && p013kotlin.jvm.internal.s.f(this.MYSRPlus2022Q1TX, jVar.MYSRPlus2022Q1TX) && p013kotlin.jvm.internal.s.f(this.MYRWDEU2022, jVar.MYRWDEU2022) && p013kotlin.jvm.internal.s.f(this.M3POPPYSEED2024, jVar.M3POPPYSEED2024) && p013kotlin.jvm.internal.s.f(this.M32023GFSHEXPORT, jVar.M32023GFSHEXPORT) && p013kotlin.jvm.internal.s.f(this.MY2023GFSHEXPORT, jVar.MY2023GFSHEXPORT) && p013kotlin.jvm.internal.s.f(this.MY2024, jVar.MY2024) && p013kotlin.jvm.internal.s.f(this.MY2023SRRWD, jVar.MY2023SRRWD) && p013kotlin.jvm.internal.s.f(this.MY2024C, jVar.MY2024C) && p013kotlin.jvm.internal.s.f(this.MY2024GFSHExportSRRWD, jVar.MY2024GFSHExportSRRWD) && p013kotlin.jvm.internal.s.f(this.M3POPPYSEED2024C, jVar.M3POPPYSEED2024C) && p013kotlin.jvm.internal.s.f(this.M32025, jVar.M32025) && p013kotlin.jvm.internal.s.f(this.MY2025, jVar.MY2025) && p013kotlin.jvm.internal.s.f(this.M32025B, jVar.M32025B) && p013kotlin.jvm.internal.s.f(this.MY2025B, jVar.MY2025B) && p013kotlin.jvm.internal.s.f(this.MYRefresh2025Row, jVar.MYRefresh2025Row) && p013kotlin.jvm.internal.s.f(this.MYStandard2025, jVar.MYStandard2025) && p013kotlin.jvm.internal.s.f(this.MYRefresh2025CN, jVar.MYRefresh2025CN) && p013kotlin.jvm.internal.s.f(this.MY2025M53, jVar.MY2025M53) && p013kotlin.jvm.internal.s.f(this.M32025M53, jVar.M32025M53) && p013kotlin.jvm.internal.s.f(this.MY2025CNPlus, jVar.MY2025CNPlus) && p013kotlin.jvm.internal.s.f(this.M32026B, jVar.M32026B) && p013kotlin.jvm.internal.s.f(this.MS2024, jVar.MS2024) && p013kotlin.jvm.internal.s.f(this.MX2024, jVar.MX2024) && p013kotlin.jvm.internal.s.f(this.MS2025, jVar.MS2025) && p013kotlin.jvm.internal.s.f(this.MX2025, jVar.MX2025) && p013kotlin.jvm.internal.s.f(this.MS2026, jVar.MS2026) && p013kotlin.jvm.internal.s.f(this.MX2026, jVar.MX2026) && p013kotlin.jvm.internal.s.f(this.MS2026B, jVar.MS2026B) && p013kotlin.jvm.internal.s.f(this.SX2020, jVar.SX2020) && p013kotlin.jvm.internal.s.f(this.S2, jVar.S2) && p013kotlin.jvm.internal.s.f(this.SX2020H2, jVar.SX2020H2);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h0 getM32025B() {
        return this.M32025B;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h0 getM32025M53() {
        return this.M32025M53;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h0 getM32026B() {
        return this.M32026B;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.Default;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.M3SRPlus2020;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        h0 h0Var3 = this.M3LR2020;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        h0 h0Var4 = this.M3LRPerformance2020;
        int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
        h0 h0Var5 = this.M3SRPlus2020Q4GFSH;
        int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
        h0 h0Var6 = this.MY2020;
        int iHashCode7 = (iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0)) * 37;
        h0 h0Var7 = this.M32021;
        int iHashCode8 = (iHashCode7 + (h0Var7 != null ? h0Var7.hashCode() : 0)) * 37;
        h0 h0Var8 = this.MY2021;
        int iHashCode9 = (iHashCode8 + (h0Var8 != null ? h0Var8.hashCode() : 0)) * 37;
        h0 h0Var9 = this.M3SRPlus2021Q3GFSH;
        int iHashCode10 = (iHashCode9 + (h0Var9 != null ? h0Var9.hashCode() : 0)) * 37;
        h0 h0Var10 = this.M3SRPlus2021Q3FREMONT;
        int iHashCode11 = (iHashCode10 + (h0Var10 != null ? h0Var10.hashCode() : 0)) * 37;
        h0 h0Var11 = this.MYSRPlus2021Q3GFSH;
        int iHashCode12 = (iHashCode11 + (h0Var11 != null ? h0Var11.hashCode() : 0)) * 37;
        h0 h0Var12 = this.MYSRPlus2022Q1TX;
        int iHashCode13 = (iHashCode12 + (h0Var12 != null ? h0Var12.hashCode() : 0)) * 37;
        h0 h0Var13 = this.MYRWDEU2022;
        int iHashCode14 = (iHashCode13 + (h0Var13 != null ? h0Var13.hashCode() : 0)) * 37;
        h0 h0Var14 = this.M3POPPYSEED2024;
        int iHashCode15 = (iHashCode14 + (h0Var14 != null ? h0Var14.hashCode() : 0)) * 37;
        h0 h0Var15 = this.M32023GFSHEXPORT;
        int iHashCode16 = (iHashCode15 + (h0Var15 != null ? h0Var15.hashCode() : 0)) * 37;
        h0 h0Var16 = this.MY2023GFSHEXPORT;
        int iHashCode17 = (iHashCode16 + (h0Var16 != null ? h0Var16.hashCode() : 0)) * 37;
        h0 h0Var17 = this.MY2024;
        int iHashCode18 = (iHashCode17 + (h0Var17 != null ? h0Var17.hashCode() : 0)) * 37;
        h0 h0Var18 = this.MY2023SRRWD;
        int iHashCode19 = (iHashCode18 + (h0Var18 != null ? h0Var18.hashCode() : 0)) * 37;
        h0 h0Var19 = this.MY2024C;
        int iHashCode20 = (iHashCode19 + (h0Var19 != null ? h0Var19.hashCode() : 0)) * 37;
        h0 h0Var20 = this.MY2024GFSHExportSRRWD;
        int iHashCode21 = (iHashCode20 + (h0Var20 != null ? h0Var20.hashCode() : 0)) * 37;
        h0 h0Var21 = this.M3POPPYSEED2024C;
        int iHashCode22 = (iHashCode21 + (h0Var21 != null ? h0Var21.hashCode() : 0)) * 37;
        h0 h0Var22 = this.M32025;
        int iHashCode23 = (iHashCode22 + (h0Var22 != null ? h0Var22.hashCode() : 0)) * 37;
        h0 h0Var23 = this.MY2025;
        int iHashCode24 = (iHashCode23 + (h0Var23 != null ? h0Var23.hashCode() : 0)) * 37;
        h0 h0Var24 = this.M32025B;
        int iHashCode25 = (iHashCode24 + (h0Var24 != null ? h0Var24.hashCode() : 0)) * 37;
        h0 h0Var25 = this.MY2025B;
        int iHashCode26 = (iHashCode25 + (h0Var25 != null ? h0Var25.hashCode() : 0)) * 37;
        h0 h0Var26 = this.MYRefresh2025Row;
        int iHashCode27 = (iHashCode26 + (h0Var26 != null ? h0Var26.hashCode() : 0)) * 37;
        h0 h0Var27 = this.MYStandard2025;
        int iHashCode28 = (iHashCode27 + (h0Var27 != null ? h0Var27.hashCode() : 0)) * 37;
        h0 h0Var28 = this.MYRefresh2025CN;
        int iHashCode29 = (iHashCode28 + (h0Var28 != null ? h0Var28.hashCode() : 0)) * 37;
        h0 h0Var29 = this.MY2025M53;
        int iHashCode30 = (iHashCode29 + (h0Var29 != null ? h0Var29.hashCode() : 0)) * 37;
        h0 h0Var30 = this.M32025M53;
        int iHashCode31 = (iHashCode30 + (h0Var30 != null ? h0Var30.hashCode() : 0)) * 37;
        h0 h0Var31 = this.MY2025CNPlus;
        int iHashCode32 = (iHashCode31 + (h0Var31 != null ? h0Var31.hashCode() : 0)) * 37;
        h0 h0Var32 = this.M32026B;
        int iHashCode33 = (iHashCode32 + (h0Var32 != null ? h0Var32.hashCode() : 0)) * 37;
        h0 h0Var33 = this.MS2024;
        int iHashCode34 = (iHashCode33 + (h0Var33 != null ? h0Var33.hashCode() : 0)) * 37;
        h0 h0Var34 = this.MX2024;
        int iHashCode35 = (iHashCode34 + (h0Var34 != null ? h0Var34.hashCode() : 0)) * 37;
        h0 h0Var35 = this.MS2025;
        int iHashCode36 = (iHashCode35 + (h0Var35 != null ? h0Var35.hashCode() : 0)) * 37;
        h0 h0Var36 = this.MX2025;
        int iHashCode37 = (iHashCode36 + (h0Var36 != null ? h0Var36.hashCode() : 0)) * 37;
        h0 h0Var37 = this.MS2026;
        int iHashCode38 = (iHashCode37 + (h0Var37 != null ? h0Var37.hashCode() : 0)) * 37;
        h0 h0Var38 = this.MX2026;
        int iHashCode39 = (iHashCode38 + (h0Var38 != null ? h0Var38.hashCode() : 0)) * 37;
        h0 h0Var39 = this.MS2026B;
        int iHashCode40 = (iHashCode39 + (h0Var39 != null ? h0Var39.hashCode() : 0)) * 37;
        h0 h0Var40 = this.SX2020;
        int iHashCode41 = (iHashCode40 + (h0Var40 != null ? h0Var40.hashCode() : 0)) * 37;
        h0 h0Var41 = this.S2;
        int iHashCode42 = (iHashCode41 + (h0Var41 != null ? h0Var41.hashCode() : 0)) * 37;
        h0 h0Var42 = this.SX2020H2;
        int iHashCode43 = iHashCode42 + (h0Var42 != null ? h0Var42.hashCode() : 0);
        this.hashCode = iHashCode43;
        return iHashCode43;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final h0 getM3LR2020() {
        return this.M3LR2020;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h0 getM3LRPerformance2020() {
        return this.M3LRPerformance2020;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final h0 getM3POPPYSEED2024() {
        return this.M3POPPYSEED2024;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final h0 getM3POPPYSEED2024C() {
        return this.M3POPPYSEED2024C;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final h0 getM3SRPlus2020() {
        return this.M3SRPlus2020;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final h0 getM3SRPlus2020Q4GFSH() {
        return this.M3SRPlus2020Q4GFSH;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m148newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final h0 getM3SRPlus2021Q3FREMONT() {
        return this.M3SRPlus2021Q3FREMONT;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final h0 getM3SRPlus2021Q3GFSH() {
        return this.M3SRPlus2021Q3GFSH;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final h0 getMS2024() {
        return this.MS2024;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final h0 getMS2025() {
        return this.MS2025;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final h0 getMS2026() {
        return this.MS2026;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final h0 getMS2026B() {
        return this.MS2026B;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.Default;
        if (h0Var != null) {
            arrayList.add("Default=" + h0Var);
        }
        h0 h0Var2 = this.M3SRPlus2020;
        if (h0Var2 != null) {
            arrayList.add("M3SRPlus2020=" + h0Var2);
        }
        h0 h0Var3 = this.M3LR2020;
        if (h0Var3 != null) {
            arrayList.add("M3LR2020=" + h0Var3);
        }
        h0 h0Var4 = this.M3LRPerformance2020;
        if (h0Var4 != null) {
            arrayList.add("M3LRPerformance2020=" + h0Var4);
        }
        h0 h0Var5 = this.M3SRPlus2020Q4GFSH;
        if (h0Var5 != null) {
            arrayList.add("M3SRPlus2020Q4GFSH=" + h0Var5);
        }
        h0 h0Var6 = this.MY2020;
        if (h0Var6 != null) {
            arrayList.add("MY2020=" + h0Var6);
        }
        h0 h0Var7 = this.M32021;
        if (h0Var7 != null) {
            arrayList.add("M32021=" + h0Var7);
        }
        h0 h0Var8 = this.MY2021;
        if (h0Var8 != null) {
            arrayList.add("MY2021=" + h0Var8);
        }
        h0 h0Var9 = this.M3SRPlus2021Q3GFSH;
        if (h0Var9 != null) {
            arrayList.add("M3SRPlus2021Q3GFSH=" + h0Var9);
        }
        h0 h0Var10 = this.M3SRPlus2021Q3FREMONT;
        if (h0Var10 != null) {
            arrayList.add("M3SRPlus2021Q3FREMONT=" + h0Var10);
        }
        h0 h0Var11 = this.MYSRPlus2021Q3GFSH;
        if (h0Var11 != null) {
            arrayList.add("MYSRPlus2021Q3GFSH=" + h0Var11);
        }
        h0 h0Var12 = this.MYSRPlus2022Q1TX;
        if (h0Var12 != null) {
            arrayList.add("MYSRPlus2022Q1TX=" + h0Var12);
        }
        h0 h0Var13 = this.MYRWDEU2022;
        if (h0Var13 != null) {
            arrayList.add("MYRWDEU2022=" + h0Var13);
        }
        h0 h0Var14 = this.M3POPPYSEED2024;
        if (h0Var14 != null) {
            arrayList.add("M3POPPYSEED2024=" + h0Var14);
        }
        h0 h0Var15 = this.M32023GFSHEXPORT;
        if (h0Var15 != null) {
            arrayList.add("M32023GFSHEXPORT=" + h0Var15);
        }
        h0 h0Var16 = this.MY2023GFSHEXPORT;
        if (h0Var16 != null) {
            arrayList.add("MY2023GFSHEXPORT=" + h0Var16);
        }
        h0 h0Var17 = this.MY2024;
        if (h0Var17 != null) {
            arrayList.add("MY2024=" + h0Var17);
        }
        h0 h0Var18 = this.MY2023SRRWD;
        if (h0Var18 != null) {
            arrayList.add("MY2023SRRWD=" + h0Var18);
        }
        h0 h0Var19 = this.MY2024C;
        if (h0Var19 != null) {
            arrayList.add("MY2024C=" + h0Var19);
        }
        h0 h0Var20 = this.MY2024GFSHExportSRRWD;
        if (h0Var20 != null) {
            arrayList.add("MY2024GFSHExportSRRWD=" + h0Var20);
        }
        h0 h0Var21 = this.M3POPPYSEED2024C;
        if (h0Var21 != null) {
            arrayList.add("M3POPPYSEED2024C=" + h0Var21);
        }
        h0 h0Var22 = this.M32025;
        if (h0Var22 != null) {
            arrayList.add("M32025=" + h0Var22);
        }
        h0 h0Var23 = this.MY2025;
        if (h0Var23 != null) {
            arrayList.add("MY2025=" + h0Var23);
        }
        h0 h0Var24 = this.M32025B;
        if (h0Var24 != null) {
            arrayList.add("M32025B=" + h0Var24);
        }
        h0 h0Var25 = this.MY2025B;
        if (h0Var25 != null) {
            arrayList.add("MY2025B=" + h0Var25);
        }
        h0 h0Var26 = this.MYRefresh2025Row;
        if (h0Var26 != null) {
            arrayList.add("MYRefresh2025Row=" + h0Var26);
        }
        h0 h0Var27 = this.MYStandard2025;
        if (h0Var27 != null) {
            arrayList.add("MYStandard2025=" + h0Var27);
        }
        h0 h0Var28 = this.MYRefresh2025CN;
        if (h0Var28 != null) {
            arrayList.add("MYRefresh2025CN=" + h0Var28);
        }
        h0 h0Var29 = this.MY2025M53;
        if (h0Var29 != null) {
            arrayList.add("MY2025M53=" + h0Var29);
        }
        h0 h0Var30 = this.M32025M53;
        if (h0Var30 != null) {
            arrayList.add("M32025M53=" + h0Var30);
        }
        h0 h0Var31 = this.MY2025CNPlus;
        if (h0Var31 != null) {
            arrayList.add("MY2025CNPlus=" + h0Var31);
        }
        h0 h0Var32 = this.M32026B;
        if (h0Var32 != null) {
            arrayList.add("M32026B=" + h0Var32);
        }
        h0 h0Var33 = this.MS2024;
        if (h0Var33 != null) {
            arrayList.add("MS2024=" + h0Var33);
        }
        h0 h0Var34 = this.MX2024;
        if (h0Var34 != null) {
            arrayList.add("MX2024=" + h0Var34);
        }
        h0 h0Var35 = this.MS2025;
        if (h0Var35 != null) {
            arrayList.add("MS2025=" + h0Var35);
        }
        h0 h0Var36 = this.MX2025;
        if (h0Var36 != null) {
            arrayList.add("MX2025=" + h0Var36);
        }
        h0 h0Var37 = this.MS2026;
        if (h0Var37 != null) {
            arrayList.add("MS2026=" + h0Var37);
        }
        h0 h0Var38 = this.MX2026;
        if (h0Var38 != null) {
            arrayList.add("MX2026=" + h0Var38);
        }
        h0 h0Var39 = this.MS2026B;
        if (h0Var39 != null) {
            arrayList.add("MS2026B=" + h0Var39);
        }
        h0 h0Var40 = this.SX2020;
        if (h0Var40 != null) {
            arrayList.add("SX2020=" + h0Var40);
        }
        h0 h0Var41 = this.S2;
        if (h0Var41 != null) {
            arrayList.add("S2=" + h0Var41);
        }
        h0 h0Var42 = this.SX2020H2;
        if (h0Var42 != null) {
            arrayList.add("SX2020H2=" + h0Var42);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "EfficiencyPackage{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final h0 getMX2024() {
        return this.MX2024;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final h0 getMX2025() {
        return this.MX2025;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final h0 getMX2026() {
        return this.MX2026;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final h0 getMY2020() {
        return this.MY2020;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final h0 getMY2021() {
        return this.MY2021;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final h0 getMY2023GFSHEXPORT() {
        return this.MY2023GFSHEXPORT;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, h0 h0Var7, h0 h0Var8, h0 h0Var9, h0 h0Var10, h0 h0Var11, h0 h0Var12, h0 h0Var13, h0 h0Var14, h0 h0Var15, h0 h0Var16, h0 h0Var17, h0 h0Var18, h0 h0Var19, h0 h0Var20, h0 h0Var21, h0 h0Var22, h0 h0Var23, h0 h0Var24, h0 h0Var25, h0 h0Var26, h0 h0Var27, h0 h0Var28, h0 h0Var29, h0 h0Var30, h0 h0Var31, h0 h0Var32, h0 h0Var33, h0 h0Var34, h0 h0Var35, h0 h0Var36, h0 h0Var37, h0 h0Var38, h0 h0Var39, h0 h0Var40, h0 h0Var41, h0 h0Var42, okio.k kVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        h0 h0Var43 = (i11 & 1) != 0 ? null : h0Var;
        this(h0Var43, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? null : h0Var7, (i11 & 128) != 0 ? null : h0Var8, (i11 & 256) != 0 ? null : h0Var9, (i11 & 512) != 0 ? null : h0Var10, (i11 & 1024) != 0 ? null : h0Var11, (i11 & 2048) != 0 ? null : h0Var12, (i11 & 4096) != 0 ? null : h0Var13, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : h0Var14, (i11 & 16384) != 0 ? null : h0Var15, (i11 & 32768) != 0 ? null : h0Var16, (i11 & 65536) != 0 ? null : h0Var17, (i11 & 131072) != 0 ? null : h0Var18, (i11 & 262144) != 0 ? null : h0Var19, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : h0Var20, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : h0Var21, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : h0Var22, (i11 & 4194304) != 0 ? null : h0Var23, (i11 & 8388608) != 0 ? null : h0Var24, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : h0Var25, (i11 & 33554432) != 0 ? null : h0Var26, (i11 & 67108864) != 0 ? null : h0Var27, (i11 & 134217728) != 0 ? null : h0Var28, (i11 & 268435456) != 0 ? null : h0Var29, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? null : h0Var30, (i11 & 1073741824) != 0 ? null : h0Var31, (i11 & Integer.MIN_VALUE) != 0 ? null : h0Var32, (i12 & 1) != 0 ? null : h0Var33, (i12 & 2) != 0 ? null : h0Var34, (i12 & 4) != 0 ? null : h0Var35, (i12 & 8) != 0 ? null : h0Var36, (i12 & 16) != 0 ? null : h0Var37, (i12 & 32) != 0 ? null : h0Var38, (i12 & 64) != 0 ? null : h0Var39, (i12 & 128) != 0 ? null : h0Var40, (i12 & 256) != 0 ? null : h0Var41, (i12 & 512) != 0 ? null : h0Var42, (i12 & 1024) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m148newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, h0 h0Var7, h0 h0Var8, h0 h0Var9, h0 h0Var10, h0 h0Var11, h0 h0Var12, h0 h0Var13, h0 h0Var14, h0 h0Var15, h0 h0Var16, h0 h0Var17, h0 h0Var18, h0 h0Var19, h0 h0Var20, h0 h0Var21, h0 h0Var22, h0 h0Var23, h0 h0Var24, h0 h0Var25, h0 h0Var26, h0 h0Var27, h0 h0Var28, h0 h0Var29, h0 h0Var30, h0 h0Var31, h0 h0Var32, h0 h0Var33, h0 h0Var34, h0 h0Var35, h0 h0Var36, h0 h0Var37, h0 h0Var38, h0 h0Var39, h0 h0Var40, h0 h0Var41, h0 h0Var42, okio.k unknownFields) {
        super(R, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.Default = h0Var;
        this.M3SRPlus2020 = h0Var2;
        this.M3LR2020 = h0Var3;
        this.M3LRPerformance2020 = h0Var4;
        this.M3SRPlus2020Q4GFSH = h0Var5;
        this.MY2020 = h0Var6;
        this.M32021 = h0Var7;
        this.MY2021 = h0Var8;
        this.M3SRPlus2021Q3GFSH = h0Var9;
        this.M3SRPlus2021Q3FREMONT = h0Var10;
        this.MYSRPlus2021Q3GFSH = h0Var11;
        this.MYSRPlus2022Q1TX = h0Var12;
        this.MYRWDEU2022 = h0Var13;
        this.M3POPPYSEED2024 = h0Var14;
        this.M32023GFSHEXPORT = h0Var15;
        this.MY2023GFSHEXPORT = h0Var16;
        this.MY2024 = h0Var17;
        this.MY2023SRRWD = h0Var18;
        this.MY2024C = h0Var19;
        this.MY2024GFSHExportSRRWD = h0Var20;
        this.M3POPPYSEED2024C = h0Var21;
        this.M32025 = h0Var22;
        this.MY2025 = h0Var23;
        this.M32025B = h0Var24;
        this.MY2025B = h0Var25;
        this.MYRefresh2025Row = h0Var26;
        this.MYStandard2025 = h0Var27;
        this.MYRefresh2025CN = h0Var28;
        this.MY2025M53 = h0Var29;
        this.M32025M53 = h0Var30;
        this.MY2025CNPlus = h0Var31;
        this.M32026B = h0Var32;
        this.MS2024 = h0Var33;
        this.MX2024 = h0Var34;
        this.MS2025 = h0Var35;
        this.MX2025 = h0Var36;
        this.MS2026 = h0Var37;
        this.MX2026 = h0Var38;
        this.MS2026B = h0Var39;
        this.SX2020 = h0Var40;
        this.S2 = h0Var41;
        this.SX2020H2 = h0Var42;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10, h0Var11, h0Var12, h0Var13, h0Var14, h0Var15, h0Var16, h0Var17, h0Var18, h0Var19, h0Var20, h0Var21, h0Var22, h0Var23, h0Var24, h0Var25, h0Var26, h0Var27, h0Var28, h0Var29, h0Var30, h0Var31, h0Var32, h0Var33, h0Var34, h0Var35, h0Var36, h0Var37, h0Var38, h0Var39, h0Var40, h0Var41, h0Var42) > 1) {
            throw new IllegalArgumentException("At most one of Default, M3SRPlus2020, M3LR2020, M3LRPerformance2020, M3SRPlus2020Q4GFSH, MY2020, M32021, MY2021, M3SRPlus2021Q3GFSH, M3SRPlus2021Q3FREMONT, MYSRPlus2021Q3GFSH, MYSRPlus2022Q1TX, MYRWDEU2022, M3POPPYSEED2024, M32023GFSHEXPORT, MY2023GFSHEXPORT, MY2024, MY2023SRRWD, MY2024C, MY2024GFSHExportSRRWD, M3POPPYSEED2024C, M32025, MY2025, M32025B, MY2025B, MYRefresh2025Row, MYStandard2025, MYRefresh2025CN, MY2025M53, M32025M53, MY2025CNPlus, M32026B, MS2024, MX2024, MS2025, MX2025, MS2026, MX2026, MS2026B, SX2020, S2, SX2020H2 may be non-null");
        }
    }
}
