package org.javacs.kt

import java.util.concurrent.CompletableFuture
import org.eclipse.lsp4j.*
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment

@JsonSegment("kotlin")
interface KotlinProtocolExtensions {
    @JsonRequest
    fun jarClassContents(textDocument: TextDocumentIdentifier): CompletableFuture<String?>

    @JsonRequest fun buildOutputLocation(): CompletableFuture<String?>

    @JsonRequest
    fun mainClass(textDocument: TextDocumentIdentifier): CompletableFuture<Map<String, Any?>>

    @JsonRequest
    fun overrideMember(position: TextDocumentPositionParams): CompletableFuture<List<CodeAction>>
}
