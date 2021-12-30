def scriptApproval = org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get()
def approvals = [] + scriptApproval.getApprovedSignatures()
approvals = approvals.flatten()
approvals.remove '<signature to remove>'
String[] newApprovals = new ArrayList<String>(approvals)
scriptApproval.setApprovedSignatures newApprovals
scriptApproval.save()
