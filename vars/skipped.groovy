import org.jenkinsci.plugins.pipeline.modeldefinition.Utils

void call(Object message) {
    print("WARNING: ${message ? message.toString() : "stage $env.STAGE_NAME marked as skipped"}")
    Utils.markStageSkippedForConditional(env.STAGE_NAME)
}