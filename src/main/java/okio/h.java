package okio;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002¶\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0011H\u0087\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u0010$J\u000f\u00102\u001a\u00020+H\u0016¢\u0006\u0004\b2\u0010-J\u000f\u00103\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u0010$J\u000f\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u0010$J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010$J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u0002072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020.2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00112\u0006\u0010@\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020F2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020FH\u0016¢\u0006\u0004\bQ\u0010HJ\u0017\u0010S\u001a\u00020F2\u0006\u0010R\u001a\u00020\u0011H\u0016¢\u0006\u0004\bS\u0010JJ\u000f\u0010T\u001a\u00020.H\u0016¢\u0006\u0004\bT\u00100J\u000f\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020U2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00132\u0006\u0010@\u001a\u00020UH\u0016¢\u0006\u0004\bZ\u0010[J'\u0010\\\u001a\u00020.2\u0006\u0010@\u001a\u00020U2\u0006\u0010\u001e\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010\\\u001a\u00020.2\u0006\u0010@\u001a\u00020^H\u0016¢\u0006\u0004\b\\\u0010_J\r\u0010`\u001a\u00020\u0013¢\u0006\u0004\b`\u0010\u0006J\u0017\u0010a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\ba\u0010\u0015J\u0017\u0010c\u001a\u00020\u00002\u0006\u0010b\u001a\u000207H\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00002\u0006\u0010e\u001a\u00020FH\u0016¢\u0006\u0004\bf\u0010gJ'\u0010j\u001a\u00020\u00002\u0006\u0010e\u001a\u00020F2\u0006\u0010h\u001a\u00020.2\u0006\u0010i\u001a\u00020.H\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00002\u0006\u0010l\u001a\u00020.H\u0016¢\u0006\u0004\bm\u0010nJ\u001f\u0010o\u001a\u00020\u00002\u0006\u0010e\u001a\u00020F2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bo\u0010pJ/\u0010q\u001a\u00020\u00002\u0006\u0010e\u001a\u00020F2\u0006\u0010h\u001a\u00020.2\u0006\u0010i\u001a\u00020.2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\u00002\u0006\u0010s\u001a\u00020UH\u0016¢\u0006\u0004\bt\u0010uJ'\u0010v\u001a\u00020\u00002\u0006\u0010s\u001a\u00020U2\u0006\u0010\u001e\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020.2\u0006\u0010s\u001a\u00020^H\u0016¢\u0006\u0004\bx\u0010_J\u0017\u0010z\u001a\u00020\u00112\u0006\u0010s\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u001f\u0010|\u001a\u00020\u00002\u0006\u0010s\u001a\u00020y2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b|\u0010}J\u0017\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020.H\u0016¢\u0006\u0004\b\u007f\u0010nJ\u001a\u0010\u0081\u0001\u001a\u00020\u00002\u0007\u0010\u0080\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u0081\u0001\u0010nJ\u001a\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u0083\u0001\u0010nJ\u001a\u0010\u0084\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u0084\u0001\u0010nJ\u001b\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J\u001b\u0010\u0089\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u0087\u0001J\u001b\u0010\u008a\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u0087\u0001J\u001c\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008b\u0001\u001a\u00020.H\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001f\u0010x\u001a\u00020\u00132\u0006\u0010s\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bx\u0010BJ \u0010\\\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\\\u0010\u008f\u0001J,\u0010\u0092\u0001\u001a\u00020\u00112\u0006\u0010~\u001a\u00020%2\u0007\u0010\u0090\u0001\u001a\u00020\u00112\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001b\u0010\u0095\u0001\u001a\u00020\u00112\u0007\u0010\u0094\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J$\u0010\u0097\u0001\u001a\u00020\u00112\u0007\u0010\u0094\u0001\u001a\u0002072\u0007\u0010\u0090\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00112\u0007\u0010\u0099\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0096\u0001J$\u0010\u009b\u0001\u001a\u00020\u00112\u0007\u0010\u0099\u0001\u001a\u0002072\u0007\u0010\u0090\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u0098\u0001J#\u0010\u009c\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0094\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J4\u0010\u009f\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0094\u0001\u001a\u0002072\u0007\u0010\u009e\u0001\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¡\u0001\u0010\u0006J\u0011\u0010¢\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b¢\u0001\u0010\u0010J\u0011\u0010£\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b£\u0001\u0010\u0006J\u0013\u0010¥\u0001\u001a\u00030¤\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001f\u0010©\u0001\u001a\u00020\u000e2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0096\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b«\u0001\u00100J\u0011\u0010¬\u0001\u001a\u00020FH\u0016¢\u0006\u0005\b¬\u0001\u0010HJ\u000f\u0010\u00ad\u0001\u001a\u00020\u0000¢\u0006\u0005\b\u00ad\u0001\u0010\bJ\u0011\u0010®\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\b®\u0001\u0010\bJ\u000f\u0010¯\u0001\u001a\u000207¢\u0006\u0005\b¯\u0001\u00109J\u0018\u0010°\u0001\u001a\u0002072\u0006\u0010\u0012\u001a\u00020.¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001f\u0010´\u0001\u001a\u00030²\u00012\n\b\u0002\u0010³\u0001\u001a\u00030²\u0001H\u0007¢\u0006\u0006\b´\u0001\u0010µ\u0001R\u001c\u0010¸\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R/\u0010º\u0001\u001a\u00020\u00112\u0007\u0010¹\u0001\u001a\u00020\u00118G@@X\u0086\u000e¢\u0006\u0015\n\u0005\b~\u0010\u009b\u0001\u001a\u0005\bº\u0001\u0010$\"\u0005\b»\u0001\u0010\u0015R\u0016\u0010½\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\b¨\u0006¾\u0001"}, d2 = {"Lokio/h;", "Lokio/j;", "Lokio/i;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "P1", "()Lokio/h;", "Ljava/io/OutputStream;", "I3", "()Ljava/io/OutputStream;", "C", "B", "", "T2", "()Z", "", "byteCount", "Ljn0/h0;", "D2", "(J)V", "request", "(J)Z", "peek", "()Lokio/j;", "Ljava/io/InputStream;", "K3", "()Ljava/io/InputStream;", "out", "offset", "t", "(Lokio/h;JJ)Lokio/h;", "d1", "(Ljava/io/OutputStream;J)Lokio/h;", "o", "()J", "", "readByte", "()B", "pos", "H", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "A0", "w3", "E0", "X2", "J1", "Lokio/k;", "m1", "()Lokio/k;", "Q0", "(J)Lokio/k;", "Lokio/g0;", "options", "M3", "(Lokio/g0;)I", "sink", "Z1", "(Lokio/h;J)V", "Lokio/p0;", "D1", "(Lokio/p0;)J", "", "t1", "()Ljava/lang/String;", "M0", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "j1", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "k0", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "w2", "limit", "e2", "n0", "", "V0", "()[B", "y2", "(J)[B", "readFully", "([B)V", "read", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "c", "skip", "byteString", "w0", "(Lokio/k;)Lokio/h;", InquiryField.StringField.TYPE, "h1", "(Ljava/lang/String;)Lokio/h;", "beginIndex", "endIndex", "k1", "(Ljava/lang/String;II)Lokio/h;", "codePoint", "r1", "(I)Lokio/h;", "c1", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/h;", "Y0", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/h;", "source", "z0", "([B)Lokio/h;", "D0", "([BII)Lokio/h;", "write", "Lokio/r0;", "q2", "(Lokio/r0;)J", "y0", "(Lokio/r0;J)Lokio/h;", "b", "G0", "s", "U0", IntegerTokenConverter.CONVERTER_KEY, "K0", "O0", "v", "P0", "(J)Lokio/h;", "T0", "H0", "J0", "minimumCapacity", "Lokio/m0;", "u0", "(I)Lokio/m0;", "(Lokio/h;J)J", "fromIndex", "toIndex", "a2", "(BJJ)J", "bytes", "Z", "(Lokio/k;)J", "I", "(Lokio/k;J)J", "targetBytes", "d0", "J", "l0", "(JLokio/k;)Z", "bytesOffset", "b0", "(JLokio/k;II)Z", "flush", "isOpen", "close", "Lokio/s0;", "timeout", "()Lokio/s0;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "p", "n", "s0", "t0", "(I)Lokio/k;", "Lokio/h$a;", "unsafeCursor", "c0", "(Lokio/h$a;)Lokio/h$a;", "a", "Lokio/m0;", "head", "value", "size", "r0", "l", "buffer", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements j, i, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public m0 head;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long size;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006*"}, d2 = {"Lokio/h$a;", "Ljava/io/Closeable;", "<init>", "()V", "", "n", "()I", "", "offset", "p", "(J)I", "newSize", "o", "(J)J", "Ljn0/h0;", "close", "Lokio/h;", "a", "Lokio/h;", "buffer", "", "b", "Z", "readWrite", "Lokio/m0;", "c", "Lokio/m0;", "()Lokio/m0;", "t", "(Lokio/m0;)V", "segment", DateTokenConverter.CONVERTER_KEY, "J", "", "e", "[B", "data", "f", "I", "start", "g", "end", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public h buffer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public boolean readWrite;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private m0 segment;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public byte[] data;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long offset = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int start = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public int end = -1;

        /* JADX INFO: renamed from: c, reason: from getter */
        public final m0 getSegment() {
            return this.segment;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            t(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final int n() {
            long j11 = this.offset;
            h hVar = this.buffer;
            p013kotlin.jvm.internal.s.h(hVar);
            if (j11 == hVar.getSize()) {
                throw new IllegalStateException("no more bytes");
            }
            long j12 = this.offset;
            return p(j12 == -1 ? 0L : j12 + ((long) (this.end - this.start)));
        }

        public final long o(long newSize) {
            h hVar = this.buffer;
            if (hVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = hVar.getSize();
            if (newSize <= size) {
                if (newSize < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + newSize).toString());
                }
                long j11 = size - newSize;
                while (j11 > 0) {
                    m0 m0Var = hVar.head;
                    p013kotlin.jvm.internal.s.h(m0Var);
                    m0 m0Var2 = m0Var.prev;
                    p013kotlin.jvm.internal.s.h(m0Var2);
                    int i11 = m0Var2.limit;
                    long j12 = i11 - m0Var2.pos;
                    if (j12 > j11) {
                        m0Var2.limit = i11 - ((int) j11);
                        break;
                    }
                    hVar.head = m0Var2.b();
                    n0.b(m0Var2);
                    j11 -= j12;
                }
                t(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j13 = newSize - size;
                boolean z11 = true;
                while (j13 > 0) {
                    m0 m0VarU0 = hVar.u0(1);
                    int iMin = (int) Math.min(j13, 8192 - m0VarU0.limit);
                    m0VarU0.limit += iMin;
                    j13 -= (long) iMin;
                    if (z11) {
                        t(m0VarU0);
                        this.offset = size;
                        this.data = m0VarU0.data;
                        int i12 = m0VarU0.limit;
                        this.start = i12 - iMin;
                        this.end = i12;
                        z11 = false;
                    }
                }
            }
            hVar.r0(newSize);
            return size;
        }

        public final int p(long offset) {
            m0 m0VarC;
            h hVar = this.buffer;
            if (hVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (offset < -1 || offset > hVar.getSize()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + hVar.getSize());
            }
            if (offset == -1 || offset == hVar.getSize()) {
                t(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = hVar.getSize();
            m0 segment = hVar.head;
            long j11 = 0;
            if (getSegment() != null) {
                long j12 = this.offset;
                int i11 = this.start;
                m0 segment2 = getSegment();
                p013kotlin.jvm.internal.s.h(segment2);
                long j13 = j12 - ((long) (i11 - segment2.pos));
                if (j13 > offset) {
                    m0VarC = segment;
                    segment = getSegment();
                    size = j13;
                } else {
                    m0VarC = getSegment();
                    j11 = j13;
                }
            } else {
                m0VarC = segment;
            }
            if (size - offset > offset - j11) {
                while (true) {
                    p013kotlin.jvm.internal.s.h(m0VarC);
                    int i12 = m0VarC.limit;
                    int i13 = m0VarC.pos;
                    if (offset < ((long) (i12 - i13)) + j11) {
                        break;
                    }
                    j11 += (long) (i12 - i13);
                    m0VarC = m0VarC.next;
                }
            } else {
                while (size > offset) {
                    p013kotlin.jvm.internal.s.h(segment);
                    segment = segment.prev;
                    p013kotlin.jvm.internal.s.h(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                j11 = size;
                m0VarC = segment;
            }
            if (this.readWrite) {
                p013kotlin.jvm.internal.s.h(m0VarC);
                if (m0VarC.shared) {
                    m0 m0VarF = m0VarC.f();
                    if (hVar.head == m0VarC) {
                        hVar.head = m0VarF;
                    }
                    m0VarC = m0VarC.c(m0VarF);
                    m0 m0Var = m0VarC.prev;
                    p013kotlin.jvm.internal.s.h(m0Var);
                    m0Var.b();
                }
            }
            t(m0VarC);
            this.offset = offset;
            p013kotlin.jvm.internal.s.h(m0VarC);
            this.data = m0VarC.data;
            int i14 = m0VarC.pos + ((int) (offset - j11));
            this.start = i14;
            int i15 = m0VarC.limit;
            this.end = i15;
            return i15 - i14;
        }

        public final void t(m0 m0Var) {
            this.segment = m0Var;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"okio/h$c", "Ljava/io/OutputStream;", "", "b", "Ljn0/h0;", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return h.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int b11) {
            h.this.writeByte(b11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int offset, int byteCount) {
            p013kotlin.jvm.internal.s.k(data, "data");
            h.this.write(data, offset, byteCount);
        }
    }

    public static /* synthetic */ a e0(h hVar, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = e.d();
        }
        return hVar.c0(aVar);
    }

    public static /* synthetic */ h e1(h hVar, OutputStream outputStream, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = hVar.size;
        }
        return hVar.d1(outputStream, j11);
    }

    @Override // okio.j
    public short A0() {
        return e.j(readShort());
    }

    @Override // okio.i
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public h T1() {
        return this;
    }

    @Override // okio.i
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public h b2() {
        return this;
    }

    @Override // okio.i
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public h write(byte[] source, int offset, int byteCount) {
        p013kotlin.jvm.internal.s.k(source, "source");
        long j11 = byteCount;
        e.b(source.length, offset, j11);
        int i11 = byteCount + offset;
        while (offset < i11) {
            m0 m0VarU0 = u0(1);
            int iMin = Math.min(i11 - offset, 8192 - m0VarU0.limit);
            int i12 = offset + iMin;
            p013kotlin.collections.n.k(source, m0VarU0.data, m0VarU0.limit, offset, i12);
            m0VarU0.limit += iMin;
            offset = i12;
        }
        r0(getSize() + j11);
        return this;
    }

    @Override // okio.j
    public long D1(p0 sink) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        long size = getSize();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // okio.j
    public void D2(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // okio.j
    public long E0() {
        return e.i(readLong());
    }

    @Override // okio.i
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public h writeByte(int b11) {
        m0 m0VarU0 = u0(1);
        byte[] bArr = m0VarU0.data;
        int i11 = m0VarU0.limit;
        m0VarU0.limit = i11 + 1;
        bArr[i11] = (byte) b11;
        r0(getSize() + 1);
        return this;
    }

    public final byte H(long pos) {
        e.b(getSize(), pos, 1L);
        m0 m0Var = this.head;
        if (m0Var == null) {
            p013kotlin.jvm.internal.s.h(null);
            throw null;
        }
        if (getSize() - pos < pos) {
            long size = getSize();
            while (size > pos) {
                m0Var = m0Var.prev;
                p013kotlin.jvm.internal.s.h(m0Var);
                size -= (long) (m0Var.limit - m0Var.pos);
            }
            p013kotlin.jvm.internal.s.h(m0Var);
            return m0Var.data[(int) ((((long) m0Var.pos) + pos) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (m0Var.limit - m0Var.pos)) + j11;
            if (j12 > pos) {
                p013kotlin.jvm.internal.s.h(m0Var);
                return m0Var.data[(int) ((((long) m0Var.pos) + pos) - j11)];
            }
            m0Var = m0Var.next;
            p013kotlin.jvm.internal.s.h(m0Var);
            j11 = j12;
        }
    }

    @Override // okio.i
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public h I0(long v11) {
        boolean z11;
        if (v11 == 0) {
            return writeByte(48);
        }
        if (v11 < 0) {
            v11 = -v11;
            if (v11 < 0) {
                return l2("-9223372036854775808");
            }
            z11 = true;
        } else {
            z11 = false;
        }
        int iC = ip0.a.c(v11);
        if (z11) {
            iC++;
        }
        m0 m0VarU0 = u0(iC);
        byte[] bArr = m0VarU0.data;
        int i11 = m0VarU0.limit + iC;
        while (v11 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = ip0.a.d()[(int) (v11 % j11)];
            v11 /= j11;
        }
        if (z11) {
            bArr[i11 - 1] = 45;
        }
        m0VarU0.limit += iC;
        r0(getSize() + ((long) iC));
        return this;
    }

    public long I(k bytes, long fromIndex) {
        int i11;
        long j11 = fromIndex;
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        if (bytes.D() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        m0 m0Var = this.head;
        if (m0Var == null) {
            return -1L;
        }
        if (getSize() - j11 >= j11) {
            while (true) {
                long j12 = ((long) (m0Var.limit - m0Var.pos)) + size;
                if (j12 > j11) {
                    break;
                }
                m0Var = m0Var.next;
                p013kotlin.jvm.internal.s.h(m0Var);
                size = j12;
            }
            byte[] bArrQ = bytes.q();
            byte b11 = bArrQ[0];
            int iD = bytes.D();
            long size2 = (getSize() - ((long) iD)) + 1;
            while (size < size2) {
                byte[] bArr = m0Var.data;
                int iMin = (int) Math.min(m0Var.limit, (((long) m0Var.pos) + size2) - size);
                i11 = (int) ((((long) m0Var.pos) + j11) - size);
                while (i11 < iMin) {
                    if (bArr[i11] == b11 && ip0.a.e(m0Var, i11 + 1, bArrQ, 1, iD)) {
                    }
                    i11++;
                }
                size += (long) (m0Var.limit - m0Var.pos);
                m0Var = m0Var.next;
                p013kotlin.jvm.internal.s.h(m0Var);
                j11 = size;
            }
            return -1L;
        }
        size = getSize();
        while (size > j11) {
            m0Var = m0Var.prev;
            p013kotlin.jvm.internal.s.h(m0Var);
            size -= (long) (m0Var.limit - m0Var.pos);
        }
        byte[] bArrQ2 = bytes.q();
        byte b12 = bArrQ2[0];
        int iD2 = bytes.D();
        long size3 = (getSize() - ((long) iD2)) + 1;
        while (size < size3) {
            byte[] bArr2 = m0Var.data;
            long j13 = size3;
            int iMin2 = (int) Math.min(m0Var.limit, (((long) m0Var.pos) + size3) - size);
            i11 = (int) ((((long) m0Var.pos) + j11) - size);
            while (i11 < iMin2) {
                if (bArr2[i11] != b12 || !ip0.a.e(m0Var, i11 + 1, bArrQ2, 1, iD2)) {
                    i11++;
                }
            }
            size += (long) (m0Var.limit - m0Var.pos);
            m0Var = m0Var.next;
            p013kotlin.jvm.internal.s.h(m0Var);
            j11 = size;
            size3 = j13;
        }
        return -1L;
        return ((long) (i11 - m0Var.pos)) + size;
    }

    @Override // okio.i
    public OutputStream I3() {
        return new c();
    }

    public long J(k targetBytes, long fromIndex) {
        int i11;
        int i12;
        p013kotlin.jvm.internal.s.k(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        m0 m0Var = this.head;
        if (m0Var == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                m0Var = m0Var.prev;
                p013kotlin.jvm.internal.s.h(m0Var);
                size -= (long) (m0Var.limit - m0Var.pos);
            }
            if (targetBytes.D() == 2) {
                byte bH = targetBytes.h(0);
                byte bH2 = targetBytes.h(1);
                while (size < getSize()) {
                    byte[] bArr = m0Var.data;
                    i11 = (int) ((((long) m0Var.pos) + fromIndex) - size);
                    int i13 = m0Var.limit;
                    while (true) {
                        if (i11 >= i13) {
                            size += (long) (m0Var.limit - m0Var.pos);
                            m0Var = m0Var.next;
                            p013kotlin.jvm.internal.s.h(m0Var);
                            fromIndex = size;
                        } else {
                            byte b11 = bArr[i11];
                            if (b11 == bH || b11 == bH2) {
                                i12 = m0Var.pos;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrQ = targetBytes.q();
                while (size < getSize()) {
                    byte[] bArr2 = m0Var.data;
                    i11 = (int) ((((long) m0Var.pos) + fromIndex) - size);
                    int i14 = m0Var.limit;
                    while (true) {
                        if (i11 < i14) {
                            byte b12 = bArr2[i11];
                            int length = bArrQ.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    i11++;
                                } else if (b12 == bArrQ[i15]) {
                                    i12 = m0Var.pos;
                                } else {
                                    i15++;
                                }
                            }
                        } else {
                            size += (long) (m0Var.limit - m0Var.pos);
                            m0Var = m0Var.next;
                            p013kotlin.jvm.internal.s.h(m0Var);
                            fromIndex = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (m0Var.limit - m0Var.pos)) + size;
            if (j11 > fromIndex) {
                break;
            }
            m0Var = m0Var.next;
            p013kotlin.jvm.internal.s.h(m0Var);
            size = j11;
        }
        if (targetBytes.D() == 2) {
            byte bH3 = targetBytes.h(0);
            byte bH4 = targetBytes.h(1);
            while (size < getSize()) {
                byte[] bArr3 = m0Var.data;
                i11 = (int) ((((long) m0Var.pos) + fromIndex) - size);
                int i16 = m0Var.limit;
                while (true) {
                    if (i11 >= i16) {
                        size += (long) (m0Var.limit - m0Var.pos);
                        m0Var = m0Var.next;
                        p013kotlin.jvm.internal.s.h(m0Var);
                        fromIndex = size;
                    } else {
                        byte b13 = bArr3[i11];
                        if (b13 == bH3 || b13 == bH4) {
                            i12 = m0Var.pos;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrQ2 = targetBytes.q();
            while (size < getSize()) {
                byte[] bArr4 = m0Var.data;
                i11 = (int) ((((long) m0Var.pos) + fromIndex) - size);
                int i17 = m0Var.limit;
                while (true) {
                    if (i11 < i17) {
                        byte b14 = bArr4[i11];
                        int length2 = bArrQ2.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length2) {
                                i11++;
                            } else if (b14 == bArrQ2[i18]) {
                                i12 = m0Var.pos;
                            } else {
                                i18++;
                            }
                        }
                    } else {
                        size += (long) (m0Var.limit - m0Var.pos);
                        m0Var = m0Var.next;
                        p013kotlin.jvm.internal.s.h(m0Var);
                        fromIndex = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i11 - i12)) + size;
    }

    @Override // okio.i
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public h l1(long v11) {
        if (v11 == 0) {
            return writeByte(48);
        }
        long j11 = (v11 >>> 1) | v11;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j21 = j19 + (j19 >>> 8);
        long j22 = j21 + (j21 >>> 16);
        int i11 = (int) ((((j22 & 63) + ((j22 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        m0 m0VarU0 = u0(i11);
        byte[] bArr = m0VarU0.data;
        int i12 = m0VarU0.limit;
        for (int i13 = (i12 + i11) - 1; i13 >= i12; i13--) {
            bArr[i13] = ip0.a.d()[(int) (15 & v11)];
            v11 >>>= 4;
        }
        m0VarU0.limit += i11;
        r0(getSize() + ((long) i11));
        return this;
    }

    @Override // okio.j
    public long J1() throws EOFException {
        int i11;
        if (getSize() == 0) {
            throw new EOFException();
        }
        int i12 = 0;
        boolean z11 = false;
        long j11 = 0;
        do {
            m0 m0Var = this.head;
            p013kotlin.jvm.internal.s.h(m0Var);
            byte[] bArr = m0Var.data;
            int i13 = m0Var.pos;
            int i14 = m0Var.limit;
            while (i13 < i14) {
                byte b11 = bArr[i13];
                if (b11 >= 48 && b11 <= 57) {
                    i11 = b11 - 48;
                } else if (b11 >= 97 && b11 <= 102) {
                    i11 = b11 - 87;
                } else {
                    if (b11 < 65 || b11 > 70) {
                        if (i12 != 0) {
                            z11 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + e.k(b11));
                    }
                    i11 = b11 - 55;
                }
                if (((-1152921504606846976L) & j11) != 0) {
                    throw new NumberFormatException("Number too large: " + new h().l1(j11).writeByte(b11).t1());
                }
                j11 = (j11 << 4) | ((long) i11);
                i13++;
                i12++;
            }
            if (i13 == i14) {
                this.head = m0Var.b();
                n0.b(m0Var);
            } else {
                m0Var.pos = i13;
            }
            if (z11) {
                break;
            }
        } while (this.head != null);
        r0(getSize() - ((long) i12));
        return j11;
    }

    @Override // okio.i
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public h writeInt(int i11) {
        m0 m0VarU0 = u0(4);
        byte[] bArr = m0VarU0.data;
        int i12 = m0VarU0.limit;
        bArr[i12] = (byte) ((i11 >>> 24) & 255);
        bArr[i12 + 1] = (byte) ((i11 >>> 16) & 255);
        bArr[i12 + 2] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 3] = (byte) (i11 & 255);
        m0VarU0.limit = i12 + 4;
        r0(getSize() + 4);
        return this;
    }

    @Override // okio.j
    public InputStream K3() {
        return new b();
    }

    @Override // okio.j
    public String M0(long byteCount) throws EOFException {
        return k0(byteCount, p013kotlin.text.d.UTF_8);
    }

    @Override // okio.j
    public int M3(g0 options) throws EOFException {
        p013kotlin.jvm.internal.s.k(options, "options");
        int iH = ip0.a.h(this, options, false, 2, null);
        if (iH == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iH].D());
        return iH;
    }

    @Override // okio.i
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public h X0(int i11) {
        return writeInt(e.h(i11));
    }

    public h P0(long v11) {
        m0 m0VarU0 = u0(8);
        byte[] bArr = m0VarU0.data;
        int i11 = m0VarU0.limit;
        bArr[i11] = (byte) ((v11 >>> 56) & 255);
        bArr[i11 + 1] = (byte) ((v11 >>> 48) & 255);
        bArr[i11 + 2] = (byte) ((v11 >>> 40) & 255);
        bArr[i11 + 3] = (byte) ((v11 >>> 32) & 255);
        bArr[i11 + 4] = (byte) ((v11 >>> 24) & 255);
        bArr[i11 + 5] = (byte) ((v11 >>> 16) & 255);
        bArr[i11 + 6] = (byte) ((v11 >>> 8) & 255);
        bArr[i11 + 7] = (byte) (v11 & 255);
        m0VarU0.limit = i11 + 8;
        r0(getSize() + 8);
        return this;
    }

    @Override // okio.j
    public h P1() {
        return this;
    }

    @Override // okio.j
    public k Q0(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            return new k(y2(byteCount));
        }
        k kVarT0 = t0((int) byteCount);
        skip(byteCount);
        return kVarT0;
    }

    @Override // okio.i
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public h Y(long v11) {
        return P0(e.i(v11));
    }

    @Override // okio.j
    public boolean T2() {
        return this.size == 0;
    }

    @Override // okio.i
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public h writeShort(int s11) {
        m0 m0VarU0 = u0(2);
        byte[] bArr = m0VarU0.data;
        int i11 = m0VarU0.limit;
        bArr[i11] = (byte) ((s11 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (s11 & 255);
        m0VarU0.limit = i11 + 2;
        r0(getSize() + 2);
        return this;
    }

    @Override // okio.j
    public byte[] V0() {
        return y2(getSize());
    }

    @Override // okio.j
    public long X2() throws EOFException {
        long j11;
        byte b11;
        long j12 = 0;
        if (getSize() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z11 = false;
        long j13 = 0;
        long j14 = -7;
        boolean z12 = false;
        loop0: while (true) {
            m0 m0Var = this.head;
            p013kotlin.jvm.internal.s.h(m0Var);
            byte[] bArr = m0Var.data;
            int i12 = m0Var.pos;
            int i13 = m0Var.limit;
            while (true) {
                if (i12 >= i13) {
                    j11 = j12;
                    break;
                }
                b11 = bArr[i12];
                if (b11 >= 48 && b11 <= 57) {
                    int i14 = 48 - b11;
                    if (j13 < -922337203685477580L) {
                        break loop0;
                    }
                    j11 = j12;
                    if (j13 == -922337203685477580L && i14 < j14) {
                        break loop0;
                    }
                    j13 = (j13 * 10) + ((long) i14);
                } else {
                    j11 = j12;
                    if (b11 != 45 || i11 != 0) {
                        z12 = true;
                        break;
                    }
                    j14--;
                    z11 = true;
                }
                i12++;
                i11++;
                j12 = j11;
            }
            if (i12 == i13) {
                this.head = m0Var.b();
                n0.b(m0Var);
            } else {
                m0Var.pos = i12;
            }
            if (z12 || this.head == null) {
                r0(getSize() - ((long) i11));
                if (i11 >= (z11 ? 2 : 1)) {
                    return z11 ? j13 : -j13;
                }
                if (getSize() == j11) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z11 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + e.k(H(j11)));
            }
            j12 = j11;
        }
        h hVarWriteByte = new h().I0(j13).writeByte(b11);
        if (!z11) {
            hVarWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + hVarWriteByte.t1());
    }

    public h Y0(String string, int beginIndex, int endIndex, Charset charset) {
        p013kotlin.jvm.internal.s.k(string, "string");
        p013kotlin.jvm.internal.s.k(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        if (p013kotlin.jvm.internal.s.f(charset, p013kotlin.text.d.UTF_8)) {
            return p0(string, beginIndex, endIndex);
        }
        String strSubstring = string.substring(beginIndex, endIndex);
        p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // okio.j
    public long Z(k bytes) {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        return I(bytes, 0L);
    }

    @Override // okio.j
    public void Z1(h sink, long byteCount) throws EOFException {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        if (getSize() >= byteCount) {
            sink.write(this, byteCount);
        } else {
            sink.write(this, getSize());
            throw new EOFException();
        }
    }

    @Override // okio.j
    public long a2(byte b11, long fromIndex, long toIndex) {
        m0 m0Var;
        int i11;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + getSize() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > getSize()) {
            toIndex = getSize();
        }
        if (fromIndex == toIndex || (m0Var = this.head) == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                m0Var = m0Var.prev;
                p013kotlin.jvm.internal.s.h(m0Var);
                size -= (long) (m0Var.limit - m0Var.pos);
            }
            while (size < toIndex) {
                byte[] bArr = m0Var.data;
                int iMin = (int) Math.min(m0Var.limit, (((long) m0Var.pos) + toIndex) - size);
                i11 = (int) ((((long) m0Var.pos) + fromIndex) - size);
                while (i11 < iMin) {
                    if (bArr[i11] != b11) {
                        i11++;
                    }
                }
                size += (long) (m0Var.limit - m0Var.pos);
                m0Var = m0Var.next;
                p013kotlin.jvm.internal.s.h(m0Var);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (m0Var.limit - m0Var.pos)) + size;
            if (j11 > fromIndex) {
                break;
            }
            m0Var = m0Var.next;
            p013kotlin.jvm.internal.s.h(m0Var);
            size = j11;
        }
        while (size < toIndex) {
            byte[] bArr2 = m0Var.data;
            int iMin2 = (int) Math.min(m0Var.limit, (((long) m0Var.pos) + toIndex) - size);
            i11 = (int) ((((long) m0Var.pos) + fromIndex) - size);
            while (i11 < iMin2) {
                if (bArr2[i11] != b11) {
                    i11++;
                }
            }
            size += (long) (m0Var.limit - m0Var.pos);
            m0Var = m0Var.next;
            p013kotlin.jvm.internal.s.h(m0Var);
            fromIndex = size;
        }
        return -1L;
        return ((long) (i11 - m0Var.pos)) + size;
    }

    public boolean b0(long offset, k bytes, int bytesOffset, int byteCount) {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || getSize() - offset < byteCount || bytes.D() - bytesOffset < byteCount) {
            return false;
        }
        for (int i11 = 0; i11 < byteCount; i11++) {
            if (H(((long) i11) + offset) != bytes.h(bytesOffset + i11)) {
                return false;
            }
        }
        return true;
    }

    public final void c() throws EOFException {
        skip(getSize());
    }

    public final a c0(a unsafeCursor) {
        p013kotlin.jvm.internal.s.k(unsafeCursor, "unsafeCursor");
        return ip0.a.b(this, unsafeCursor);
    }

    public h c1(String string, Charset charset) {
        p013kotlin.jvm.internal.s.k(string, "string");
        p013kotlin.jvm.internal.s.k(charset, "charset");
        return Y0(string, 0, string.length(), charset);
    }

    @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.j
    public long d0(k targetBytes) {
        p013kotlin.jvm.internal.s.k(targetBytes, "targetBytes");
        return J(targetBytes, 0L);
    }

    public final h d1(OutputStream out, long byteCount) throws IOException {
        p013kotlin.jvm.internal.s.k(out, "out");
        e.b(this.size, 0L, byteCount);
        m0 m0Var = this.head;
        long j11 = byteCount;
        while (j11 > 0) {
            p013kotlin.jvm.internal.s.h(m0Var);
            int iMin = (int) Math.min(j11, m0Var.limit - m0Var.pos);
            out.write(m0Var.data, m0Var.pos, iMin);
            int i11 = m0Var.pos + iMin;
            m0Var.pos = i11;
            long j12 = iMin;
            this.size -= j12;
            j11 -= j12;
            if (i11 == m0Var.limit) {
                m0 m0VarB = m0Var.b();
                this.head = m0VarB;
                n0.b(m0Var);
                m0Var = m0VarB;
            }
        }
        return this;
    }

    @Override // okio.j
    public String e2(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j11 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jA2 = a2((byte) 10, 0L, j11);
        if (jA2 != -1) {
            return ip0.a.f(this, jA2);
        }
        if (j11 < getSize() && H(j11 - 1) == 13 && H(j11) == 10) {
            return ip0.a.f(this, j11);
        }
        h hVar = new h();
        t(hVar, 0L, Math.min(32, getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(getSize(), limit) + " content=" + hVar.m1().m() + (char) 8230);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        if (getSize() != hVar.getSize()) {
            return false;
        }
        if (getSize() == 0) {
            return true;
        }
        m0 m0Var = this.head;
        p013kotlin.jvm.internal.s.h(m0Var);
        m0 m0Var2 = hVar.head;
        p013kotlin.jvm.internal.s.h(m0Var2);
        int i11 = m0Var.pos;
        int i12 = m0Var2.pos;
        long j11 = 0;
        while (j11 < getSize()) {
            long jMin = Math.min(m0Var.limit - i11, m0Var2.limit - i12);
            long j12 = 0;
            while (j12 < jMin) {
                int i13 = i11 + 1;
                int i14 = i12 + 1;
                if (m0Var.data[i11] != m0Var2.data[i12]) {
                    return false;
                }
                j12++;
                i11 = i13;
                i12 = i14;
            }
            if (i11 == m0Var.limit) {
                m0Var = m0Var.next;
                p013kotlin.jvm.internal.s.h(m0Var);
                i11 = m0Var.pos;
            }
            if (i12 == m0Var2.limit) {
                m0Var2 = m0Var2.next;
                p013kotlin.jvm.internal.s.h(m0Var2);
                i12 = m0Var2.pos;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // okio.i, okio.p0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.i
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public h l2(String string) {
        p013kotlin.jvm.internal.s.k(string, "string");
        return p0(string, 0, string.length());
    }

    public int hashCode() {
        m0 m0Var = this.head;
        if (m0Var == null) {
            return 0;
        }
        int i11 = 1;
        do {
            int i12 = m0Var.limit;
            for (int i13 = m0Var.pos; i13 < i12; i13++) {
                i11 = (i11 * 31) + m0Var.data[i13];
            }
            m0Var = m0Var.next;
            p013kotlin.jvm.internal.s.h(m0Var);
        } while (m0Var != this.head);
        return i11;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // okio.j
    public String j1(Charset charset) {
        p013kotlin.jvm.internal.s.k(charset, "charset");
        return k0(this.size, charset);
    }

    public String k0(long byteCount, Charset charset) throws EOFException {
        p013kotlin.jvm.internal.s.k(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        m0 m0Var = this.head;
        p013kotlin.jvm.internal.s.h(m0Var);
        int i11 = m0Var.pos;
        if (((long) i11) + byteCount > m0Var.limit) {
            return new String(y2(byteCount), charset);
        }
        int i12 = (int) byteCount;
        String str = new String(m0Var.data, i11, i12, charset);
        int i13 = m0Var.pos + i12;
        m0Var.pos = i13;
        this.size -= byteCount;
        if (i13 == m0Var.limit) {
            this.head = m0Var.b();
            n0.b(m0Var);
        }
        return str;
    }

    @Override // okio.i
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public h p0(String string, int beginIndex, int endIndex) {
        char cCharAt;
        p013kotlin.jvm.internal.s.k(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        while (beginIndex < endIndex) {
            char cCharAt2 = string.charAt(beginIndex);
            if (cCharAt2 < 128) {
                m0 m0VarU0 = u0(1);
                byte[] bArr = m0VarU0.data;
                int i11 = m0VarU0.limit - beginIndex;
                int iMin = Math.min(endIndex, 8192 - i11);
                int i12 = beginIndex + 1;
                bArr[beginIndex + i11] = (byte) cCharAt2;
                while (true) {
                    beginIndex = i12;
                    if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i12 = beginIndex + 1;
                    bArr[beginIndex + i11] = (byte) cCharAt;
                }
                int i13 = m0VarU0.limit;
                int i14 = (i11 + beginIndex) - i13;
                m0VarU0.limit = i13 + i14;
                r0(getSize() + ((long) i14));
            } else {
                if (cCharAt2 < 2048) {
                    m0 m0VarU1 = u0(2);
                    byte[] bArr2 = m0VarU1.data;
                    int i15 = m0VarU1.limit;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    m0VarU1.limit = i15 + 2;
                    r0(getSize() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    m0 m0VarU2 = u0(3);
                    byte[] bArr3 = m0VarU2.data;
                    int i16 = m0VarU2.limit;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    m0VarU2.limit = i16 + 3;
                    r0(getSize() + 3);
                } else {
                    int i17 = beginIndex + 1;
                    char cCharAt3 = i17 < endIndex ? string.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        beginIndex = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        m0 m0VarU3 = u0(4);
                        byte[] bArr4 = m0VarU3.data;
                        int i19 = m0VarU3.limit;
                        bArr4[i19] = (byte) ((i18 >> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        m0VarU3.limit = i19 + 4;
                        r0(getSize() + 4);
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    @Override // okio.j, okio.i
    public h l() {
        return this;
    }

    @Override // okio.j
    public boolean l0(long offset, k bytes) {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        return b0(offset, bytes, 0, bytes.D());
    }

    @Override // okio.j
    public k m1() {
        return Q0(getSize());
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public h clone() {
        return p();
    }

    public int n0() throws EOFException {
        int i11;
        int i12;
        int i13;
        if (getSize() == 0) {
            throw new EOFException();
        }
        byte bH = H(0L);
        if ((bH & 128) == 0) {
            i11 = bH & 127;
            i13 = 0;
            i12 = 1;
        } else if ((bH & 224) == 192) {
            i11 = bH & 31;
            i12 = 2;
            i13 = 128;
        } else if ((bH & 240) == 224) {
            i11 = bH & 15;
            i12 = 3;
            i13 = 2048;
        } else {
            if ((bH & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i11 = bH & 7;
            i12 = 4;
            i13 = 65536;
        }
        long j11 = i12;
        if (getSize() < j11) {
            throw new EOFException("size < " + i12 + ": " + getSize() + " (to read code point prefixed 0x" + e.k(bH) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        for (int i14 = 1; i14 < i12; i14++) {
            long j12 = i14;
            byte bH2 = H(j12);
            if ((bH2 & 192) != 128) {
                skip(j12);
                return 65533;
            }
            i11 = (i11 << 6) | (bH2 & 63);
        }
        skip(j11);
        if (i11 > 1114111) {
            return 65533;
        }
        if ((55296 > i11 || i11 >= 57344) && i11 >= i13) {
            return i11;
        }
        return 65533;
    }

    public final long o() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        m0 m0Var = this.head;
        p013kotlin.jvm.internal.s.h(m0Var);
        m0 m0Var2 = m0Var.prev;
        p013kotlin.jvm.internal.s.h(m0Var2);
        int i11 = m0Var2.limit;
        return (i11 >= 8192 || !m0Var2.owner) ? size : size - ((long) (i11 - m0Var2.pos));
    }

    public final h p() {
        h hVar = new h();
        if (getSize() == 0) {
            return hVar;
        }
        m0 m0Var = this.head;
        p013kotlin.jvm.internal.s.h(m0Var);
        m0 m0VarD = m0Var.d();
        hVar.head = m0VarD;
        m0VarD.prev = m0VarD;
        m0VarD.next = m0VarD;
        for (m0 m0Var2 = m0Var.next; m0Var2 != m0Var; m0Var2 = m0Var2.next) {
            m0 m0Var3 = m0VarD.prev;
            p013kotlin.jvm.internal.s.h(m0Var3);
            p013kotlin.jvm.internal.s.h(m0Var2);
            m0Var3.c(m0Var2.d());
        }
        hVar.r0(getSize());
        return hVar;
    }

    @Override // okio.j
    public j peek() {
        return c0.d(new j0(this));
    }

    @Override // okio.i
    public long q2(r0 source) {
        p013kotlin.jvm.internal.s.k(source, "source");
        long j11 = 0;
        while (true) {
            long j12 = source.read(this, FileAppender.DEFAULT_BUFFER_SIZE);
            if (j12 == -1) {
                return j11;
            }
            j11 += j12;
        }
    }

    public final void r0(long j11) {
        this.size = j11;
    }

    public h r1(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            m0 m0VarU0 = u0(2);
            byte[] bArr = m0VarU0.data;
            int i11 = m0VarU0.limit;
            bArr[i11] = (byte) ((codePoint >> 6) | 192);
            bArr[i11 + 1] = (byte) ((codePoint & 63) | 128);
            m0VarU0.limit = i11 + 2;
            r0(getSize() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            m0 m0VarU1 = u0(3);
            byte[] bArr2 = m0VarU1.data;
            int i12 = m0VarU1.limit;
            bArr2[i12] = (byte) ((codePoint >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((codePoint & 63) | 128);
            m0VarU1.limit = i12 + 3;
            r0(getSize() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + e.l(codePoint));
        }
        m0 m0VarU2 = u0(4);
        byte[] bArr3 = m0VarU2.data;
        int i13 = m0VarU2.limit;
        bArr3[i13] = (byte) ((codePoint >> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        bArr3[i13 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((codePoint & 63) | 128);
        m0VarU2.limit = i13 + 4;
        r0(getSize() + 4);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        m0 m0Var = this.head;
        if (m0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), m0Var.limit - m0Var.pos);
        sink.put(m0Var.data, m0Var.pos, iMin);
        int i11 = m0Var.pos + iMin;
        m0Var.pos = i11;
        this.size -= (long) iMin;
        if (i11 == m0Var.limit) {
            this.head = m0Var.b();
            n0.b(m0Var);
        }
        return iMin;
    }

    @Override // okio.j
    public byte readByte() throws EOFException {
        if (getSize() == 0) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        p013kotlin.jvm.internal.s.h(m0Var);
        int i11 = m0Var.pos;
        int i12 = m0Var.limit;
        int i13 = i11 + 1;
        byte b11 = m0Var.data[i11];
        r0(getSize() - 1);
        if (i13 != i12) {
            m0Var.pos = i13;
            return b11;
        }
        this.head = m0Var.b();
        n0.b(m0Var);
        return b11;
    }

    @Override // okio.j
    public void readFully(byte[] sink) throws EOFException {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        int i11 = 0;
        while (i11 < sink.length) {
            int i12 = read(sink, i11, sink.length - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
    }

    @Override // okio.j
    public int readInt() throws EOFException {
        if (getSize() < 4) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        p013kotlin.jvm.internal.s.h(m0Var);
        int i11 = m0Var.pos;
        int i12 = m0Var.limit;
        if (i12 - i11 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = m0Var.data;
        int i13 = i11 + 3;
        int i14 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 2] & 255) << 8);
        int i15 = i11 + 4;
        int i16 = (bArr[i13] & 255) | i14;
        r0(getSize() - 4);
        if (i15 != i12) {
            m0Var.pos = i15;
            return i16;
        }
        this.head = m0Var.b();
        n0.b(m0Var);
        return i16;
    }

    @Override // okio.j
    public long readLong() throws EOFException {
        if (getSize() < 8) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        p013kotlin.jvm.internal.s.h(m0Var);
        int i11 = m0Var.pos;
        int i12 = m0Var.limit;
        if (i12 - i11 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = m0Var.data;
        int i13 = i11 + 7;
        long j11 = ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11 + 2]) & 255) << 40) | ((((long) bArr[i11 + 3]) & 255) << 32) | ((((long) bArr[i11 + 4]) & 255) << 24) | ((((long) bArr[i11 + 5]) & 255) << 16) | ((((long) bArr[i11 + 6]) & 255) << 8);
        int i14 = i11 + 8;
        long j12 = j11 | (((long) bArr[i13]) & 255);
        r0(getSize() - 8);
        if (i14 != i12) {
            m0Var.pos = i14;
            return j12;
        }
        this.head = m0Var.b();
        n0.b(m0Var);
        return j12;
    }

    @Override // okio.j
    public short readShort() throws EOFException {
        if (getSize() < 2) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        p013kotlin.jvm.internal.s.h(m0Var);
        int i11 = m0Var.pos;
        int i12 = m0Var.limit;
        if (i12 - i11 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = m0Var.data;
        int i13 = i11 + 1;
        int i14 = (bArr[i11] & 255) << 8;
        int i15 = i11 + 2;
        int i16 = (bArr[i13] & 255) | i14;
        r0(getSize() - 2);
        if (i15 == i12) {
            this.head = m0Var.b();
            n0.b(m0Var);
        } else {
            m0Var.pos = i15;
        }
        return (short) i16;
    }

    @Override // okio.j
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    public final k s0() {
        if (getSize() <= 2147483647L) {
            return t0((int) getSize());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + getSize()).toString());
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // okio.j
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            m0 m0Var = this.head;
            if (m0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
            long j11 = iMin;
            r0(getSize() - j11);
            byteCount -= j11;
            int i11 = m0Var.pos + iMin;
            m0Var.pos = i11;
            if (i11 == m0Var.limit) {
                this.head = m0Var.b();
                n0.b(m0Var);
            }
        }
    }

    public final h t(h out, long offset, long byteCount) {
        p013kotlin.jvm.internal.s.k(out, "out");
        long j11 = offset;
        e.b(getSize(), j11, byteCount);
        if (byteCount != 0) {
            out.r0(out.getSize() + byteCount);
            m0 m0Var = this.head;
            while (true) {
                p013kotlin.jvm.internal.s.h(m0Var);
                int i11 = m0Var.limit;
                int i12 = m0Var.pos;
                if (j11 < i11 - i12) {
                    break;
                }
                j11 -= (long) (i11 - i12);
                m0Var = m0Var.next;
            }
            m0 m0Var2 = m0Var;
            long j12 = byteCount;
            while (j12 > 0) {
                p013kotlin.jvm.internal.s.h(m0Var2);
                m0 m0VarD = m0Var2.d();
                int i13 = m0VarD.pos + ((int) j11);
                m0VarD.pos = i13;
                m0VarD.limit = Math.min(i13 + ((int) j12), m0VarD.limit);
                m0 m0Var3 = out.head;
                if (m0Var3 == null) {
                    m0VarD.prev = m0VarD;
                    m0VarD.next = m0VarD;
                    out.head = m0VarD;
                } else {
                    p013kotlin.jvm.internal.s.h(m0Var3);
                    m0 m0Var4 = m0Var3.prev;
                    p013kotlin.jvm.internal.s.h(m0Var4);
                    m0Var4.c(m0VarD);
                }
                j12 -= (long) (m0VarD.limit - m0VarD.pos);
                m0Var2 = m0Var2.next;
                j11 = 0;
            }
        }
        return this;
    }

    public final k t0(int byteCount) {
        if (byteCount == 0) {
            return k.f97943e;
        }
        e.b(getSize(), 0L, byteCount);
        m0 m0Var = this.head;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < byteCount) {
            p013kotlin.jvm.internal.s.h(m0Var);
            int i14 = m0Var.limit;
            int i15 = m0Var.pos;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            m0Var = m0Var.next;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        m0 m0Var2 = this.head;
        int i16 = 0;
        while (i11 < byteCount) {
            p013kotlin.jvm.internal.s.h(m0Var2);
            bArr[i16] = m0Var2.data;
            i11 += m0Var2.limit - m0Var2.pos;
            iArr[i16] = Math.min(i11, byteCount);
            iArr[i16 + i13] = m0Var2.pos;
            m0Var2.shared = true;
            i16++;
            m0Var2 = m0Var2.next;
        }
        return new o0(bArr, iArr);
    }

    @Override // okio.j
    public String t1() {
        return k0(this.size, p013kotlin.text.d.UTF_8);
    }

    @Override // okio.r0
    public s0 timeout() {
        return s0.NONE;
    }

    public String toString() {
        return s0().toString();
    }

    public final m0 u0(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        m0 m0Var = this.head;
        if (m0Var != null) {
            p013kotlin.jvm.internal.s.h(m0Var);
            m0 m0Var2 = m0Var.prev;
            p013kotlin.jvm.internal.s.h(m0Var2);
            return (m0Var2.limit + minimumCapacity > 8192 || !m0Var2.owner) ? m0Var2.c(n0.c()) : m0Var2;
        }
        m0 m0VarC = n0.c();
        this.head = m0VarC;
        m0VarC.prev = m0VarC;
        m0VarC.next = m0VarC;
        return m0VarC;
    }

    @Override // okio.i
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public h A1(k byteString) {
        p013kotlin.jvm.internal.s.k(byteString, "byteString");
        byteString.L(this, 0, byteString.D());
        return this;
    }

    @Override // okio.j
    public String w2() {
        return e2(Long.MAX_VALUE);
    }

    @Override // okio.j
    public int w3() {
        return e.h(readInt());
    }

    public h y0(r0 source, long byteCount) throws EOFException {
        p013kotlin.jvm.internal.s.k(source, "source");
        while (byteCount > 0) {
            long j11 = source.read(this, byteCount);
            if (j11 == -1) {
                throw new EOFException();
            }
            byteCount -= j11;
        }
        return this;
    }

    @Override // okio.j
    public byte[] y2(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.i
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public h write(byte[] source) {
        p013kotlin.jvm.internal.s.k(source, "source");
        return write(source, 0, source.length);
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"okio/h$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "Ljn0/h0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(h.this.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (h.this.getSize() > 0) {
                return h.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return h.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            p013kotlin.jvm.internal.s.k(sink, "sink");
            return h.this.read(sink, offset, byteCount);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        p013kotlin.jvm.internal.s.k(source, "source");
        int iRemaining = source.remaining();
        int i11 = iRemaining;
        while (i11 > 0) {
            m0 m0VarU0 = u0(1);
            int iMin = Math.min(i11, 8192 - m0VarU0.limit);
            source.get(m0VarU0.data, m0VarU0.limit, iMin);
            i11 -= iMin;
            m0VarU0.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] sink, int offset, int byteCount) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        e.b(sink.length, offset, byteCount);
        m0 m0Var = this.head;
        if (m0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, m0Var.limit - m0Var.pos);
        byte[] bArr = m0Var.data;
        int i11 = m0Var.pos;
        p013kotlin.collections.n.k(bArr, sink, offset, i11, i11 + iMin);
        m0Var.pos += iMin;
        r0(getSize() - ((long) iMin));
        if (m0Var.pos == m0Var.limit) {
            this.head = m0Var.b();
            n0.b(m0Var);
        }
        return iMin;
    }

    @Override // okio.p0
    public void write(h source, long byteCount) {
        m0 m0Var;
        p013kotlin.jvm.internal.s.k(source, "source");
        if (source != this) {
            e.b(source.getSize(), 0L, byteCount);
            while (byteCount > 0) {
                m0 m0Var2 = source.head;
                p013kotlin.jvm.internal.s.h(m0Var2);
                int i11 = m0Var2.limit;
                m0 m0Var3 = source.head;
                p013kotlin.jvm.internal.s.h(m0Var3);
                if (byteCount < i11 - m0Var3.pos) {
                    m0 m0Var4 = this.head;
                    if (m0Var4 != null) {
                        p013kotlin.jvm.internal.s.h(m0Var4);
                        m0Var = m0Var4.prev;
                    } else {
                        m0Var = null;
                    }
                    if (m0Var != null && m0Var.owner) {
                        if ((((long) m0Var.limit) + byteCount) - ((long) (m0Var.shared ? 0 : m0Var.pos)) <= FileAppender.DEFAULT_BUFFER_SIZE) {
                            m0 m0Var5 = source.head;
                            p013kotlin.jvm.internal.s.h(m0Var5);
                            m0Var5.g(m0Var, (int) byteCount);
                            source.r0(source.getSize() - byteCount);
                            r0(getSize() + byteCount);
                            return;
                        }
                    }
                    m0 m0Var6 = source.head;
                    p013kotlin.jvm.internal.s.h(m0Var6);
                    source.head = m0Var6.e((int) byteCount);
                }
                m0 m0Var7 = source.head;
                p013kotlin.jvm.internal.s.h(m0Var7);
                long j11 = m0Var7.limit - m0Var7.pos;
                source.head = m0Var7.b();
                m0 m0Var8 = this.head;
                if (m0Var8 == null) {
                    this.head = m0Var7;
                    m0Var7.prev = m0Var7;
                    m0Var7.next = m0Var7;
                } else {
                    p013kotlin.jvm.internal.s.h(m0Var8);
                    m0 m0Var9 = m0Var8.prev;
                    p013kotlin.jvm.internal.s.h(m0Var9);
                    m0Var9.c(m0Var7).a();
                }
                source.r0(source.getSize() - j11);
                r0(getSize() + j11);
                byteCount -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // okio.r0
    public long read(h sink, long byteCount) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (getSize() == 0) {
            return -1L;
        }
        if (byteCount > getSize()) {
            byteCount = getSize();
        }
        sink.write(this, byteCount);
        return byteCount;
    }
}
