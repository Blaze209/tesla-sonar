package com.google.protobuf;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/SourceContextKt$Dsl;", "Ljn0/h0;", "block", "Lcom/google/protobuf/SourceContext;", "-initializesourceContext", "(Lwn0/l;)Lcom/google/protobuf/SourceContext;", "sourceContext", "copy", "(Lcom/google/protobuf/SourceContext;Lwn0/l;)Lcom/google/protobuf/SourceContext;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SourceContextKtKt {
    /* JADX INFO: renamed from: -initializesourceContext, reason: not valid java name */
    public static final SourceContext m115initializesourceContext(l<? super SourceContextKt.Dsl, h0> block) {
        s.k(block, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.INSTANCE;
        SourceContext.Builder builderNewBuilder = SourceContext.newBuilder();
        s.j(builderNewBuilder, "newBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext copy(SourceContext sourceContext, l<? super SourceContextKt.Dsl, h0> block) {
        s.k(sourceContext, "<this>");
        s.k(block, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.INSTANCE;
        SourceContext.Builder builder = sourceContext.toBuilder();
        s.j(builder, "this.toBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
