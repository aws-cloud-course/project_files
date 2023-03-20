terraform {
    required_providers {
        aws = {
            source = "hashicorp/aws"
            version = "~> 3.0"
        }
    }
}

provider "aws" {
    region = "us-east-1"
}

resource "aws_iam_user" "IAMUser" {
    path = "/"
    name = "alexia"
    tags = {}
}

resource "aws_iam_user" "IAMUser2" {
    path = "/"
    name = "dev"
    tags = {
        AKIASEHWLSNI2YQWK5VZ = "app_key"
        Context = "Dev"
    }
}

resource "aws_iam_user" "IAMUser3" {
    path = "/"
    name = "gilberto"
    tags = {}
}

resource "aws_iam_user" "IAMUser4" {
    path = "/"
    name = "fabio"
    tags = {}
}

resource "aws_iam_user" "IAMUser5" {
    path = "/"
    name = "heverton"
    tags = {}
}

resource "aws_iam_user" "IAMUser6" {
    path = "/"
    name = "joelson"
    tags = {}
}

resource "aws_iam_user" "IAMUser7" {
    path = "/"
    name = "kaique"
    tags = {}
}

resource "aws_iam_user" "IAMUser8" {
    path = "/"
    name = "luckviana"
    tags = {}
}

resource "aws_iam_user" "IAMUser9" {
    path = "/"
    name = "mralbani"
    tags = {}
}

resource "aws_iam_user" "IAMUser10" {
    path = "/"
    name = "rafael"
    tags = {}
}

resource "aws_iam_user" "IAMUser11" {
    path = "/"
    name = "tercio"
    tags = {}
}

resource "aws_iam_user" "IAMUser12" {
    path = "/"
    name = "william"
    tags = {}
}

resource "aws_iam_group" "IAMGroup" {
    path = "/"
    name = "PowerUsers"
}

resource "aws_iam_group" "IAMGroup2" {
    path = "/"
    name = "Devs"
}

resource "aws_iam_group" "IAMGroup3" {
    path = "/"
    name = "G2_users"
}

resource "aws_iam_role" "IAMRole" {
    path = "/service-role/"
    name = "Amazon_EventBridge_Scheduler_LAMBDA_8487e93e2e"
    assume_role_policy = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"scheduler.amazonaws.com\"},\"Action\":\"sts:AssumeRole\",\"Condition\":{\"StringEquals\":{\"aws:SourceArn\":\"arn:aws:scheduler:us-east-1:146545546065:schedule/default/cpu-metric\",\"aws:SourceAccount\":\"146545546065\"}}}]}"
    max_session_duration = 3600
    tags = {}
}

resource "aws_iam_role" "IAMRole2" {
    path = "/"
    name = "AmazonSSMRoleForInstancesQuickSetup"
    assume_role_policy = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"ec2.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}"
    max_session_duration = 3600
    tags = {}
}

resource "aws_iam_role" "IAMRole3" {
    path = "/service-role/"
    name = "Amazon_EventBridge_Scheduler_LAMBDA_8a1525404a"
    assume_role_policy = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"scheduler.amazonaws.com\"},\"Action\":\"sts:AssumeRole\",\"Condition\":{\"StringEquals\":{\"aws:SourceArn\":\"arn:aws:scheduler:us-east-1:146545546065:schedule/default/lambda-metric\",\"aws:SourceAccount\":\"146545546065\"}}}]}"
    max_session_duration = 3600
    tags = {}
}

resource "aws_iam_role" "IAMRole4" {
    path = "/service-role/"
    name = "Amazon_EventBridge_Scheduler_LAMBDA_9e960d94d1"
    assume_role_policy = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"scheduler.amazonaws.com\"},\"Action\":\"sts:AssumeRole\",\"Condition\":{\"StringEquals\":{\"aws:SourceArn\":\"arn:aws:scheduler:us-east-1:146545546065:schedule/default/ec2-metric\",\"aws:SourceAccount\":\"146545546065\"}}}]}"
    max_session_duration = 3600
    tags = {}
}

resource "aws_iam_role" "IAMRole5" {
    path = "/service-role/"
    name = "agent_lambda-role-ans62qfz"
    assume_role_policy = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"lambda.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}"
    max_session_duration = 3600
    tags = {}
}

resource "aws_iam_role" "IAMRole6" {
    path = "/"
    name = "AWS-QuickSetup-StackSet-Local-AdministrationRole"
    assume_role_policy = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"cloudformation.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}"
    max_session_duration = 3600
    tags = {}
}

resource "aws_iam_role" "IAMRole7" {
    path = "/service-role/"
    name = "AWSFISIAMRole-1678588725585"
    assume_role_policy = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"fis.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}"
    max_session_duration = 3600
    tags = {}
}

resource "aws_iam_role" "IAMRole8" {
    path = "/"
    name = "AWS-QuickSetup-StackSet-Local-ExecutionRole"
    assume_role_policy = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"AWS\":\"arn:aws:iam::146545546065:role/AWS-QuickSetup-StackSet-Local-AdministrationRole\"},\"Action\":\"sts:AssumeRole\"}]}"
    max_session_duration = 3600
    tags = {}
}

resource "aws_iam_role" "IAMRole9" {
    path = "/"
    name = "rds-monitoring-role"
    assume_role_policy = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Sid\":\"\",\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"monitoring.rds.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}"
    max_session_duration = 3600
    tags = {}
}

resource "aws_iam_service_linked_role" "IAMServiceLinkedRole" {
    aws_service_name = "ssm.amazonaws.com"
    description = "Provides access to AWS Resources managed or used by Amazon SSM."
}

resource "aws_iam_service_linked_role" "IAMServiceLinkedRole2" {
    aws_service_name = "autoscaling.amazonaws.com"
    description = "Default Service-Linked Role enables access to AWS Services and Resources used or managed by Auto Scaling"
}

resource "aws_iam_service_linked_role" "IAMServiceLinkedRole3" {
    aws_service_name = "events.amazonaws.com"
}

resource "aws_iam_service_linked_role" "IAMServiceLinkedRole4" {
    aws_service_name = "elasticloadbalancing.amazonaws.com"
    description = "Allows ELB to call AWS services on your behalf."
}

resource "aws_iam_service_linked_role" "IAMServiceLinkedRole5" {
    aws_service_name = "fis.amazonaws.com"
    description = "Role to enable AWS FIS to manage monitoring and resource selection for experiments."
}

resource "aws_iam_service_linked_role" "IAMServiceLinkedRole6" {
    aws_service_name = "globalaccelerator.amazonaws.com"
    description = "Allows Global Accelerator to call AWS services on customer's behalf"
}

resource "aws_iam_service_linked_role" "IAMServiceLinkedRole7" {
    aws_service_name = "rds.amazonaws.com"
    description = "Allows Amazon RDS to manage AWS resources on your behalf"
}

resource "aws_iam_policy" "IAMManagedPolicy" {
    name = "Amazon-EventBridge-Scheduler-Execution-Policy-9cd8c603-0d7b-4bbb-b872-cff0c614745f"
    path = "/service-role/"
    policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": [
                "lambda:InvokeFunction"
            ],
            "Resource": [
                "arn:aws:lambda:us-east-1:146545546065:function:agent_lambda:*",
                "arn:aws:lambda:us-east-1:146545546065:function:agent_lambda"
            ]
        }
    ]
}
EOF
}

resource "aws_iam_policy" "IAMManagedPolicy2" {
    name = "FIS-Console-EC2-1678588725585"
    path = "/service-role/"
    policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "AllowFISExperimentRoleEC2Actions",
            "Effect": "Allow",
            "Action": [
                "ec2:RebootInstances",
                "ec2:StopInstances",
                "ec2:StartInstances",
                "ec2:TerminateInstances"
            ],
            "Resource": "arn:aws:ec2:us-east-1:146545546065:instance/*"
        },
        {
            "Sid": "AllowFISExperimentRoleSpotInstanceActions",
            "Effect": "Allow",
            "Action": [
                "ec2:SendSpotInstanceInterruptions"
            ],
            "Resource": "arn:aws:ec2:us-east-1:146545546065:instance/*"
        }
    ]
}
EOF
}

resource "aws_iam_policy" "IAMManagedPolicy3" {
    name = "Amazon-EventBridge-Scheduler-Execution-Policy-e96abe94-f21a-456d-b2c8-43b0c98a255a"
    path = "/service-role/"
    policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": [
                "lambda:InvokeFunction"
            ],
            "Resource": [
                "arn:aws:lambda:us-east-1:146545546065:function:agent_lambda:*",
                "arn:aws:lambda:us-east-1:146545546065:function:agent_lambda"
            ]
        }
    ]
}
EOF
}

resource "aws_iam_policy" "IAMManagedPolicy4" {
    name = "AWSLambdaBasicExecutionRole-b282d291-1e12-4fa6-b407-4113e11dda22"
    path = "/service-role/"
    policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": "logs:CreateLogGroup",
            "Resource": "arn:aws:logs:us-east-1:146545546065:*"
        },
        {
            "Effect": "Allow",
            "Action": [
                "logs:CreateLogStream",
                "logs:PutLogEvents"
            ],
            "Resource": [
                "arn:aws:logs:us-east-1:146545546065:log-group:/aws/lambda/agent_lambda:*"
            ]
        }
    ]
}
EOF
}

resource "aws_iam_policy" "IAMManagedPolicy5" {
    name = "AWSLambdaVPCAccessExecutionRole-58038e2d-825d-40a7-b171-067bd4448301"
    path = "/service-role/"
    policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": [
                "ec2:CreateNetworkInterface",
                "ec2:DeleteNetworkInterface",
                "ec2:DescribeNetworkInterfaces"
            ],
            "Resource": "*"
        }
    ]
}
EOF
}

resource "aws_iam_policy" "IAMManagedPolicy6" {
    name = "Amazon-EventBridge-Scheduler-Execution-Policy-968fbaf2-f17c-4517-93b4-2871876c3fb4"
    path = "/service-role/"
    policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": [
                "lambda:InvokeFunction"
            ],
            "Resource": [
                "arn:aws:lambda:us-east-1:146545546065:function:agent_lambda:*",
                "arn:aws:lambda:us-east-1:146545546065:function:agent_lambda"
            ]
        }
    ]
}
EOF
}

resource "aws_iam_policy" "IAMManagedPolicy7" {
    name = "Amazon-EventBridge-Scheduler-Execution-Policy-4db9d3d5-71f8-4ab4-87f7-f0c7cf16dc9b"
    path = "/service-role/"
    policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": [
                "lambda:InvokeFunction"
            ],
            "Resource": [
                "arn:aws:lambda:us-east-1:146545546065:function:agent_lambda:*",
                "arn:aws:lambda:us-east-1:146545546065:function:agent_lambda"
            ]
        }
    ]
}
EOF
}

resource "aws_iam_group_policy" "IAMPolicy" {
    policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "VisualEditor0",
            "Effect": "Allow",
            "Action": [
                "logs:GetDataProtectionPolicy",
                "servicecatalog:SearchProducts",
                "iam:List*",
                "ds:DescribeSnapshots",
                "servicecatalog:DescribeProvisioningParameters",
                "sqs:ReceiveMessage",
                "cloudtrail:GetTrailStatus",
                "kinesis:Get*",
                "iam:GenerateServiceLastAccessedDetails",
                "logs:StartQuery",
                "config:DescribeDeliveryChannels",
                "servicecatalog:DescribeProductView",
                "cloudfront:Get*",
                "firehose:Describe*",
                "cloudwatch:Describe*",
                "s3:List*",
                "logs:ListLogDeliveries",
                "storagegateway:List*",
                "route53domains:CheckDomainAvailability",
                "rds:Describe*",
                "route53:Get*",
                "acm:GetCertificate",
                "config:DescribeConfigRules",
                "logs:FilterLogEvents",
                "route53domains:List*",
                "inspector:Describe*",
                "acm:List*",
                "cloudfront:List*",
                "glacier:List*",
                "cloudtrail:LookupEvents",
                "events:DescribeRule",
                "s3:GetBucketWebsite",
                "dms:Describe*",
                "lambda:List*",
                "ec2:DescribeIdFormat",
                "s3:GetMultiRegionAccessPoint",
                "s3:GetObjectAttributes",
                "kms:Describe*",
                "logs:Unmask",
                "s3:GetObjectLegalHold",
                "s3:GetBucketNotification",
                "logs:ListTagsForResource",
                "events:TestEventPattern",
                "s3:DescribeMultiRegionAccessPointOperation",
                "s3:GetReplicationConfiguration",
                "acm-pca:ListCertificateAuthorities",
                "cloudtrail:DescribeTrails",
                "config:DescribeConfigurationRecorders",
                "ec2:SearchLocalGatewayRoutes",
                "cognito-identity:Describe*",
                "waf:List*",
                "ssm:List*",
                "ec2:DescribeReservedInstancesModifications",
                "events:List*",
                "glacier:ListVaults",
                "s3:GetStorageLensDashboard",
                "logs:ListTagsLogGroup",
                "iam:GenerateCredentialReport",
                "kinesis:Describe*",
                "s3:GetLifecycleConfiguration",
                "s3:GetInventoryConfiguration",
                "s3:GetBucketTagging",
                "ds:GetSnapshotLimits",
                "dynamodb:ListTables",
                "glacier:DescribeVault",
                "s3:GetAccessPointPolicyForObjectLambda",
                "cognito-identity:List*",
                "route53domains:GetDomainDetail",
                "ecr:ListImages",
                "glacier:DescribeJob",
                "importexport:ListJobs",
                "cloudformation:EstimateTemplateCost",
                "iam:Get*",
                "dynamodb:DescribeLimits",
                "s3:GetMultiRegionAccessPointPolicyStatus",
                "aws-marketplace:ViewSubscriptions",
                "config:DescribeConfigRuleEvaluationStatus",
                "ecs:Describe*",
                "ec2:DescribeIdentityIdFormat",
                "logs:TestMetricFilter",
                "config:GetResourceConfigHistory",
                "s3:GetBucketVersioning",
                "s3:GetAccessPointConfigurationForObjectLambda",
                "cloudformation:Describe*",
                "ec2:Describe*",
                "s3:GetMultiRegionAccessPointRoutes",
                "s3:GetStorageLensConfiguration",
                "directconnect:Describe*",
                "s3:GetAccountPublicAccessBlock",
                "cognito-identity:LookupDeveloperIdentity",
                "rds:ListTagsForResource",
                "cloudtrail:ListPublicKeys",
                "s3:GetBucketCORS",
                "logs:GetLogGroupFields",
                "s3:GetObjectVersion",
                "cloudformation:Get*",
                "logs:GetLogRecord",
                "ds:ListAuthorizedApplications",
                "kms:List*",
                "discovery:ListConfigurations",
                "logs:Describe*",
                "s3:GetObjectVersionTagging",
                "kms:Get*",
                "ses:List*",
                "servicecatalog:DescribeRecord",
                "firehose:List*",
                "s3:GetStorageLensConfigurationTagging",
                "discovery:Describe*",
                "s3:GetObjectAcl",
                "s3:GetBucketObjectLockConfiguration",
                "s3:GetIntelligentTieringConfiguration",
                "dynamodb:DescribeTable",
                "cloudtrail:ListTags",
                "logs:GetLogEvents",
                "s3:GetObjectVersionAcl",
                "route53:List*",
                "elasticloadbalancing:Describe*",
                "cloudformation:List*",
                "ecr:BatchCheckLayerAvailability",
                "servicecatalog:ScanProvisionedProducts",
                "s3:GetBucketPolicyStatus",
                "ses:Get*",
                "sqs:GetQueueUrl",
                "s3:GetObjectRetention",
                "elasticfilesystem:Describe*",
                "s3:GetJobTagging",
                "config:DescribeDeliveryChannelStatus",
                "opsworks:Describe*",
                "sqs:GetQueueAttributes",
                "logs:StopQuery",
                "importexport:GetStatus",
                "route53domains:GetOperationDetail",
                "s3:GetObject",
                "logs:GetQueryResults",
                "acm:DescribeCertificate",
                "s3:DescribeJob",
                "s3:GetAnalyticsConfiguration",
                "s3:GetObjectVersionForReplication",
                "s3:GetAccessPointForObjectLambda",
                "autoscaling:Describe*",
                "s3:GetAccessPoint",
                "ec2:DescribeInstanceAttribute",
                "s3:GetBucketLogging",
                "storagegateway:Describe*",
                "s3:GetAccelerateConfiguration",
                "logs:GetLogDelivery",
                "s3:GetObjectVersionAttributes",
                "s3:GetBucketPolicy",
                "config:ListDiscoveredResources",
                "s3:GetEncryptionConfiguration",
                "s3:GetObjectVersionTorrent",
                "glacier:Get*",
                "sns:Get*",
                "s3:GetBucketRequestPayment",
                "servicecatalog:DescribeProduct",
                "s3:GetAccessPointPolicyStatus",
                "s3:GetObjectTagging",
                "ecr:DescribeRepositories",
                "s3:GetMetricsConfiguration",
                "s3:GetBucketOwnershipControls",
                "cloudwatch:Get*",
                "waf:Get*",
                "elasticfilesystem:DescribeFileSystems",
                "dms:List*",
                "ecs:List*",
                "acm-pca:DescribeCertificateAuthority",
                "s3:GetBucketPublicAccessBlock",
                "servicecatalog:ListLaunchPaths",
                "sqs:ListQueues",
                "s3:GetMultiRegionAccessPointPolicy",
                "kinesis:List*",
                "s3:GetAccessPointPolicyStatusForObjectLambda",
                "ec2:DescribeTags",
                "cloudwatch:List*",
                "lambda:Get*",
                "ec2:DescribeNatGateways",
                "inspector:List*",
                "s3:GetBucketAcl",
                "ds:GetDirectoryLimits",
                "config:DescribeConfigurationRecorderStatus",
                "support:*",
                "sns:List*",
                "ec2:DescribeHosts",
                "s3:GetObjectTorrent",
                "ssm:Describe*",
                "servicecatalog:ListRecordHistory",
                "ds:DescribeDirectories",
                "s3:GetBucketLocation",
                "s3:GetAccessPointPolicy",
                "ecr:GetRepositoryPolicy"
            ],
            "Resource": "*"
        }
    ]
}
EOF
    group = "G2_users"
}

resource "aws_iam_role_policy" "IAMPolicy2" {
    policy = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Action\":[\"sts:AssumeRole\"],\"Resource\":[\"arn:*:iam::*:role/AWS-QuickSetup-StackSet-Local-ExecutionRole\"],\"Effect\":\"Allow\"}]}"
    role = "${aws_iam_role.IAMRole6.name}"
}

resource "aws_iam_user_policy" "IAMPolicy3" {
    policy = <<EOF
{
    "Version":"2012-10-17",
    "Statement":[
        {
          "Action":[
              "cloudwatch:Describe*",
              "cloudwatch:Get*",
              "cloudwatch:List*",
              "rds:Describe*"
          ],
          "Effect":"Allow",
          "Resource":"*"
        }
    ]
  }
EOF
    user = "dev"
}

resource "aws_iam_instance_profile" "IAMInstanceProfile" {
    path = "/"
    name = "${aws_iam_role.IAMRole2.name}"
    roles = [
        "${aws_iam_role.IAMRole2.name}"
    ]
}

resource "aws_iam_access_key" "IAMAccessKey" {
    status = "Active"
    user = "dev"
}

resource "aws_vpc" "EC2VPC" {
    cidr_block = "${aws_vpc.EC2VPC2.cidr_block}"
    enable_dns_support = true
    enable_dns_hostnames = true
    instance_tenancy = "default"
    tags = {
        Name = "vpc_curso"
    }
}

resource "aws_vpc" "EC2VPC2" {
    cidr_block = "10.0.0.0/16"
    enable_dns_support = true
    enable_dns_hostnames = false
    instance_tenancy = "default"
    tags = {
        Name = "G2C-VPC"
    }
}

resource "aws_vpc" "EC2VPC3" {
    cidr_block = "172.31.0.0/16"
    enable_dns_support = true
    enable_dns_hostnames = true
    instance_tenancy = "default"
    tags = {}
}

resource "aws_vpc_ipv4_cidr_block_association" "EC2VPCCidrBlock" {
    vpc_id = "${aws_vpc.EC2VPC.id}"
}

resource "aws_subnet" "EC2Subnet" {
    availability_zone = "us-east-1a"
    cidr_block = "10.0.3.0/24"
    vpc_id = "${aws_vpc.EC2VPC.id}"
    map_public_ip_on_launch = false
}

resource "aws_subnet" "EC2Subnet2" {
    availability_zone = "us-east-1b"
    cidr_block = "10.0.3.0/24"
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    map_public_ip_on_launch = false
}

resource "aws_subnet" "EC2Subnet3" {
    availability_zone = "us-east-1d"
    cidr_block = "172.31.80.0/20"
    vpc_id = "${aws_vpc.EC2VPC3.id}"
    map_public_ip_on_launch = true
}

resource "aws_subnet" "EC2Subnet4" {
    availability_zone = "us-east-1b"
    cidr_block = "172.31.32.0/20"
    vpc_id = "${aws_vpc.EC2VPC3.id}"
    map_public_ip_on_launch = true
}

resource "aws_subnet" "EC2Subnet5" {
    availability_zone = "us-east-1a"
    cidr_block = "172.31.16.0/20"
    vpc_id = "${aws_vpc.EC2VPC3.id}"
    map_public_ip_on_launch = true
}

resource "aws_subnet" "EC2Subnet6" {
    availability_zone = "us-east-1a"
    cidr_block = "10.0.1.0/24"
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    map_public_ip_on_launch = false
}

resource "aws_subnet" "EC2Subnet7" {
    availability_zone = "us-east-1b"
    cidr_block = "10.0.4.0/24"
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    map_public_ip_on_launch = false
}

resource "aws_subnet" "EC2Subnet8" {
    availability_zone = "us-east-1e"
    cidr_block = "172.31.48.0/20"
    vpc_id = "${aws_vpc.EC2VPC3.id}"
    map_public_ip_on_launch = true
}

resource "aws_subnet" "EC2Subnet9" {
    availability_zone = "us-east-1f"
    cidr_block = "172.31.64.0/20"
    vpc_id = "${aws_vpc.EC2VPC3.id}"
    map_public_ip_on_launch = true
}

resource "aws_subnet" "EC2Subnet10" {
    availability_zone = "us-east-1b"
    cidr_block = "10.0.4.0/24"
    vpc_id = "${aws_vpc.EC2VPC.id}"
    map_public_ip_on_launch = false
}

resource "aws_subnet" "EC2Subnet11" {
    availability_zone = "us-east-1b"
    cidr_block = "10.0.2.0/24"
    vpc_id = "${aws_vpc.EC2VPC.id}"
    map_public_ip_on_launch = true
}

resource "aws_subnet" "EC2Subnet12" {
    availability_zone = "us-east-1c"
    cidr_block = "172.31.0.0/20"
    vpc_id = "${aws_vpc.EC2VPC3.id}"
    map_public_ip_on_launch = true
}

resource "aws_subnet" "EC2Subnet13" {
    availability_zone = "us-east-1a"
    cidr_block = "10.0.2.0/24"
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    map_public_ip_on_launch = false
}

resource "aws_subnet" "EC2Subnet14" {
    availability_zone = "us-east-1a"
    cidr_block = "10.0.1.0/24"
    vpc_id = "${aws_vpc.EC2VPC.id}"
    map_public_ip_on_launch = true
}

resource "aws_internet_gateway" "EC2InternetGateway" {
    tags = {
        Name = "gtw01"
    }
    vpc_id = "${aws_vpc.EC2VPC.id}"
}

resource "aws_internet_gateway" "EC2InternetGateway2" {
    tags = {
        Name = "G2C-IGW"
    }
    vpc_id = "${aws_vpc.EC2VPC2.id}"
}

resource "aws_internet_gateway" "EC2InternetGateway3" {
    tags = {}
    vpc_id = "${aws_vpc.EC2VPC3.id}"
}

resource "aws_eip" "EC2EIP" {
    vpc = true
    instance = "i-09e33ce04e84e7208"
}

resource "aws_eip_association" "EC2EIPAssociation" {
    allocation_id = "eipalloc-0929f97962f1f58cc"
    instance_id = "i-09e33ce04e84e7208"
    network_interface_id = "eni-0862a262bea3dc072"
    private_ip_address = "10.0.1.74"
}

resource "aws_eip" "EC2EIP2" {
    vpc = true
    instance = "i-019ff13bcc11ef2a8"
}

resource "aws_eip_association" "EC2EIPAssociation2" {
    allocation_id = "eipalloc-002643fdc99343333"
    instance_id = "i-019ff13bcc11ef2a8"
    network_interface_id = "eni-0588b1ac1c0cef402"
    private_ip_address = "10.0.3.4"
}

resource "aws_vpc_dhcp_options" "EC2DHCPOptions" {
    domain_name = "ec2.internal"
    tags = {}
}

resource "aws_vpc_dhcp_options_association" "EC2VPCDHCPOptionsAssociation" {
    dhcp_options_id = "dopt-094abe976d4b098e9"
    vpc_id = "${aws_vpc.EC2VPC.id}"
}

resource "aws_vpc_dhcp_options_association" "EC2VPCDHCPOptionsAssociation2" {
    dhcp_options_id = "dopt-094abe976d4b098e9"
    vpc_id = "${aws_vpc.EC2VPC2.id}"
}

resource "aws_vpc_dhcp_options_association" "EC2VPCDHCPOptionsAssociation3" {
    dhcp_options_id = "dopt-094abe976d4b098e9"
    vpc_id = "${aws_vpc.EC2VPC3.id}"
}

resource "aws_network_acl" "EC2NetworkAcl" {
    vpc_id = "${aws_vpc.EC2VPC3.id}"
    tags = {}
}

resource "aws_network_acl" "EC2NetworkAcl2" {
    vpc_id = "${aws_vpc.EC2VPC.id}"
    tags = {
        Name = "aclpublic"
    }
}

resource "aws_network_acl" "EC2NetworkAcl3" {
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    tags = {
        Name = "G2C-ACL-subnets"
    }
}

resource "aws_network_acl" "EC2NetworkAcl4" {
    vpc_id = "${aws_vpc.EC2VPC.id}"
    tags = {
        Name = "aclprivate"
    }
}

resource "aws_network_acl" "EC2NetworkAcl5" {
    vpc_id = "${aws_vpc.EC2VPC.id}"
    tags = {}
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry" {
    cidr_block = "0.0.0.0/0"
    egress = true
    network_acl_id = "acl-0ad7e7139b1f12dbc"
    protocol = -1
    rule_action = "allow"
    rule_number = 100
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry2" {
    cidr_block = "0.0.0.0/0"
    egress = false
    network_acl_id = "acl-0ad7e7139b1f12dbc"
    protocol = -1
    rule_action = "allow"
    rule_number = 100
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry3" {
    cidr_block = "0.0.0.0/0"
    egress = true
    network_acl_id = "acl-0289234a8f404e66f"
    protocol = -1
    rule_action = "allow"
    rule_number = 1
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry4" {
    cidr_block = "0.0.0.0/0"
    egress = false
    network_acl_id = "acl-0289234a8f404e66f"
    protocol = -1
    rule_action = "allow"
    rule_number = 1
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry5" {
    cidr_block = "0.0.0.0/0"
    egress = true
    network_acl_id = "acl-017d5474cecba3840"
    protocol = -1
    rule_action = "allow"
    rule_number = 100
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry6" {
    cidr_block = "0.0.0.0/0"
    egress = false
    network_acl_id = "acl-017d5474cecba3840"
    protocol = -1
    rule_action = "allow"
    rule_number = 100
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry7" {
    cidr_block = "0.0.0.0/0"
    egress = true
    network_acl_id = "acl-0257c8b12ae0038ca"
    protocol = -1
    rule_action = "allow"
    rule_number = 1
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry8" {
    cidr_block = "0.0.0.0/0"
    egress = false
    network_acl_id = "acl-0257c8b12ae0038ca"
    protocol = -1
    rule_action = "allow"
    rule_number = 1
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry9" {
    cidr_block = "0.0.0.0/0"
    egress = true
    network_acl_id = "acl-01e9566d828388538"
    protocol = -1
    rule_action = "allow"
    rule_number = 100
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry10" {
    egress = true
    ipv6_cidr_block = "::/0"
    network_acl_id = "acl-01e9566d828388538"
    protocol = -1
    rule_action = "allow"
    rule_number = 101
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry11" {
    cidr_block = "0.0.0.0/0"
    egress = false
    network_acl_id = "acl-01e9566d828388538"
    protocol = -1
    rule_action = "allow"
    rule_number = 100
}

resource "aws_network_acl_rule" "EC2NetworkAclEntry12" {
    egress = false
    ipv6_cidr_block = "::/0"
    network_acl_id = "acl-01e9566d828388538"
    protocol = -1
    rule_action = "allow"
    rule_number = 101
}

resource "aws_route_table" "EC2RouteTable" {
    vpc_id = "${aws_vpc.EC2VPC3.id}"
    tags = {}
}

resource "aws_route_table" "EC2RouteTable2" {
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    tags = {}
}

resource "aws_route_table" "EC2RouteTable3" {
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    tags = {
        Name = "G2C-RTPrivada"
    }
}

resource "aws_route_table" "EC2RouteTable4" {
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    tags = {
        Name = "G2C-RTPublica"
    }
}

resource "aws_route_table" "EC2RouteTable5" {
    vpc_id = "${aws_vpc.EC2VPC.id}"
    tags = {
        Name = "priv01"
    }
}

resource "aws_route_table" "EC2RouteTable6" {
    vpc_id = "${aws_vpc.EC2VPC.id}"
    tags = {
        Name = "pub01"
    }
}

resource "aws_route" "EC2Route" {
    destination_cidr_block = "0.0.0.0/0"
    gateway_id = "igw-0ceb5b2722cbaeb5b"
    route_table_id = "rtb-02f16841377c25635"
}

resource "aws_route" "EC2Route2" {
    destination_cidr_block = "0.0.0.0/0"
    gateway_id = "igw-0532042b152d660dd"
    route_table_id = "rtb-0ba6419b86d193226"
}

resource "aws_route" "EC2Route3" {
    destination_cidr_block = "0.0.0.0/0"
    gateway_id = "igw-04b2a46a1302cd511"
    route_table_id = "rtb-0428bdb642859fbe7"
}

resource "aws_route" "EC2Route4" {
    destination_ipv6_cidr_block = "::/0"
    gateway_id = "igw-04b2a46a1302cd511"
    route_table_id = "rtb-0428bdb642859fbe7"
}

resource "aws_route_table_association" "EC2SubnetRouteTableAssociation" {
    route_table_id = "rtb-0db61ddb30d79bb09"
    subnet_id = "subnet-02364f97174baa722"
}

resource "aws_route_table_association" "EC2SubnetRouteTableAssociation2" {
    route_table_id = "rtb-0db61ddb30d79bb09"
    subnet_id = "subnet-00aff1957f73f4f72"
}

resource "aws_route_table_association" "EC2SubnetRouteTableAssociation3" {
    route_table_id = "rtb-0ba6419b86d193226"
    subnet_id = "subnet-03a4b89611ab38f6d"
}

resource "aws_route_table_association" "EC2SubnetRouteTableAssociation4" {
    route_table_id = "rtb-0ba6419b86d193226"
    subnet_id = "subnet-0db767b7c74d52a66"
}

resource "aws_route_table_association" "EC2SubnetRouteTableAssociation5" {
    route_table_id = "rtb-0cc58224da4ecaf1c"
    subnet_id = "subnet-06706ce6b63c93e38"
}

resource "aws_route_table_association" "EC2SubnetRouteTableAssociation6" {
    route_table_id = "rtb-0cc58224da4ecaf1c"
    subnet_id = "subnet-075392cd28a412bd0"
}

resource "aws_route_table_association" "EC2SubnetRouteTableAssociation7" {
    route_table_id = "rtb-0428bdb642859fbe7"
    subnet_id = "subnet-032e0ad7517413be8"
}

resource "aws_route_table_association" "EC2SubnetRouteTableAssociation8" {
    route_table_id = "rtb-0428bdb642859fbe7"
    subnet_id = "subnet-0a1cc57d89bf7813f"
}

resource "aws_route53_zone" "Route53HostedZone" {
    name = "g2c-monitor.click."
}

resource "aws_route53_record" "Route53RecordSet" {
    name = "g2c-monitor.click."
    type = "A"
    alias {
        name = "dualstack.g2c-zabbixapplication-169160081.us-east-1.elb.amazonaws.com."
        zone_id = "Z35SXDOTRQ7X7K"
        evaluate_target_health = false
    }
    zone_id = "Z02387991Q073BNH2E0VX"
}

resource "aws_route53_record" "Route53RecordSet2" {
    name = "g2c-monitor.click."
    type = "NS"
    ttl = 172800
    records = [
        "ns-1083.awsdns-07.org.",
        "ns-962.awsdns-56.net.",
        "ns-1732.awsdns-24.co.uk.",
        "ns-242.awsdns-30.com."
    ]
    zone_id = "Z02387991Q073BNH2E0VX"
}

resource "aws_route53_record" "Route53RecordSet3" {
    name = "g2c-monitor.click."
    type = "SOA"
    ttl = 900
    records = [
        "ns-1083.awsdns-07.org. awsdns-hostmaster.amazon.com. 1 7200 900 1209600 86400"
    ]
    zone_id = "Z02387991Q073BNH2E0VX"
}

resource "aws_route53_record" "Route53RecordSet4" {
    name = "_8a864037c38aa05eb272bcfe851700de.g2c-monitor.click."
    type = "CNAME"
    ttl = 300
    records = [
        "_9695dfaa379fb31205e33cde5441429f.ghcgkbmxjw.acm-validations.aws."
    ]
    zone_id = "Z02387991Q073BNH2E0VX"
}

resource "aws_route53_record" "Route53RecordSet5" {
    name = "s3.g2c-monitor.click."
    type = "CNAME"
    ttl = 300
    records = [
        "http://bruno.eadcloud.com.s3-website-us-east-1.amazonaws.com"
    ]
    zone_id = "Z02387991Q073BNH2E0VX"
}

resource "aws_instance" "EC2Instance" {
    ami = "ami-0557a15b87f6559cf"
    instance_type = "t2.micro"
    key_name = "G2C-Keypair"
    availability_zone = "us-east-1a"
    tenancy = "default"
    subnet_id = "subnet-0db767b7c74d52a66"
    ebs_optimized = false
    vpc_security_group_ids = [
        "${aws_security_group.EC2SecurityGroup3.id}",
        "${aws_security_group.EC2SecurityGroup6.id}"
    ]
    source_dest_check = true
    root_block_device {
        volume_size = 8
        volume_type = "gp2"
        delete_on_termination = true
    }
    iam_instance_profile = "${aws_iam_role.IAMRole2.name}"
    tags = {
        Name = "G2C-Zabbix-1"
    }
}

resource "aws_instance" "EC2Instance2" {
    ami = "ami-0557a15b87f6559cf"
    instance_type = "t2.micro"
    key_name = "G2C-Keypair"
    availability_zone = "us-east-1b"
    tenancy = "default"
    subnet_id = "subnet-03a4b89611ab38f6d"
    ebs_optimized = false
    vpc_security_group_ids = [
        "${aws_security_group.EC2SecurityGroup3.id}",
        "${aws_security_group.EC2SecurityGroup6.id}"
    ]
    source_dest_check = true
    root_block_device {
        volume_size = 8
        volume_type = "gp2"
        delete_on_termination = true
    }
    iam_instance_profile = "${aws_iam_role.IAMRole2.name}"
    tags = {
        Name = "G2C-Zabbix-2"
    }
}

resource "aws_lb" "ElasticLoadBalancingV2LoadBalancer" {
    name = "G2C-ZabbixNetwork"
    internal = false
    load_balancer_type = "network"
    subnets = [
        "subnet-03a4b89611ab38f6d",
        "subnet-0db767b7c74d52a66"
    ]
    ip_address_type = "ipv4"
    access_logs {
        prefix = ""
        enabled = false
        bucket = ""
    }
    enable_deletion_protection = "false"
    enable_cross_zone_load_balancing = "false"
}

resource "aws_lb" "ElasticLoadBalancingV2LoadBalancer2" {
    name = "G2C-ZabbixApplication"
    internal = false
    load_balancer_type = "application"
    subnets = [
        "subnet-03a4b89611ab38f6d",
        "subnet-0db767b7c74d52a66"
    ]
    security_groups = [
        "${aws_security_group.EC2SecurityGroup3.id}"
    ]
    ip_address_type = "ipv4"
    access_logs {
        enabled = false
        bucket = ""
        prefix = ""
    }
    idle_timeout = "2"
    enable_deletion_protection = "true"
    enable_http2 = "true"
    enable_cross_zone_load_balancing = "true"
}

resource "aws_lb_listener" "ElasticLoadBalancingV2Listener" {
    load_balancer_arn = "arn:aws:elasticloadbalancing:us-east-1:146545546065:loadbalancer/net/G2C-ZabbixNetwork/36342b03712a720b"
    port = 20051
    protocol = "TCP"
    default_action {
        target_group_arn = "arn:aws:elasticloadbalancing:us-east-1:146545546065:targetgroup/G2C-ZabbixNetwork/40ed417ebe0bcaac"
        type = "forward"
    }
}

resource "aws_lb_listener" "ElasticLoadBalancingV2Listener2" {
    load_balancer_arn = "arn:aws:elasticloadbalancing:us-east-1:146545546065:loadbalancer/net/G2C-ZabbixNetwork/36342b03712a720b"
    port = 20050
    protocol = "TCP"
    default_action {
        target_group_arn = "arn:aws:elasticloadbalancing:us-east-1:146545546065:targetgroup/G2C-ZabbixNetwork/40ed417ebe0bcaac"
        type = "forward"
    }
}

resource "aws_lb_listener" "ElasticLoadBalancingV2Listener3" {
    load_balancer_arn = "arn:aws:elasticloadbalancing:us-east-1:146545546065:loadbalancer/app/G2C-ZabbixApplication/7ab6443ed5300cd4"
    port = 443
    protocol = "HTTPS"
    ssl_policy = "ELBSecurityPolicy-2016-08"
    certificate_arn = "arn:aws:acm:us-east-1:146545546065:certificate/ce62be10-4b77-4b70-9a05-c49113c3c08a"
    default_action {
        target_group_arn = "arn:aws:elasticloadbalancing:us-east-1:146545546065:targetgroup/G2C-ZabbixApplication/2ed661e5d03b8114"
        type = "forward"
    }
}

resource "aws_lb_listener" "ElasticLoadBalancingV2Listener4" {
    load_balancer_arn = "arn:aws:elasticloadbalancing:us-east-1:146545546065:loadbalancer/app/G2C-ZabbixApplication/7ab6443ed5300cd4"
    port = 80
    protocol = "HTTP"
    default_action {
        redirect {
            host = "#{host}"
            path = "/#{path}"
            port = "443"
            protocol = "HTTPS"
            query = "#{query}"
            status_code = "HTTP_301"
        }
        type = "redirect"
    }
}

resource "aws_lb_listener_rule" "ElasticLoadBalancingV2ListenerRule" {
    priority = "2"
    listener_arn = "arn:aws:elasticloadbalancing:us-east-1:146545546065:listener/app/G2C-ZabbixApplication/7ab6443ed5300cd4/56e37293a555d9c9"
    condition {
        field = "path-pattern"
        values = [
            "/"
        ]
    }
}

resource "aws_security_group" "EC2SecurityGroup" {
    description = "curso"
    name = "MySecGroup"
    tags = {
        Name = "IGNORE"
    }
    vpc_id = "${aws_vpc.EC2VPC.id}"
    ingress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        from_port = 80
        protocol = "tcp"
        to_port = 80
    }
    ingress {
        ipv6_cidr_blocks = [
            "::/0"
        ]
        from_port = 80
        protocol = "tcp"
        to_port = 80
    }
    ingress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        from_port = 0
        protocol = "tcp"
        to_port = 65535
    }
    ingress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        from_port = 22
        protocol = "tcp"
        to_port = 22
    }
    ingress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        from_port = -1
        protocol = "icmp"
        to_port = -1
    }
    ingress {
        security_groups = [
            "sg-04f28d2b8a852cd80"
        ]
        from_port = 3389
        protocol = "tcp"
        to_port = 3389
    }
    ingress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        from_port = 443
        protocol = "tcp"
        to_port = 443
    }
    ingress {
        ipv6_cidr_blocks = [
            "::/0"
        ]
        from_port = 443
        protocol = "tcp"
        to_port = 443
    }
    egress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        from_port = 0
        protocol = "-1"
        to_port = 0
    }
    egress {
        ipv6_cidr_blocks = [
            "::/0"
        ]
        from_port = 0
        protocol = "-1"
        to_port = 0
    }
}

resource "aws_security_group" "EC2SecurityGroup2" {
    description = "Security group attached to default to allow EC2 instances with specific security groups attached to connect to the database. Modification could lead to connection loss."
    name = "rds-ec2-1"
    tags = {
        Name = "IGNORE"
    }
    vpc_id = "${aws_vpc.EC2VPC.id}"
    ingress {
        security_groups = [
            "${aws_security_group.EC2SecurityGroup4.id}"
        ]
        description = "Rule to allow connections from EC2 instances with sg-08dab4b2af1908a4a attached"
        from_port = 3306
        protocol = "tcp"
        to_port = 3306
    }
}

resource "aws_security_group" "EC2SecurityGroup3" {
    description = "Acesso ao Zabbix"
    name = "G2C-SG-EC2"
    tags = {
        Name = "G2C-SG-EC2"
    }
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    ingress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        description = "Acesso HTTP"
        from_port = 80
        protocol = "tcp"
        to_port = 80
    }
    ingress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        description = "Acesso remoto via SSH"
        from_port = 22
        protocol = "tcp"
        to_port = 22
    }
    ingress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        description = "Portas efemeras"
        from_port = 10050
        protocol = "tcp"
        to_port = 10051
    }
    ingress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        description = "Acesso HTTPS"
        from_port = 443
        protocol = "tcp"
        to_port = 443
    }
    egress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        description = "Acesso HTTP"
        from_port = 80
        protocol = "tcp"
        to_port = 80
    }
    egress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        description = "Acesso remoto via SSH"
        from_port = 22
        protocol = "tcp"
        to_port = 22
    }
    egress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        description = "Portas efemeras"
        from_port = 10050
        protocol = "tcp"
        to_port = 10051
    }
    egress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        description = "Acesso HTTP"
        from_port = 443
        protocol = "tcp"
        to_port = 443
    }
}

resource "aws_security_group" "EC2SecurityGroup4" {
    description = "Security group attached to instances to securely connect to default. Modification could lead to connection loss."
    name = "ec2-rds-1"
    tags = {
        Name = "IGNORE"
    }
    vpc_id = "${aws_vpc.EC2VPC.id}"
    egress {
        security_groups = [
            "sg-00f5dab1cc4960e19"
        ]
        description = "Rule to allow connections to default from any instances this security group is attached to"
        from_port = 3306
        protocol = "tcp"
        to_port = 3306
    }
}

resource "aws_security_group" "EC2SecurityGroup5" {
    description = "default VPC security group"
    name = "default"
    tags = {
        Name = "IGNORE"
    }
    vpc_id = "${aws_vpc.EC2VPC3.id}"
    ingress {
        security_groups = [
            "sg-01611e009716d0b72"
        ]
        from_port = 0
        protocol = "-1"
        to_port = 0
    }
    egress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        from_port = 0
        protocol = "-1"
        to_port = 0
    }
}

resource "aws_security_group" "EC2SecurityGroup6" {
    description = "Security group attached to instances to securely connect to G2C-DBZabbix. Modification could lead to connection loss."
    name = "ec2-rds-2"
    tags = {
        Name = "G2C-DB-OUT"
    }
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    egress {
        security_groups = [
            "${aws_security_group.EC2SecurityGroup8.id}"
        ]
        description = "Rule to allow connections to G2C-DBZabbix from any instances this security group is attached to"
        from_port = 3306
        protocol = "tcp"
        to_port = 3306
    }
}

resource "aws_security_group" "EC2SecurityGroup7" {
    description = "default VPC security group"
    name = "default"
    tags = {
        Name = "IGNORE"
    }
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    ingress {
        security_groups = [
            "sg-0408a7d8d050642f5"
        ]
        from_port = 0
        protocol = "-1"
        to_port = 0
    }
    egress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        from_port = 0
        protocol = "-1"
        to_port = 0
    }
}

resource "aws_security_group" "EC2SecurityGroup8" {
    description = "Security group attached to G2C-DBZabbix to allow EC2 instances with specific security groups attached to connect to the database. Modification could lead to connection loss."
    name = "rds-ec2-2"
    tags = {
        Name = "G2C-DB-IN"
    }
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    ingress {
        security_groups = [
            "sg-068cd21ee22519bab"
        ]
        description = "Rule to allow connections from EC2 instances with sg-068cd21ee22519bab attached"
        from_port = 3306
        protocol = "tcp"
        to_port = 3306
    }
}

resource "aws_security_group" "EC2SecurityGroup9" {
    description = "default VPC security group"
    name = "default"
    tags = {
        Name = "IGNORE"
    }
    vpc_id = "${aws_vpc.EC2VPC.id}"
    ingress {
        security_groups = [
            "sg-04448aad3f5c18716"
        ]
        from_port = 0
        protocol = "-1"
        to_port = 0
    }
    egress {
        cidr_blocks = [
            "0.0.0.0/0"
        ]
        from_port = 0
        protocol = "-1"
        to_port = 0
    }
    egress {
        ipv6_cidr_blocks = [
            "::/0"
        ]
        from_port = 0
        protocol = "-1"
        to_port = 0
    }
}

resource "aws_launch_template" "EC2LaunchTemplate" {
    name = "G2C-Zabbix-1"
    tag_specifications {
        resource_type = "instance"
        tags {
            Name = "G2C-Zabbix-1"
        }
    }
    iam_instance_profile {
        arn = "arn:aws:iam::146545546065:instance-profile/AmazonSSMRoleForInstancesQuickSetup"
    }
    key_name = "G2C-Keypair"
    network_interfaces {
        device_index = 0
        security_groups = [
            "${aws_security_group.EC2SecurityGroup3.id}",
            "${aws_security_group.EC2SecurityGroup6.id}"
        ]
        subnet_id = "subnet-0db767b7c74d52a66"
    }
    image_id = "ami-07ce29758204cd4a6"
    instance_type = "t2.micro"
}

resource "aws_launch_template" "EC2LaunchTemplate2" {
    name = "G2C-Zabbix-2"
    iam_instance_profile {
        arn = "arn:aws:iam::146545546065:instance-profile/AmazonSSMRoleForInstancesQuickSetup"
    }
    key_name = "G2C-Keypair"
    network_interfaces {
        device_index = 0
        security_groups = [
            "${aws_security_group.EC2SecurityGroup3.id}",
            "${aws_security_group.EC2SecurityGroup6.id}"
        ]
        subnet_id = "subnet-03a4b89611ab38f6d"
    }
    image_id = "ami-07ce29758204cd4a6"
    instance_type = "t2.micro"
}

resource "aws_lb_target_group" "ElasticLoadBalancingV2TargetGroup" {
    health_check {
        interval = 30
        port = "traffic-port"
        protocol = "TCP"
        timeout = 10
        unhealthy_threshold = 2
        healthy_threshold = 5
    }
    port = 80
    protocol = "TCP"
    target_type = "instance"
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    name = "G2C-ZabbixNetwork"
}

resource "aws_lb_target_group" "ElasticLoadBalancingV2TargetGroup2" {
    health_check {
        interval = 5
        path = "/"
        port = "traffic-port"
        protocol = "HTTP"
        timeout = 2
        unhealthy_threshold = 2
        healthy_threshold = 2
        matcher = "200"
    }
    port = 80
    protocol = "HTTP"
    target_type = "instance"
    vpc_id = "${aws_vpc.EC2VPC2.id}"
    name = "G2C-ZabbixApplication"
}

resource "aws_ebs_volume" "EC2Volume" {
    availability_zone = "us-east-1b"
    encrypted = false
    size = 8
    type = "gp2"
    snapshot_id = "snap-0e7030345d3ce3139"
    tags = {
        Name = "G2C-Zabbix-2"
    }
}

resource "aws_ebs_volume" "EC2Volume2" {
    availability_zone = "us-east-1a"
    encrypted = false
    size = 8
    type = "gp2"
    snapshot_id = "snap-0e7030345d3ce3139"
    tags = {
        Name = "G2C-Zabbix-1"
    }
}

resource "aws_volume_attachment" "EC2VolumeAttachment" {
    volume_id = "vol-0c6cdc2f3f6e08213"
    instance_id = "i-019ff13bcc11ef2a8"
    device_name = "/dev/sda1"
}

resource "aws_volume_attachment" "EC2VolumeAttachment2" {
    volume_id = "vol-050b5020b636b2212"
    instance_id = "i-09e33ce04e84e7208"
    device_name = "/dev/sda1"
}

resource "aws_network_interface" "EC2NetworkInterface" {
    description = "RDSNetworkInterface"
    private_ips = [
        "10.0.2.135"
    ]
    subnet_id = "subnet-02364f97174baa722"
    source_dest_check = true
    security_groups = [
        "${aws_security_group.EC2SecurityGroup8.id}",
        "${aws_security_group.EC2SecurityGroup3.id}"
    ]
}

resource "aws_network_interface" "EC2NetworkInterface2" {
    description = "ELB net/G2C-ZabbixNetwork/36342b03712a720b"
    private_ips = [
        "10.0.1.216"
    ]
    subnet_id = "subnet-0db767b7c74d52a66"
    source_dest_check = false
}

resource "aws_network_interface" "EC2NetworkInterface3" {
    description = ""
    private_ips = [
        "10.0.1.74"
    ]
    subnet_id = "subnet-0db767b7c74d52a66"
    source_dest_check = true
    security_groups = [
        "${aws_security_group.EC2SecurityGroup3.id}",
        "${aws_security_group.EC2SecurityGroup6.id}"
    ]
}

resource "aws_network_interface" "EC2NetworkInterface4" {
    description = "ELB app/G2C-ZabbixApplication/7ab6443ed5300cd4"
    private_ips = [
        "10.0.1.158"
    ]
    subnet_id = "subnet-0db767b7c74d52a66"
    source_dest_check = true
    security_groups = [
        "${aws_security_group.EC2SecurityGroup3.id}"
    ]
}

resource "aws_network_interface" "EC2NetworkInterface5" {
    description = "ELB app/G2C-ZabbixApplication/7ab6443ed5300cd4"
    private_ips = [
        "10.0.3.47"
    ]
    subnet_id = "subnet-03a4b89611ab38f6d"
    source_dest_check = true
    security_groups = [
        "${aws_security_group.EC2SecurityGroup3.id}"
    ]
}

resource "aws_network_interface" "EC2NetworkInterface6" {
    description = "ELB net/G2C-ZabbixNetwork/36342b03712a720b"
    private_ips = [
        "10.0.3.176"
    ]
    subnet_id = "subnet-03a4b89611ab38f6d"
    source_dest_check = false
}

resource "aws_network_interface" "EC2NetworkInterface7" {
    description = ""
    private_ips = [
        "10.0.3.4"
    ]
    subnet_id = "subnet-03a4b89611ab38f6d"
    source_dest_check = true
    security_groups = [
        "${aws_security_group.EC2SecurityGroup3.id}",
        "${aws_security_group.EC2SecurityGroup6.id}"
    ]
}

resource "aws_network_interface_attachment" "EC2NetworkInterfaceAttachment" {
    network_interface_id = "eni-0862a262bea3dc072"
    device_index = 0
    instance_id = "i-09e33ce04e84e7208"
}

resource "aws_network_interface_attachment" "EC2NetworkInterfaceAttachment2" {
    network_interface_id = "eni-0588b1ac1c0cef402"
    device_index = 0
    instance_id = "i-019ff13bcc11ef2a8"
}

resource "aws_key_pair" "EC2KeyPair" {
    public_key = "REPLACEME"
    key_name = "default"
}

resource "aws_key_pair" "EC2KeyPair2" {
    public_key = "REPLACEME"
    key_name = "G2C-Keypair"
}

resource "aws_lambda_function" "LambdaFunction" {
    description = ""
    function_name = "agent_lambda"
    handler = "agent_lambda.FunctionRequestHandler::execute"
    architectures = [
        "x86_64"
    ]
    s3_bucket = "prod-iad-c1-djusa-tasks"
    s3_key = "/snapshots/146545546065/agent_lambda-c3cdbdb7-da4c-49e2-812e-8452afc85efc"
    s3_object_version = "jZvxZaXNlkopsbBd8EineeE5gBHp94I7"
    memory_size = 1024
    role = "${aws_iam_role.IAMRole5.arn}"
    runtime = "java11"
    timeout = 14
    tracing_config {
        mode = "PassThrough"
    }
    tags = {
        Name = "agent_lambda"
    }
}

resource "aws_s3_bucket" "S3Bucket" {
    bucket = "bruno.eadcloud.com"
}

resource "aws_s3_bucket" "S3Bucket2" {
    bucket = "g2c-zabbix-agent"
}

resource "aws_s3_bucket_policy" "S3BucketPolicy" {
    bucket = "bruno.eadcloud.com"
    policy = "{\"Version\":\"2012-10-17\",\"Id\":\"Policy1679437623798\",\"Statement\":[{\"Sid\":\"Stmt1679437620465\",\"Effect\":\"Allow\",\"Principal\":\"*\",\"Action\":\"s3:GetObject\",\"Resource\":\"arn:aws:s3:::bruno.eadcloud.com/*\"}]}"
}

resource "aws_db_instance" "RDSDBInstance" {
    identifier = "g2c-dbzabbix"
    allocated_storage = 10
    instance_class = "db.t3.micro"
    engine = "mysql"
    username = "admin"
    password = "REPLACEME"
    name = "zabbix"
    backup_window = "05:06-05:36"
    backup_retention_period = 0
    availability_zone = "us-east-1a"
    maintenance_window = "mon:04:20-mon:04:50"
    multi_az = false
    engine_version = "8.0.32"
    auto_minor_version_upgrade = true
    license_model = "general-public-license"
    publicly_accessible = false
    storage_type = "gp2"
    port = 3306
    storage_encrypted = false
    copy_tags_to_snapshot = true
    monitoring_interval = 0
    iam_database_authentication_enabled = false
    deletion_protection = true
    db_subnet_group_name = "g2c-dbzabbix"
    vpc_security_group_ids = [
        "${aws_security_group.EC2SecurityGroup8.id}",
        "${aws_security_group.EC2SecurityGroup3.id}"
    ]
    max_allocated_storage = 50
}

resource "aws_db_subnet_group" "RDSDBSubnetGroup" {
    description = "db-default"
    name = "db-default"
    subnet_ids = [
        "subnet-06706ce6b63c93e38",
        "subnet-075392cd28a412bd0"
    ]
}

resource "aws_db_subnet_group" "RDSDBSubnetGroup2" {
    description = "Banco de Dados"
    name = "g2c-dbzabbix"
    subnet_ids = [
        "subnet-02364f97174baa722",
        "subnet-00aff1957f73f4f72"
    ]
}

resource "aws_db_parameter_group" "RDSDBParameterGroup" {
    description = "config group for zabbix."
    family = "mysql8.0"
    parameters {
        name = "log_bin_trust_function_creators"
        value = "0"
    }
}

resource "aws_opsworks_user_profile" "OpsWorksUserProfile" {
    allow_self_management = false
    user_arn = "arn:aws:iam::146545546065:user/dev"
    ssh_username = "dev"
}

resource "aws_sns_topic" "SNSTopic" {
    display_name = "G2C-ZabbixAlerta"
    name = "G2C-ZabbixAlerta"
}

resource "aws_sns_topic" "SNSTopic2" {
    display_name = ""
    name = "fatura"
}

resource "aws_sns_topic_policy" "SNSTopicPolicy" {
    policy = "{\"Version\":\"2008-10-17\",\"Id\":\"__default_policy_ID\",\"Statement\":[{\"Sid\":\"__default_statement_ID\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":\"*\"},\"Action\":[\"SNS:GetTopicAttributes\",\"SNS:SetTopicAttributes\",\"SNS:AddPermission\",\"SNS:RemovePermission\",\"SNS:DeleteTopic\",\"SNS:Subscribe\",\"SNS:ListSubscriptionsByTopic\",\"SNS:Publish\"],\"Resource\":\"arn:aws:sns:us-east-1:146545546065:G2C-ZabbixAlerta\",\"Condition\":{\"StringEquals\":{\"AWS:SourceOwner\":\"146545546065\"}}}]}"
    arn = "arn:aws:sns:us-east-1:146545546065:G2C-ZabbixAlerta"
}

resource "aws_sns_topic_policy" "SNSTopicPolicy2" {
    policy = "{\"Version\":\"2008-10-17\",\"Id\":\"__default_policy_ID\",\"Statement\":[{\"Sid\":\"__default_statement_ID\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":\"*\"},\"Action\":[\"SNS:GetTopicAttributes\",\"SNS:SetTopicAttributes\",\"SNS:AddPermission\",\"SNS:RemovePermission\",\"SNS:DeleteTopic\",\"SNS:Subscribe\",\"SNS:ListSubscriptionsByTopic\",\"SNS:Publish\"],\"Resource\":\"arn:aws:sns:us-east-1:146545546065:fatura\",\"Condition\":{\"StringEquals\":{\"AWS:SourceOwner\":\"146545546065\"}}}]}"
    arn = "arn:aws:sns:us-east-1:146545546065:fatura"
}

resource "aws_sns_topic_subscription" "SNSSubscription" {
    topic_arn = "arn:aws:sns:us-east-1:146545546065:G2C-ZabbixAlerta"
    endpoint = "bruno.taboada@gmail.com"
    protocol = "email"
}

resource "aws_sns_topic_subscription" "SNSSubscription2" {
    topic_arn = "arn:aws:sns:us-east-1:146545546065:fatura"
    endpoint = "bruno.taboada@gmail.com"
    protocol = "email"
}

resource "aws_sns_topic_subscription" "SNSSubscription3" {
    topic_arn = "arn:aws:sns:us-east-1:146545546065:G2C-ZabbixAlerta"
    endpoint = "bruno.taboada@gmail.com"
    protocol = "email"
}

resource "aws_sns_topic_subscription" "SNSSubscription4" {
    topic_arn = "arn:aws:sns:us-east-1:146545546065:fatura"
    endpoint = "bruno.taboada@gmail.com"
    protocol = "email"
}

resource "aws_cloudwatch_metric_alarm" "CloudWatchAlarm" {
    alarm_name = "fature_alerta"
    alarm_description = "Alarme de fatura."
    actions_enabled = true
    alarm_actions = [
        "arn:aws:sns:us-east-1:146545546065:fatura"
    ]
    metric_name = "EstimatedCharges"
    namespace = "AWS/Billing"
    statistic = "Maximum"
    dimensions {
        Currency = "USD"
    }
    period = 21600
    evaluation_periods = 1
    datapoints_to_alarm = 1
    threshold = 10
    comparison_operator = "GreaterThanThreshold"
    treat_missing_data = "missing"
}

resource "aws_cloudwatch_log_group" "LogsLogGroup" {
    name = "/aws/lambda/agent_lambda"
}

resource "aws_cloudwatch_log_group" "LogsLogGroup2" {
    name = "/aws/rds/instance/zabbix/error"
}

resource "aws_cloudwatch_log_group" "LogsLogGroup3" {
    name = "RDSOSMetrics"
    retention_in_days = 30
}

resource "aws_neptune_subnet_group" "NeptuneDBSubnetGroup" {
    name = "db-default"
    description = "db-default"
    subnet_ids = [
        "subnet-06706ce6b63c93e38",
        "subnet-075392cd28a412bd0"
    ]
}

resource "aws_neptune_subnet_group" "NeptuneDBSubnetGroup2" {
    name = "g2c-dbzabbix"
    description = "Banco de Dados"
    subnet_ids = [
        "subnet-02364f97174baa722",
        "subnet-00aff1957f73f4f72"
    ]
}

resource "aws_docdb_subnet_group" "DocDBDBSubnetGroup" {
    name = "db-default"
    description = "db-default"
    subnet_ids = [
        "subnet-06706ce6b63c93e38",
        "subnet-075392cd28a412bd0"
    ]
}

resource "aws_docdb_subnet_group" "DocDBDBSubnetGroup2" {
    name = "g2c-dbzabbix"
    description = "Banco de Dados"
    subnet_ids = [
        "subnet-02364f97174baa722",
        "subnet-00aff1957f73f4f72"
    ]
}

resource "aws_budgets_budget" "BudgetsBudget" {
    limit_amount = "50.0"
    limit_unit = "USD"
    time_period_end = "2087-06-15T00:00:00.000Z"
    time_period_start = "2023-03-01T00:00:00.000Z"
    time_unit = "MONTHLY"
    cost_filters {}
    name = "My Zero-Spend Budget"
    cost_types {
        include_support = true
        include_other_subscription = true
        include_tax = true
        include_subscription = true
        use_blended = false
        include_upfront = true
        include_discount = true
        include_credit = false
        include_recurring = true
        use_amortized = false
        include_refund = false
    }
    budget_type = "COST"
}

resource "aws_acm_certificate" "CertificateManagerCertificate" {
    domain_name = "g2c-monitor.click"
    subject_alternative_names = [
        "g2c-monitor.click"
    ]
    validation_method = "DNS"
}
