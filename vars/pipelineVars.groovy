class pipelineVars implements Serializable {
    public String lintContext = "continuous-integration/jenkins/lint"
    public String unitTestContext = "continuous-integration/jenkins/unittest"
    public String pipInstallContext = "continuous-integration/jenkins/pipinstall"
    public String swaggerContext = "continuous-integration/jenkins/swagger"
    public String coverageContext = "continuous-integration/jenkins/coverage"
    public String smokeContext = "continuous-integration/jenkins/e2e-smoke"
    public String userPath = "~/.local/bin"
    public String jenkinsSvcAccount = "jenkins"
    public String defaultNameSpace = "jenkins"
    public String gitSshCreds = "insightsdroid-ssh-git"
    public String smokeTestResourceLabel = "smoke_test_projects"
    public String defaultNodeImage = "docker-registry.default.svc:5000/jenkins/jenkins-slave-base-centos7-python36:latest"
}