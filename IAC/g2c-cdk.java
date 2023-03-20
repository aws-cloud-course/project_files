package com.myorg;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.core.CfnResource;

import java.util.Arrays;
import java.util.HashMap;

public class MyStack extends Stack {
    public MyStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public MyStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        CfnResource iamUser = CfnResource.Builder.create(this, "IAMUser")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "alexia");
                put("Groups",
                    Arrays.asList(
                        iamGroup3.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamUser2 = CfnResource.Builder.create(this, "IAMUser2")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "dev");
                put("Groups",
                    Arrays.asList(
                        iamGroup2.getRef()
                    )
                );
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","AKIASEHWLSNI2YQWK5VZ");
                            put("Value","app_key");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","Context");
                            put("Value","Dev");
                        }}

                    )
                );
            }})
            .build();

        CfnResource iamUser3 = CfnResource.Builder.create(this, "IAMUser3")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "gilberto");
                put("Groups",
                    Arrays.asList(
                        iamGroup.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamUser4 = CfnResource.Builder.create(this, "IAMUser4")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "fabio");
                put("Groups",
                    Arrays.asList(
                        iamGroup2.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamUser5 = CfnResource.Builder.create(this, "IAMUser5")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "heverton");
                put("Groups",
                    Arrays.asList(
                        iamGroup3.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamUser6 = CfnResource.Builder.create(this, "IAMUser6")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "joelson");
                put("Groups",
                    Arrays.asList(
                        iamGroup3.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamUser7 = CfnResource.Builder.create(this, "IAMUser7")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "kaique");
                put("Groups",
                    Arrays.asList(
                        iamGroup3.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamUser8 = CfnResource.Builder.create(this, "IAMUser8")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "luckviana");
                put("Groups",
                    Arrays.asList(
                        iamGroup3.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamUser9 = CfnResource.Builder.create(this, "IAMUser9")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "mralbani");
                put("Groups",
                    Arrays.asList(
                        iamGroup.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamUser10 = CfnResource.Builder.create(this, "IAMUser10")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "rafael");
                put("Groups",
                    Arrays.asList(
                        iamGroup3.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamUser11 = CfnResource.Builder.create(this, "IAMUser11")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "tercio");
                put("Groups",
                    Arrays.asList(
                        iamGroup3.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamUser12 = CfnResource.Builder.create(this, "IAMUser12")
            .type("AWS::IAM::User")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("UserName", "william");
                put("Groups",
                    Arrays.asList(
                        iamGroup3.getRef()
                    )
                );
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/IAMUserChangePassword"
                    )
                );
            }})
            .build();

        CfnResource iamGroup = CfnResource.Builder.create(this, "IAMGroup")
            .type("AWS::IAM::Group")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("GroupName", "PowerUsers");
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/PowerUserAccess"
                    )
                );
            }})
            .build();

        CfnResource iamGroup2 = CfnResource.Builder.create(this, "IAMGroup2")
            .type("AWS::IAM::Group")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("GroupName", "Devs");
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/AdministratorAccess"
                    )
                );
            }})
            .build();

        CfnResource iamGroup3 = CfnResource.Builder.create(this, "IAMGroup3")
            .type("AWS::IAM::Group")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("GroupName", "G2_users");
            }})
            .build();

        CfnResource iamRole = CfnResource.Builder.create(this, "IAMRole")
            .type("AWS::IAM::Role")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/service-role/");
                put("RoleName", "Amazon_EventBridge_Scheduler_LAMBDA_8487e93e2e");
                put("AssumeRolePolicyDocument", "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"scheduler.amazonaws.com\"},\"Action\":\"sts:AssumeRole\",\"Condition\":{\"StringEquals\":{\"aws:SourceArn\":\"arn:aws:scheduler:us-east-1:146545546065:schedule/default/cpu-metric\",\"aws:SourceAccount\":\"146545546065\"}}}]}");
                put("MaxSessionDuration", 3600);
                put("ManagedPolicyArns",
                    Arrays.asList(
                        iamManagedPolicy7.getRef()
                    )
                );
            }})
            .build();

        CfnResource iamRole2 = CfnResource.Builder.create(this, "IAMRole2")
            .type("AWS::IAM::Role")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("RoleName", "AmazonSSMRoleForInstancesQuickSetup");
                put("AssumeRolePolicyDocument", "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"ec2.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}");
                put("MaxSessionDuration", 3600);
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/AmazonSSMManagedInstanceCore",
                        "arn:aws:iam::aws:policy/PowerUserAccess",
                        "arn:aws:iam::aws:policy/AmazonSSMPatchAssociation"
                    )
                );
                put("Description", "EC2 role for SSM for Quick-Setup");
            }})
            .build();

        CfnResource iamRole3 = CfnResource.Builder.create(this, "IAMRole3")
            .type("AWS::IAM::Role")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/service-role/");
                put("RoleName", "Amazon_EventBridge_Scheduler_LAMBDA_8a1525404a");
                put("AssumeRolePolicyDocument", "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"scheduler.amazonaws.com\"},\"Action\":\"sts:AssumeRole\",\"Condition\":{\"StringEquals\":{\"aws:SourceArn\":\"arn:aws:scheduler:us-east-1:146545546065:schedule/default/lambda-metric\",\"aws:SourceAccount\":\"146545546065\"}}}]}");
                put("MaxSessionDuration", 3600);
                put("ManagedPolicyArns",
                    Arrays.asList(
                        iamManagedPolicy6.getRef()
                    )
                );
            }})
            .build();

        CfnResource iamRole4 = CfnResource.Builder.create(this, "IAMRole4")
            .type("AWS::IAM::Role")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/service-role/");
                put("RoleName", "Amazon_EventBridge_Scheduler_LAMBDA_9e960d94d1");
                put("AssumeRolePolicyDocument", "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"scheduler.amazonaws.com\"},\"Action\":\"sts:AssumeRole\",\"Condition\":{\"StringEquals\":{\"aws:SourceArn\":\"arn:aws:scheduler:us-east-1:146545546065:schedule/default/ec2-metric\",\"aws:SourceAccount\":\"146545546065\"}}}]}");
                put("MaxSessionDuration", 3600);
                put("ManagedPolicyArns",
                    Arrays.asList(
                        iamManagedPolicy.getRef()
                    )
                );
            }})
            .build();

        CfnResource iamRole5 = CfnResource.Builder.create(this, "IAMRole5")
            .type("AWS::IAM::Role")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/service-role/");
                put("RoleName", "agent_lambda-role-ans62qfz");
                put("AssumeRolePolicyDocument", "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"lambda.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}");
                put("MaxSessionDuration", 3600);
                put("ManagedPolicyArns",
                    Arrays.asList(
                        iamManagedPolicy4.getRef(),
                        "arn:aws:iam::aws:policy/PowerUserAccess"
                    )
                );
            }})
            .build();

        CfnResource iamRole6 = CfnResource.Builder.create(this, "IAMRole6")
            .type("AWS::IAM::Role")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("RoleName", "AWS-QuickSetup-StackSet-Local-AdministrationRole");
                put("AssumeRolePolicyDocument", "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"cloudformation.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}");
                put("MaxSessionDuration", 3600);
            }})
            .build();

        CfnResource iamRole7 = CfnResource.Builder.create(this, "IAMRole7")
            .type("AWS::IAM::Role")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/service-role/");
                put("RoleName", "AWSFISIAMRole-1678588725585");
                put("AssumeRolePolicyDocument", "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"fis.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}");
                put("MaxSessionDuration", 3600);
                put("ManagedPolicyArns",
                    Arrays.asList(
                        iamManagedPolicy2.getRef()
                    )
                );
            }})
            .build();

        CfnResource iamRole8 = CfnResource.Builder.create(this, "IAMRole8")
            .type("AWS::IAM::Role")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("RoleName", "AWS-QuickSetup-StackSet-Local-ExecutionRole");
                put("AssumeRolePolicyDocument", "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"AWS\":\"arn:aws:iam::146545546065:role/AWS-QuickSetup-StackSet-Local-AdministrationRole\"},\"Action\":\"sts:AssumeRole\"}]}");
                put("MaxSessionDuration", 3600);
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/AdministratorAccess"
                    )
                );
            }})
            .build();

        CfnResource iamRole9 = CfnResource.Builder.create(this, "IAMRole9")
            .type("AWS::IAM::Role")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("RoleName", "rds-monitoring-role");
                put("AssumeRolePolicyDocument", "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Sid\":\"\",\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"monitoring.rds.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}");
                put("MaxSessionDuration", 3600);
                put("ManagedPolicyArns",
                    Arrays.asList(
                        "arn:aws:iam::aws:policy/service-role/AmazonRDSEnhancedMonitoringRole"
                    )
                );
            }})
            .build();

        CfnResource iamServiceLinkedRole = CfnResource.Builder.create(this, "IAMServiceLinkedRole")
            .type("AWS::IAM::ServiceLinkedRole")
            .properties(new HashMap<String, Object>() {{

                put("AWSServiceName", "ssm.amazonaws.com");
                put("Description", "Provides access to AWS Resources managed or used by Amazon SSM.");
            }})
            .build();

        CfnResource iamServiceLinkedRole2 = CfnResource.Builder.create(this, "IAMServiceLinkedRole2")
            .type("AWS::IAM::ServiceLinkedRole")
            .properties(new HashMap<String, Object>() {{

                put("AWSServiceName", "autoscaling.amazonaws.com");
                put("Description", "Default Service-Linked Role enables access to AWS Services and Resources used or managed by Auto Scaling");
            }})
            .build();

        CfnResource iamServiceLinkedRole3 = CfnResource.Builder.create(this, "IAMServiceLinkedRole3")
            .type("AWS::IAM::ServiceLinkedRole")
            .properties(new HashMap<String, Object>() {{

                put("AWSServiceName", "events.amazonaws.com");
            }})
            .build();

        CfnResource iamServiceLinkedRole4 = CfnResource.Builder.create(this, "IAMServiceLinkedRole4")
            .type("AWS::IAM::ServiceLinkedRole")
            .properties(new HashMap<String, Object>() {{

                put("AWSServiceName", "elasticloadbalancing.amazonaws.com");
                put("Description", "Allows ELB to call AWS services on your behalf.");
            }})
            .build();

        CfnResource iamServiceLinkedRole5 = CfnResource.Builder.create(this, "IAMServiceLinkedRole5")
            .type("AWS::IAM::ServiceLinkedRole")
            .properties(new HashMap<String, Object>() {{

                put("AWSServiceName", "fis.amazonaws.com");
                put("Description", "Role to enable AWS FIS to manage monitoring and resource selection for experiments.");
            }})
            .build();

        CfnResource iamServiceLinkedRole6 = CfnResource.Builder.create(this, "IAMServiceLinkedRole6")
            .type("AWS::IAM::ServiceLinkedRole")
            .properties(new HashMap<String, Object>() {{

                put("AWSServiceName", "globalaccelerator.amazonaws.com");
                put("Description", "Allows Global Accelerator to call AWS services on customer's behalf");
            }})
            .build();

        CfnResource iamServiceLinkedRole7 = CfnResource.Builder.create(this, "IAMServiceLinkedRole7")
            .type("AWS::IAM::ServiceLinkedRole")
            .properties(new HashMap<String, Object>() {{

                put("AWSServiceName", "rds.amazonaws.com");
                put("Description", "Allows Amazon RDS to manage AWS resources on your behalf");
            }})
            .build();

        CfnResource iamManagedPolicy = CfnResource.Builder.create(this, "IAMManagedPolicy")
            .type("AWS::IAM::ManagedPolicy")
            .properties(new HashMap<String, Object>() {{

                put("ManagedPolicyName", "Amazon-EventBridge-Scheduler-Execution-Policy-9cd8c603-0d7b-4bbb-b872-cff0c614745f");
                put("Path", "/service-role/");
                put("PolicyDocument", "
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
");
            }})
            .build();

        CfnResource iamManagedPolicy2 = CfnResource.Builder.create(this, "IAMManagedPolicy2")
            .type("AWS::IAM::ManagedPolicy")
            .properties(new HashMap<String, Object>() {{

                put("ManagedPolicyName", "FIS-Console-EC2-1678588725585");
                put("Path", "/service-role/");
                put("PolicyDocument", "
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
");
            }})
            .build();

        CfnResource iamManagedPolicy3 = CfnResource.Builder.create(this, "IAMManagedPolicy3")
            .type("AWS::IAM::ManagedPolicy")
            .properties(new HashMap<String, Object>() {{

                put("ManagedPolicyName", "Amazon-EventBridge-Scheduler-Execution-Policy-e96abe94-f21a-456d-b2c8-43b0c98a255a");
                put("Path", "/service-role/");
                put("PolicyDocument", "
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
");
            }})
            .build();

        CfnResource iamManagedPolicy4 = CfnResource.Builder.create(this, "IAMManagedPolicy4")
            .type("AWS::IAM::ManagedPolicy")
            .properties(new HashMap<String, Object>() {{

                put("ManagedPolicyName", "AWSLambdaBasicExecutionRole-b282d291-1e12-4fa6-b407-4113e11dda22");
                put("Path", "/service-role/");
                put("PolicyDocument", "
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
");
            }})
            .build();

        CfnResource iamManagedPolicy5 = CfnResource.Builder.create(this, "IAMManagedPolicy5")
            .type("AWS::IAM::ManagedPolicy")
            .properties(new HashMap<String, Object>() {{

                put("ManagedPolicyName", "AWSLambdaVPCAccessExecutionRole-58038e2d-825d-40a7-b171-067bd4448301");
                put("Path", "/service-role/");
                put("PolicyDocument", "
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
");
            }})
            .build();

        CfnResource iamManagedPolicy6 = CfnResource.Builder.create(this, "IAMManagedPolicy6")
            .type("AWS::IAM::ManagedPolicy")
            .properties(new HashMap<String, Object>() {{

                put("ManagedPolicyName", "Amazon-EventBridge-Scheduler-Execution-Policy-968fbaf2-f17c-4517-93b4-2871876c3fb4");
                put("Path", "/service-role/");
                put("PolicyDocument", "
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
");
            }})
            .build();

        CfnResource iamManagedPolicy7 = CfnResource.Builder.create(this, "IAMManagedPolicy7")
            .type("AWS::IAM::ManagedPolicy")
            .properties(new HashMap<String, Object>() {{

                put("ManagedPolicyName", "Amazon-EventBridge-Scheduler-Execution-Policy-4db9d3d5-71f8-4ab4-87f7-f0c7cf16dc9b");
                put("Path", "/service-role/");
                put("PolicyDocument", "
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
");
            }})
            .build();

        CfnResource iamPolicy = CfnResource.Builder.create(this, "IAMPolicy")
            .type("AWS::IAM::Policy")
            .properties(new HashMap<String, Object>() {{

                put("PolicyDocument", "
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
");
                put("Groups",
                    Arrays.asList(
                        iamGroup3.getRef()
                    )
                );
                put("PolicyName", "ReadAccess");
            }})
            .build();

        CfnResource iamPolicy2 = CfnResource.Builder.create(this, "IAMPolicy2")
            .type("AWS::IAM::Policy")
            .properties(new HashMap<String, Object>() {{

                put("PolicyDocument", "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Action\":[\"sts:AssumeRole\"],\"Resource\":[\"arn:*:iam::*:role/AWS-QuickSetup-StackSet-Local-ExecutionRole\"],\"Effect\":\"Allow\"}]}");
                put("Roles",
                    Arrays.asList(
                        iamRole6.getRef()
                    )
                );
                put("PolicyName", "AssumeRole-AWS-QuickSetup-StackSet-Local-ExecutionRole");
            }})
            .build();

        CfnResource iamPolicy3 = CfnResource.Builder.create(this, "IAMPolicy3")
            .type("AWS::IAM::Policy")
            .properties(new HashMap<String, Object>() {{

                put("PolicyDocument", "
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
");
                put("Users",
                    Arrays.asList(
                        "dev"
                    )
                );
                put("PolicyName", "zabbix");
            }})
            .build();

        CfnResource iamInstanceProfile = CfnResource.Builder.create(this, "IAMInstanceProfile")
            .type("AWS::IAM::InstanceProfile")
            .properties(new HashMap<String, Object>() {{

                put("Path", "/");
                put("InstanceProfileName", iamRole2.getRef());
                put("Roles",
                    Arrays.asList(
                        iamRole2.getRef()
                    )
                );
            }})
            .build();

        CfnResource iamAccessKey = CfnResource.Builder.create(this, "IAMAccessKey")
            .type("AWS::IAM::AccessKey")
            .properties(new HashMap<String, Object>() {{

                put("Status", "Active");
                put("UserName", "dev");
            }})
            .build();

        CfnResource iamVirtualMfaDevice = CfnResource.Builder.create(this, "IAMVirtualMFADevice")
            .type("AWS::IAM::VirtualMFADevice")
            .properties(new HashMap<String, Object>() {{

                put("SerialNumber", "arn:aws:iam::146545546065:mfa/Mfa_aws");
                put("Users",
                    Arrays.asList(
                        "arn:aws:iam::146545546065:root"
                    )
                );
            }})
            .build();

        CfnResource iamVirtualMfaDevice2 = CfnResource.Builder.create(this, "IAMVirtualMFADevice2")
            .type("AWS::IAM::VirtualMFADevice")
            .properties(new HashMap<String, Object>() {{

                put("SerialNumber", "arn:aws:iam::146545546065:mfa/samsung");
                put("Users",
                    Arrays.asList(
                        "arn:aws:iam::146545546065:user/dev"
                    )
                );
            }})
            .build();

        CfnResource iamVirtualMfaDevice3 = CfnResource.Builder.create(this, "IAMVirtualMFADevice3")
            .type("AWS::IAM::VirtualMFADevice")
            .properties(new HashMap<String, Object>() {{

                put("SerialNumber", "arn:aws:iam::146545546065:mfa/rafael_authenticator");
                put("Users",
                    Arrays.asList(
                        "arn:aws:iam::146545546065:user/rafael"
                    )
                );
            }})
            .build();

        CfnResource iamVirtualMfaDevice4 = CfnResource.Builder.create(this, "IAMVirtualMFADevice4")
            .type("AWS::IAM::VirtualMFADevice")
            .properties(new HashMap<String, Object>() {{

                put("SerialNumber", "arn:aws:iam::146545546065:mfa/gilberto_authenticator");
                put("Users",
                    Arrays.asList(
                        "arn:aws:iam::146545546065:user/gilberto"
                    )
                );
            }})
            .build();

        CfnResource iamVirtualMfaDevice5 = CfnResource.Builder.create(this, "IAMVirtualMFADevice5")
            .type("AWS::IAM::VirtualMFADevice")
            .properties(new HashMap<String, Object>() {{

                put("SerialNumber", "arn:aws:iam::146545546065:mfa/manuel_authenticator");
                put("Users",
                    Arrays.asList(
                        "arn:aws:iam::146545546065:user/mralbani"
                    )
                );
            }})
            .build();

        CfnResource iamVirtualMfaDevice6 = CfnResource.Builder.create(this, "IAMVirtualMFADevice6")
            .type("AWS::IAM::VirtualMFADevice")
            .properties(new HashMap<String, Object>() {{

                put("SerialNumber", "arn:aws:iam::146545546065:mfa/luckviana_authenticator");
                put("Users",
                    Arrays.asList(
                        "arn:aws:iam::146545546065:user/luckviana"
                    )
                );
            }})
            .build();

        CfnResource iamVirtualMfaDevice7 = CfnResource.Builder.create(this, "IAMVirtualMFADevice7")
            .type("AWS::IAM::VirtualMFADevice")
            .properties(new HashMap<String, Object>() {{

                put("SerialNumber", "arn:aws:iam::146545546065:mfa/fabio");
                put("Users",
                    Arrays.asList(
                        "arn:aws:iam::146545546065:user/fabio"
                    )
                );
            }})
            .build();

        CfnResource iamVirtualMfaDevice8 = CfnResource.Builder.create(this, "IAMVirtualMFADevice8")
            .type("AWS::IAM::VirtualMFADevice")
            .properties(new HashMap<String, Object>() {{

                put("SerialNumber", "arn:aws:iam::146545546065:mfa/alexia_authenticator");
                put("Users",
                    Arrays.asList(
                        "arn:aws:iam::146545546065:user/alexia"
                    )
                );
            }})
            .build();

        CfnResource iamVirtualMfaDevice9 = CfnResource.Builder.create(this, "IAMVirtualMFADevice9")
            .type("AWS::IAM::VirtualMFADevice")
            .properties(new HashMap<String, Object>() {{

                put("SerialNumber", "arn:aws:iam::146545546065:mfa/joelson_authenticator");
                put("Users",
                    Arrays.asList(
                        "arn:aws:iam::146545546065:user/joelson"
                    )
                );
            }})
            .build();

        CfnResource ec2vpc = CfnResource.Builder.create(this, "EC2VPC")
            .type("AWS::EC2::VPC")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", ec2vpc2.getAtt("CidrBlock"));
                put("EnableDnsSupport", true);
                put("EnableDnsHostnames", true);
                put("InstanceTenancy", "default");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","vpc_curso");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2vpc2 = CfnResource.Builder.create(this, "EC2VPC2")
            .type("AWS::EC2::VPC")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "10.0.0.0/16");
                put("EnableDnsSupport", true);
                put("EnableDnsHostnames", false);
                put("InstanceTenancy", "default");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-VPC");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2vpc3 = CfnResource.Builder.create(this, "EC2VPC3")
            .type("AWS::EC2::VPC")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "172.31.0.0/16");
                put("EnableDnsSupport", true);
                put("EnableDnsHostnames", true);
                put("InstanceTenancy", "default");
            }})
            .build();

        CfnResource ec2vpcCidrBlock = CfnResource.Builder.create(this, "EC2VPCCidrBlock")
            .type("AWS::EC2::VPCCidrBlock")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc.getRef());
                put("Ipv6CidrBlock", "2600:1f10:4596:2500::/56");
                put("Ipv6Pool", "Amazon");
            }})
            .build();

        CfnResource ec2Subnet = CfnResource.Builder.create(this, "EC2Subnet")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Subnet5.getAtt("AvailabilityZone"));
                put("CidrBlock", "10.0.3.0/24");
                put("VpcId", ec2vpc.getRef());
                put("MapPublicIpOnLaunch", false);
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","priv01");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2Subnet2 = CfnResource.Builder.create(this, "EC2Subnet2")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Subnet4.getAtt("AvailabilityZone"));
                put("CidrBlock", "10.0.3.0/24");
                put("VpcId", ec2vpc2.getRef());
                put("MapPublicIpOnLaunch", false);
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-SNPublica01B");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2Subnet3 = CfnResource.Builder.create(this, "EC2Subnet3")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", "us-east-1d");
                put("CidrBlock", "172.31.80.0/20");
                put("VpcId", ec2vpc3.getRef());
                put("MapPublicIpOnLaunch", true);
            }})
            .build();

        CfnResource ec2Subnet4 = CfnResource.Builder.create(this, "EC2Subnet4")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Subnet7.getAtt("AvailabilityZone"));
                put("CidrBlock", "172.31.32.0/20");
                put("VpcId", ec2vpc3.getRef());
                put("MapPublicIpOnLaunch", true);
            }})
            .build();

        CfnResource ec2Subnet5 = CfnResource.Builder.create(this, "EC2Subnet5")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Subnet6.getAtt("AvailabilityZone"));
                put("CidrBlock", "172.31.16.0/20");
                put("VpcId", ec2vpc3.getRef());
                put("MapPublicIpOnLaunch", true);
            }})
            .build();

        CfnResource ec2Subnet6 = CfnResource.Builder.create(this, "EC2Subnet6")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Subnet13.getAtt("AvailabilityZone"));
                put("CidrBlock", "10.0.1.0/24");
                put("VpcId", ec2vpc2.getRef());
                put("MapPublicIpOnLaunch", false);
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-SNPublica01A");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2Subnet7 = CfnResource.Builder.create(this, "EC2Subnet7")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Subnet10.getAtt("AvailabilityZone"));
                put("CidrBlock", "10.0.4.0/24");
                put("VpcId", ec2vpc2.getRef());
                put("MapPublicIpOnLaunch", false);
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-SNPrivada01B");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2Subnet8 = CfnResource.Builder.create(this, "EC2Subnet8")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", "us-east-1e");
                put("CidrBlock", "172.31.48.0/20");
                put("VpcId", ec2vpc3.getRef());
                put("MapPublicIpOnLaunch", true);
            }})
            .build();

        CfnResource ec2Subnet9 = CfnResource.Builder.create(this, "EC2Subnet9")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", "us-east-1f");
                put("CidrBlock", "172.31.64.0/20");
                put("VpcId", ec2vpc3.getRef());
                put("MapPublicIpOnLaunch", true);
            }})
            .build();

        CfnResource ec2Subnet10 = CfnResource.Builder.create(this, "EC2Subnet10")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Subnet11.getAtt("AvailabilityZone"));
                put("CidrBlock", "10.0.4.0/24");
                put("VpcId", ec2vpc.getRef());
                put("MapPublicIpOnLaunch", false);
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","priv02");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2Subnet11 = CfnResource.Builder.create(this, "EC2Subnet11")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Instance2.getAtt("AvailabilityZone"));
                put("CidrBlock", "10.0.2.0/24");
                put("VpcId", ec2vpc.getRef());
                put("MapPublicIpOnLaunch", true);
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","pub02");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2Subnet12 = CfnResource.Builder.create(this, "EC2Subnet12")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", "us-east-1c");
                put("CidrBlock", "172.31.0.0/20");
                put("VpcId", ec2vpc3.getRef());
                put("MapPublicIpOnLaunch", true);
            }})
            .build();

        CfnResource ec2Subnet13 = CfnResource.Builder.create(this, "EC2Subnet13")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Subnet14.getAtt("AvailabilityZone"));
                put("CidrBlock", "10.0.2.0/24");
                put("VpcId", ec2vpc2.getRef());
                put("MapPublicIpOnLaunch", false);
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-SNPrivada01A");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2Subnet14 = CfnResource.Builder.create(this, "EC2Subnet14")
            .type("AWS::EC2::Subnet")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Instance.getAtt("AvailabilityZone"));
                put("CidrBlock", "10.0.1.0/24");
                put("VpcId", ec2vpc.getRef());
                put("MapPublicIpOnLaunch", true);
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","pub01");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2InternetGateway = CfnResource.Builder.create(this, "EC2InternetGateway")
            .type("AWS::EC2::InternetGateway")
            .properties(new HashMap<String, Object>() {{

                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","gtw01");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2InternetGateway2 = CfnResource.Builder.create(this, "EC2InternetGateway2")
            .type("AWS::EC2::InternetGateway")
            .properties(new HashMap<String, Object>() {{

                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-IGW");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2InternetGateway3 = CfnResource.Builder.create(this, "EC2InternetGateway3")
            .type("AWS::EC2::InternetGateway")
            .properties(new HashMap<String, Object>() {{

            }})
            .build();

        CfnResource ec2eip = CfnResource.Builder.create(this, "EC2EIP")
            .type("AWS::EC2::EIP")
            .properties(new HashMap<String, Object>() {{

                put("Domain", "vpc");
                put("InstanceId", ec2Instance.getRef());
            }})
            .build();

        CfnResource ec2eipAssociation = CfnResource.Builder.create(this, "EC2EIPAssociation")
            .type("AWS::EC2::EIPAssociation")
            .properties(new HashMap<String, Object>() {{

                put("AllocationId", ec2eip.getAtt("AllocationId"));
                put("InstanceId", ec2Instance.getRef());
                put("NetworkInterfaceId", "eni-0862a262bea3dc072");
                put("PrivateIpAddress", ec2Instance.getAtt("PrivateIp"));
            }})
            .build();

        CfnResource ec2eip2 = CfnResource.Builder.create(this, "EC2EIP2")
            .type("AWS::EC2::EIP")
            .properties(new HashMap<String, Object>() {{

                put("Domain", "vpc");
                put("InstanceId", ec2Instance2.getRef());
            }})
            .build();

        CfnResource ec2eipAssociation2 = CfnResource.Builder.create(this, "EC2EIPAssociation2")
            .type("AWS::EC2::EIPAssociation")
            .properties(new HashMap<String, Object>() {{

                put("AllocationId", ec2eip2.getAtt("AllocationId"));
                put("InstanceId", ec2Instance2.getRef());
                put("NetworkInterfaceId", "eni-0588b1ac1c0cef402");
                put("PrivateIpAddress", ec2Instance2.getAtt("PrivateIp"));
            }})
            .build();

        CfnResource ec2dhcpOptions = CfnResource.Builder.create(this, "EC2DHCPOptions")
            .type("AWS::EC2::DHCPOptions")
            .properties(new HashMap<String, Object>() {{

                put("DomainName", "ec2.internal");
            }})
            .build();

        CfnResource ec2vpcdhcpOptionsAssociation = CfnResource.Builder.create(this, "EC2VPCDHCPOptionsAssociation")
            .type("AWS::EC2::VPCDHCPOptionsAssociation")
            .properties(new HashMap<String, Object>() {{

                put("DhcpOptionsId", ec2dhcpOptions.getRef());
                put("VpcId", ec2vpc.getRef());
            }})
            .build();

        CfnResource ec2vpcdhcpOptionsAssociation2 = CfnResource.Builder.create(this, "EC2VPCDHCPOptionsAssociation2")
            .type("AWS::EC2::VPCDHCPOptionsAssociation")
            .properties(new HashMap<String, Object>() {{

                put("DhcpOptionsId", ec2dhcpOptions.getRef());
                put("VpcId", ec2vpc2.getRef());
            }})
            .build();

        CfnResource ec2vpcdhcpOptionsAssociation3 = CfnResource.Builder.create(this, "EC2VPCDHCPOptionsAssociation3")
            .type("AWS::EC2::VPCDHCPOptionsAssociation")
            .properties(new HashMap<String, Object>() {{

                put("DhcpOptionsId", ec2dhcpOptions.getRef());
                put("VpcId", ec2vpc3.getRef());
            }})
            .build();

        CfnResource ec2NetworkAcl = CfnResource.Builder.create(this, "EC2NetworkAcl")
            .type("AWS::EC2::NetworkAcl")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc3.getRef());
            }})
            .build();

        CfnResource ec2NetworkAcl2 = CfnResource.Builder.create(this, "EC2NetworkAcl2")
            .type("AWS::EC2::NetworkAcl")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc.getRef());
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","aclpublic");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2NetworkAcl3 = CfnResource.Builder.create(this, "EC2NetworkAcl3")
            .type("AWS::EC2::NetworkAcl")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc2.getRef());
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-ACL-subnets");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2NetworkAcl4 = CfnResource.Builder.create(this, "EC2NetworkAcl4")
            .type("AWS::EC2::NetworkAcl")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc.getRef());
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","aclprivate");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2NetworkAcl5 = CfnResource.Builder.create(this, "EC2NetworkAcl5")
            .type("AWS::EC2::NetworkAcl")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc.getRef());
            }})
            .build();

        CfnResource ec2NetworkAclEntry = CfnResource.Builder.create(this, "EC2NetworkAclEntry")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "0.0.0.0/0");
                put("Egress", true);
                put("NetworkAclId", ec2NetworkAcl.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 100);
            }})
            .build();

        CfnResource ec2NetworkAclEntry2 = CfnResource.Builder.create(this, "EC2NetworkAclEntry2")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "0.0.0.0/0");
                put("Egress", false);
                put("NetworkAclId", ec2NetworkAcl.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 100);
            }})
            .build();

        CfnResource ec2NetworkAclEntry3 = CfnResource.Builder.create(this, "EC2NetworkAclEntry3")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "0.0.0.0/0");
                put("Egress", true);
                put("NetworkAclId", ec2NetworkAcl2.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 1);
            }})
            .build();

        CfnResource ec2NetworkAclEntry4 = CfnResource.Builder.create(this, "EC2NetworkAclEntry4")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "0.0.0.0/0");
                put("Egress", false);
                put("NetworkAclId", ec2NetworkAcl2.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 1);
            }})
            .build();

        CfnResource ec2NetworkAclEntry5 = CfnResource.Builder.create(this, "EC2NetworkAclEntry5")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "0.0.0.0/0");
                put("Egress", true);
                put("NetworkAclId", ec2NetworkAcl3.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 100);
            }})
            .build();

        CfnResource ec2NetworkAclEntry6 = CfnResource.Builder.create(this, "EC2NetworkAclEntry6")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "0.0.0.0/0");
                put("Egress", false);
                put("NetworkAclId", ec2NetworkAcl3.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 100);
            }})
            .build();

        CfnResource ec2NetworkAclEntry7 = CfnResource.Builder.create(this, "EC2NetworkAclEntry7")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "0.0.0.0/0");
                put("Egress", true);
                put("NetworkAclId", ec2NetworkAcl4.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 1);
            }})
            .build();

        CfnResource ec2NetworkAclEntry8 = CfnResource.Builder.create(this, "EC2NetworkAclEntry8")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "0.0.0.0/0");
                put("Egress", false);
                put("NetworkAclId", ec2NetworkAcl4.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 1);
            }})
            .build();

        CfnResource ec2NetworkAclEntry9 = CfnResource.Builder.create(this, "EC2NetworkAclEntry9")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "0.0.0.0/0");
                put("Egress", true);
                put("NetworkAclId", ec2NetworkAcl5.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 100);
            }})
            .build();

        CfnResource ec2NetworkAclEntry10 = CfnResource.Builder.create(this, "EC2NetworkAclEntry10")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("Egress", true);
                put("Ipv6CidrBlock", "::/0");
                put("NetworkAclId", ec2NetworkAcl5.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 101);
            }})
            .build();

        CfnResource ec2NetworkAclEntry11 = CfnResource.Builder.create(this, "EC2NetworkAclEntry11")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("CidrBlock", "0.0.0.0/0");
                put("Egress", false);
                put("NetworkAclId", ec2NetworkAcl5.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 100);
            }})
            .build();

        CfnResource ec2NetworkAclEntry12 = CfnResource.Builder.create(this, "EC2NetworkAclEntry12")
            .type("AWS::EC2::NetworkAclEntry")
            .properties(new HashMap<String, Object>() {{

                put("Egress", false);
                put("Ipv6CidrBlock", "::/0");
                put("NetworkAclId", ec2NetworkAcl5.getRef());
                put("Protocol", -1);
                put("RuleAction", "allow");
                put("RuleNumber", 101);
            }})
            .build();

        CfnResource ec2RouteTable = CfnResource.Builder.create(this, "EC2RouteTable")
            .type("AWS::EC2::RouteTable")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc3.getRef());
            }})
            .build();

        CfnResource ec2RouteTable2 = CfnResource.Builder.create(this, "EC2RouteTable2")
            .type("AWS::EC2::RouteTable")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc2.getRef());
            }})
            .build();

        CfnResource ec2RouteTable3 = CfnResource.Builder.create(this, "EC2RouteTable3")
            .type("AWS::EC2::RouteTable")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc2.getRef());
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-RTPrivada");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2RouteTable4 = CfnResource.Builder.create(this, "EC2RouteTable4")
            .type("AWS::EC2::RouteTable")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc2.getRef());
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-RTPublica");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2RouteTable5 = CfnResource.Builder.create(this, "EC2RouteTable5")
            .type("AWS::EC2::RouteTable")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc.getRef());
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","priv01");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2RouteTable6 = CfnResource.Builder.create(this, "EC2RouteTable6")
            .type("AWS::EC2::RouteTable")
            .properties(new HashMap<String, Object>() {{

                put("VpcId", ec2vpc.getRef());
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","pub01");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2Route = CfnResource.Builder.create(this, "EC2Route")
            .type("AWS::EC2::Route")
            .properties(new HashMap<String, Object>() {{

                put("DestinationCidrBlock", "0.0.0.0/0");
                put("GatewayId", ec2InternetGateway3.getRef());
                put("RouteTableId", ec2RouteTable.getRef());
            }})
            .build();

        CfnResource ec2Route2 = CfnResource.Builder.create(this, "EC2Route2")
            .type("AWS::EC2::Route")
            .properties(new HashMap<String, Object>() {{

                put("DestinationCidrBlock", "0.0.0.0/0");
                put("GatewayId", ec2InternetGateway2.getRef());
                put("RouteTableId", ec2RouteTable4.getRef());
            }})
            .build();

        CfnResource ec2Route3 = CfnResource.Builder.create(this, "EC2Route3")
            .type("AWS::EC2::Route")
            .properties(new HashMap<String, Object>() {{

                put("DestinationCidrBlock", "0.0.0.0/0");
                put("GatewayId", ec2InternetGateway.getRef());
                put("RouteTableId", ec2RouteTable6.getRef());
            }})
            .build();

        CfnResource ec2Route4 = CfnResource.Builder.create(this, "EC2Route4")
            .type("AWS::EC2::Route")
            .properties(new HashMap<String, Object>() {{

                put("DestinationIpv6CidrBlock", "::/0");
                put("GatewayId", ec2InternetGateway.getRef());
                put("RouteTableId", ec2RouteTable6.getRef());
            }})
            .build();

        CfnResource ec2vpcGatewayAttachment = CfnResource.Builder.create(this, "EC2VPCGatewayAttachment")
            .type("AWS::EC2::VPCGatewayAttachment")
            .properties(new HashMap<String, Object>() {{

                put("InternetGatewayId", ec2InternetGateway.getRef());
                put("VpcId", ec2vpc.getRef());
            }})
            .build();

        CfnResource ec2vpcGatewayAttachment2 = CfnResource.Builder.create(this, "EC2VPCGatewayAttachment2")
            .type("AWS::EC2::VPCGatewayAttachment")
            .properties(new HashMap<String, Object>() {{

                put("InternetGatewayId", ec2InternetGateway2.getRef());
                put("VpcId", ec2vpc2.getRef());
            }})
            .build();

        CfnResource ec2vpcGatewayAttachment3 = CfnResource.Builder.create(this, "EC2VPCGatewayAttachment3")
            .type("AWS::EC2::VPCGatewayAttachment")
            .properties(new HashMap<String, Object>() {{

                put("InternetGatewayId", ec2InternetGateway3.getRef());
                put("VpcId", ec2vpc3.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet12.getRef());
                put("NetworkAclId", ec2NetworkAcl.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation2 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation2")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet3.getRef());
                put("NetworkAclId", ec2NetworkAcl.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation3 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation3")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet9.getRef());
                put("NetworkAclId", ec2NetworkAcl.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation4 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation4")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet8.getRef());
                put("NetworkAclId", ec2NetworkAcl.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation5 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation5")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet4.getRef());
                put("NetworkAclId", ec2NetworkAcl.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation6 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation6")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet5.getRef());
                put("NetworkAclId", ec2NetworkAcl.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation7 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation7")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet11.getRef());
                put("NetworkAclId", ec2NetworkAcl2.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation8 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation8")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet14.getRef());
                put("NetworkAclId", ec2NetworkAcl2.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation9 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation9")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet6.getRef());
                put("NetworkAclId", ec2NetworkAcl3.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation10 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation10")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet2.getRef());
                put("NetworkAclId", ec2NetworkAcl3.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation11 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation11")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet7.getRef());
                put("NetworkAclId", ec2NetworkAcl3.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation12 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation12")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet13.getRef());
                put("NetworkAclId", ec2NetworkAcl3.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation13 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation13")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet10.getRef());
                put("NetworkAclId", ec2NetworkAcl4.getRef());
            }})
            .build();

        CfnResource ec2SubnetNetworkAclAssociation14 = CfnResource.Builder.create(this, "EC2SubnetNetworkAclAssociation14")
            .type("AWS::EC2::SubnetNetworkAclAssociation")
            .properties(new HashMap<String, Object>() {{

                put("SubnetId", ec2Subnet.getRef());
                put("NetworkAclId", ec2NetworkAcl4.getRef());
            }})
            .build();

        CfnResource ec2SubnetRouteTableAssociation = CfnResource.Builder.create(this, "EC2SubnetRouteTableAssociation")
            .type("AWS::EC2::SubnetRouteTableAssociation")
            .properties(new HashMap<String, Object>() {{

                put("RouteTableId", ec2RouteTable3.getRef());
                put("SubnetId", ec2Subnet13.getRef());
            }})
            .build();

        CfnResource ec2SubnetRouteTableAssociation2 = CfnResource.Builder.create(this, "EC2SubnetRouteTableAssociation2")
            .type("AWS::EC2::SubnetRouteTableAssociation")
            .properties(new HashMap<String, Object>() {{

                put("RouteTableId", ec2RouteTable3.getRef());
                put("SubnetId", ec2Subnet7.getRef());
            }})
            .build();

        CfnResource ec2SubnetRouteTableAssociation3 = CfnResource.Builder.create(this, "EC2SubnetRouteTableAssociation3")
            .type("AWS::EC2::SubnetRouteTableAssociation")
            .properties(new HashMap<String, Object>() {{

                put("RouteTableId", ec2RouteTable4.getRef());
                put("SubnetId", ec2Subnet2.getRef());
            }})
            .build();

        CfnResource ec2SubnetRouteTableAssociation4 = CfnResource.Builder.create(this, "EC2SubnetRouteTableAssociation4")
            .type("AWS::EC2::SubnetRouteTableAssociation")
            .properties(new HashMap<String, Object>() {{

                put("RouteTableId", ec2RouteTable4.getRef());
                put("SubnetId", ec2Subnet6.getRef());
            }})
            .build();

        CfnResource ec2SubnetRouteTableAssociation5 = CfnResource.Builder.create(this, "EC2SubnetRouteTableAssociation5")
            .type("AWS::EC2::SubnetRouteTableAssociation")
            .properties(new HashMap<String, Object>() {{

                put("RouteTableId", ec2RouteTable5.getRef());
                put("SubnetId", ec2Subnet.getRef());
            }})
            .build();

        CfnResource ec2SubnetRouteTableAssociation6 = CfnResource.Builder.create(this, "EC2SubnetRouteTableAssociation6")
            .type("AWS::EC2::SubnetRouteTableAssociation")
            .properties(new HashMap<String, Object>() {{

                put("RouteTableId", ec2RouteTable5.getRef());
                put("SubnetId", ec2Subnet10.getRef());
            }})
            .build();

        CfnResource ec2SubnetRouteTableAssociation7 = CfnResource.Builder.create(this, "EC2SubnetRouteTableAssociation7")
            .type("AWS::EC2::SubnetRouteTableAssociation")
            .properties(new HashMap<String, Object>() {{

                put("RouteTableId", ec2RouteTable6.getRef());
                put("SubnetId", ec2Subnet11.getRef());
            }})
            .build();

        CfnResource ec2SubnetRouteTableAssociation8 = CfnResource.Builder.create(this, "EC2SubnetRouteTableAssociation8")
            .type("AWS::EC2::SubnetRouteTableAssociation")
            .properties(new HashMap<String, Object>() {{

                put("RouteTableId", ec2RouteTable6.getRef());
                put("SubnetId", ec2Subnet14.getRef());
            }})
            .build();

        CfnResource route53HostedZone = CfnResource.Builder.create(this, "Route53HostedZone")
            .type("AWS::Route53::HostedZone")
            .properties(new HashMap<String, Object>() {{

                put("Name", route53RecordSet.getRef());
            }})
            .build();

        CfnResource route53RecordSet = CfnResource.Builder.create(this, "Route53RecordSet")
            .type("AWS::Route53::RecordSet")
            .properties(new HashMap<String, Object>() {{

                put("Name", route53RecordSet2.getRef());
                put("Type", "A");
                put("AliasTarget",
                    new HashMap<String, Object>() {{
                        put("HostedZoneId",elasticLoadBalancingV2LoadBalancer2.getAtt("CanonicalHostedZoneID"));
                        put("DNSName","dualstack.g2c-zabbixapplication-169160081.us-east-1.elb.amazonaws.com.");
                        put("EvaluateTargetHealth",false);
                    }}
                );
                put("HostedZoneId", "Z02387991Q073BNH2E0VX");
            }})
            .build();

        CfnResource route53RecordSet2 = CfnResource.Builder.create(this, "Route53RecordSet2")
            .type("AWS::Route53::RecordSet")
            .properties(new HashMap<String, Object>() {{

                put("Name", route53RecordSet3.getRef());
                put("Type", "NS");
                put("TTL", 172800);
                put("ResourceRecords",
                    Arrays.asList(
                        "ns-1083.awsdns-07.org.",
                        "ns-962.awsdns-56.net.",
                        "ns-1732.awsdns-24.co.uk.",
                        "ns-242.awsdns-30.com."
                    )
                );
                put("HostedZoneId", "Z02387991Q073BNH2E0VX");
            }})
            .build();

        CfnResource route53RecordSet3 = CfnResource.Builder.create(this, "Route53RecordSet3")
            .type("AWS::Route53::RecordSet")
            .properties(new HashMap<String, Object>() {{

                put("Name", "g2c-monitor.click.");
                put("Type", "SOA");
                put("TTL", 900);
                put("ResourceRecords",
                    Arrays.asList(
                        "ns-1083.awsdns-07.org. awsdns-hostmaster.amazon.com. 1 7200 900 1209600 86400"
                    )
                );
                put("HostedZoneId", "Z02387991Q073BNH2E0VX");
            }})
            .build();

        CfnResource route53RecordSet4 = CfnResource.Builder.create(this, "Route53RecordSet4")
            .type("AWS::Route53::RecordSet")
            .properties(new HashMap<String, Object>() {{

                put("Name", "_8a864037c38aa05eb272bcfe851700de.g2c-monitor.click.");
                put("Type", "CNAME");
                put("TTL", 300);
                put("ResourceRecords",
                    Arrays.asList(
                        "_9695dfaa379fb31205e33cde5441429f.ghcgkbmxjw.acm-validations.aws."
                    )
                );
                put("HostedZoneId", route53HostedZone.getRef());
            }})
            .build();

        CfnResource route53RecordSet5 = CfnResource.Builder.create(this, "Route53RecordSet5")
            .type("AWS::Route53::RecordSet")
            .properties(new HashMap<String, Object>() {{

                put("Name", "s3.g2c-monitor.click.");
                put("Type", "CNAME");
                put("TTL", 300);
                put("ResourceRecords",
                    Arrays.asList(
                        "http://bruno.eadcloud.com.s3-website-us-east-1.amazonaws.com"
                    )
                );
                put("HostedZoneId", route53HostedZone.getRef());
            }})
            .build();

        CfnResource ec2Instance = CfnResource.Builder.create(this, "EC2Instance")
            .type("AWS::EC2::Instance")
            .properties(new HashMap<String, Object>() {{

                put("ImageId", "ami-0557a15b87f6559cf");
                put("InstanceType", "t2.micro");
                put("KeyName", "G2C-Keypair");
                put("AvailabilityZone", "us-east-1a");
                put("Tenancy", "default");
                put("SubnetId", "subnet-0db767b7c74d52a66");
                put("EbsOptimized", false);
                put("SecurityGroupIds",
                    Arrays.asList(
                        ec2SecurityGroup3.getRef(),
                        ec2SecurityGroup6.getRef()
                    )
                );
                put("SourceDestCheck", true);
                put("BlockDeviceMappings",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("DeviceName","/dev/sda1");
                            put("Ebs",
                                new HashMap<String, Object>() {{
                                    put("Encrypted",false);
                                    put("VolumeSize",8);
                                    put("SnapshotId","snap-0e7030345d3ce3139");
                                    put("VolumeType","gp2");
                                    put("DeleteOnTermination",true);
                                }}
                            );
                        }}

                    )
                );
                put("IamInstanceProfile", iamRole2.getRef());
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-Zabbix-1");
                        }}

                    )
                );
                put("HibernationOptions",
                    new HashMap<String, Object>() {{
                        put("Configured",false);
                    }}
                );
                put("EnclaveOptions",
                    new HashMap<String, Object>() {{
                        put("Enabled",false);
                    }}
                );
            }})
            .build();

        CfnResource ec2Instance2 = CfnResource.Builder.create(this, "EC2Instance2")
            .type("AWS::EC2::Instance")
            .properties(new HashMap<String, Object>() {{

                put("ImageId", "ami-0557a15b87f6559cf");
                put("InstanceType", "t2.micro");
                put("KeyName", "G2C-Keypair");
                put("AvailabilityZone", "us-east-1b");
                put("Tenancy", "default");
                put("SubnetId", "subnet-03a4b89611ab38f6d");
                put("EbsOptimized", false);
                put("SecurityGroupIds",
                    Arrays.asList(
                        ec2SecurityGroup3.getRef(),
                        ec2SecurityGroup6.getRef()
                    )
                );
                put("SourceDestCheck", true);
                put("BlockDeviceMappings",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("DeviceName","/dev/sda1");
                            put("Ebs",
                                new HashMap<String, Object>() {{
                                    put("Encrypted",false);
                                    put("VolumeSize",8);
                                    put("SnapshotId","snap-0e7030345d3ce3139");
                                    put("VolumeType","gp2");
                                    put("DeleteOnTermination",true);
                                }}
                            );
                        }}

                    )
                );
                put("IamInstanceProfile", iamRole2.getRef());
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-Zabbix-2");
                        }}

                    )
                );
                put("HibernationOptions",
                    new HashMap<String, Object>() {{
                        put("Configured",false);
                    }}
                );
                put("EnclaveOptions",
                    new HashMap<String, Object>() {{
                        put("Enabled",false);
                    }}
                );
            }})
            .build();

        CfnResource elasticLoadBalancingV2LoadBalancer = CfnResource.Builder.create(this, "ElasticLoadBalancingV2LoadBalancer")
            .type("AWS::ElasticLoadBalancingV2::LoadBalancer")
            .properties(new HashMap<String, Object>() {{

                put("Name", elasticLoadBalancingV2TargetGroup.getAtt("TargetGroupName"));
                put("Scheme", "internet-facing");
                put("Type", "network");
                put("Subnets",
                    Arrays.asList(
                        ec2Subnet2.getRef(),
                        ec2Subnet6.getRef()
                    )
                );
                put("IpAddressType", "ipv4");
                put("LoadBalancerAttributes",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","deletion_protection.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","load_balancing.cross_zone.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","access_logs.s3.enabled");
                            put("Value","false");
                        }}

                    )
                );
            }})
            .build();

        CfnResource elasticLoadBalancingV2LoadBalancer2 = CfnResource.Builder.create(this, "ElasticLoadBalancingV2LoadBalancer2")
            .type("AWS::ElasticLoadBalancingV2::LoadBalancer")
            .properties(new HashMap<String, Object>() {{

                put("Name", elasticLoadBalancingV2TargetGroup2.getAtt("TargetGroupName"));
                put("Scheme", "internet-facing");
                put("Type", "application");
                put("Subnets",
                    Arrays.asList(
                        "subnet-03a4b89611ab38f6d",
                        "subnet-0db767b7c74d52a66"
                    )
                );
                put("SecurityGroups",
                    Arrays.asList(
                        ec2SecurityGroup3.getRef()
                    )
                );
                put("IpAddressType", "ipv4");
                put("LoadBalancerAttributes",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","access_logs.s3.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","idle_timeout.timeout_seconds");
                            put("Value","2");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","deletion_protection.enabled");
                            put("Value","true");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","routing.http2.enabled");
                            put("Value","true");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","routing.http.drop_invalid_header_fields.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","routing.http.xff_client_port.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","routing.http.preserve_host_header.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","routing.http.xff_header_processing.mode");
                            put("Value","append");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","load_balancing.cross_zone.enabled");
                            put("Value","true");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","routing.http.desync_mitigation_mode");
                            put("Value","defensive");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","waf.fail_open.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","routing.http.x_amzn_tls_version_and_cipher_suite.enabled");
                            put("Value","false");
                        }}

                    )
                );
            }})
            .build();

        CfnResource elasticLoadBalancingV2Listener = CfnResource.Builder.create(this, "ElasticLoadBalancingV2Listener")
            .type("AWS::ElasticLoadBalancingV2::Listener")
            .properties(new HashMap<String, Object>() {{

                put("LoadBalancerArn", elasticLoadBalancingV2LoadBalancer.getRef());
                put("Port", 20051);
                put("Protocol", "TCP");
                put("DefaultActions",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("TargetGroupArn",elasticLoadBalancingV2TargetGroup.getRef());
                            put("Type","forward");
                        }}

                    )
                );
            }})
            .build();

        CfnResource elasticLoadBalancingV2Listener2 = CfnResource.Builder.create(this, "ElasticLoadBalancingV2Listener2")
            .type("AWS::ElasticLoadBalancingV2::Listener")
            .properties(new HashMap<String, Object>() {{

                put("LoadBalancerArn", elasticLoadBalancingV2LoadBalancer.getRef());
                put("Port", 20050);
                put("Protocol", "TCP");
                put("DefaultActions",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("TargetGroupArn",elasticLoadBalancingV2TargetGroup.getRef());
                            put("Type","forward");
                        }}

                    )
                );
            }})
            .build();

        CfnResource elasticLoadBalancingV2Listener3 = CfnResource.Builder.create(this, "ElasticLoadBalancingV2Listener3")
            .type("AWS::ElasticLoadBalancingV2::Listener")
            .properties(new HashMap<String, Object>() {{

                put("LoadBalancerArn", elasticLoadBalancingV2LoadBalancer2.getRef());
                put("Port", 443);
                put("Protocol", "HTTPS");
                put("SslPolicy", "ELBSecurityPolicy-2016-08");
                put("Certificates",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("CertificateArn",certificateManagerCertificate.getRef());
                        }}

                    )
                );
                put("DefaultActions",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Order",1);
                            put("TargetGroupArn",elasticLoadBalancingV2TargetGroup2.getRef());
                            put("Type","forward");
                        }}

                    )
                );
            }})
            .build();

        CfnResource elasticLoadBalancingV2Listener4 = CfnResource.Builder.create(this, "ElasticLoadBalancingV2Listener4")
            .type("AWS::ElasticLoadBalancingV2::Listener")
            .properties(new HashMap<String, Object>() {{

                put("LoadBalancerArn", elasticLoadBalancingV2LoadBalancer2.getRef());
                put("Port", 80);
                put("Protocol", "HTTP");
                put("DefaultActions",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Order",1);
                            put("RedirectConfig",
                                new HashMap<String, Object>() {{
                                    put("Protocol","HTTPS");
                                    put("Port","443");
                                    put("Host","#{host}");
                                    put("Path","/#{path}");
                                    put("Query","#{query}");
                                    put("StatusCode","HTTP_301");
                                }}
                            );
                            put("Type","redirect");
                        }}

                    )
                );
            }})
            .build();

        CfnResource elasticLoadBalancingV2ListenerRule = CfnResource.Builder.create(this, "ElasticLoadBalancingV2ListenerRule")
            .type("AWS::ElasticLoadBalancingV2::ListenerRule")
            .properties(new HashMap<String, Object>() {{

                put("Priority", "2");
                put("ListenerArn", elasticLoadBalancingV2Listener3.getRef());
                put("Conditions",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Field","path-pattern");
                            put("Values",
                                Arrays.asList(
                                    "/"
                                )
                            );
                        }}

                    )
                );
                put("Actions",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Type","redirect");
                            put("Order",1);
                            put("RedirectConfig",
                                new HashMap<String, Object>() {{
                                    put("Protocol","HTTPS");
                                    put("Port","443");
                                    put("Host","#{host}");
                                    put("Path","/zabbix");
                                    put("Query","#{query}");
                                    put("StatusCode","HTTP_301");
                                }}
                            );
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2SecurityGroup = CfnResource.Builder.create(this, "EC2SecurityGroup")
            .type("AWS::EC2::SecurityGroup")
            .properties(new HashMap<String, Object>() {{

                put("GroupDescription", "curso");
                put("GroupName", "MySecGroup");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","IGNORE");
                        }}

                    )
                );
                put("VpcId", ec2vpc.getRef());
                put("SecurityGroupIngress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("FromPort",80);
                            put("IpProtocol","tcp");
                            put("ToPort",80);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIpv6","::/0");
                            put("FromPort",80);
                            put("IpProtocol","tcp");
                            put("ToPort",80);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("FromPort",0);
                            put("IpProtocol","tcp");
                            put("ToPort",65535);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("FromPort",22);
                            put("IpProtocol","tcp");
                            put("ToPort",22);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("FromPort",-1);
                            put("IpProtocol","icmp");
                            put("ToPort",-1);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("SourceSecurityGroupId","sg-04f28d2b8a852cd80");
                            put("SourceSecurityGroupOwnerId","146545546065");
                            put("FromPort",3389);
                            put("IpProtocol","tcp");
                            put("ToPort",3389);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("FromPort",443);
                            put("IpProtocol","tcp");
                            put("ToPort",443);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIpv6","::/0");
                            put("FromPort",443);
                            put("IpProtocol","tcp");
                            put("ToPort",443);
                        }}

                    )
                );
                put("SecurityGroupEgress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("IpProtocol","-1");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIpv6","::/0");
                            put("IpProtocol","-1");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2SecurityGroup2 = CfnResource.Builder.create(this, "EC2SecurityGroup2")
            .type("AWS::EC2::SecurityGroup")
            .properties(new HashMap<String, Object>() {{

                put("GroupDescription", "Security group attached to default to allow EC2 instances with specific security groups attached to connect to the database. Modification could lead to connection loss.");
                put("GroupName", "rds-ec2-1");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","IGNORE");
                        }}

                    )
                );
                put("VpcId", ec2vpc.getRef());
                put("SecurityGroupIngress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("SourceSecurityGroupId",ec2SecurityGroup4.getRef());
                            put("SourceSecurityGroupOwnerId","146545546065");
                            put("Description","Rule to allow connections from EC2 instances with sg-08dab4b2af1908a4a attached");
                            put("FromPort",3306);
                            put("IpProtocol","tcp");
                            put("ToPort",3306);
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2SecurityGroup3 = CfnResource.Builder.create(this, "EC2SecurityGroup3")
            .type("AWS::EC2::SecurityGroup")
            .properties(new HashMap<String, Object>() {{

                put("GroupDescription", "Acesso ao Zabbix");
                put("GroupName", "G2C-SG-EC2");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-SG-EC2");
                        }}

                    )
                );
                put("VpcId", ec2vpc2.getRef());
                put("SecurityGroupIngress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("Description","Acesso HTTP");
                            put("FromPort",80);
                            put("IpProtocol","tcp");
                            put("ToPort",80);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("Description","Acesso remoto via SSH");
                            put("FromPort",22);
                            put("IpProtocol","tcp");
                            put("ToPort",22);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("Description","Portas efemeras");
                            put("FromPort",10050);
                            put("IpProtocol","tcp");
                            put("ToPort",10051);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("Description","Acesso HTTPS");
                            put("FromPort",443);
                            put("IpProtocol","tcp");
                            put("ToPort",443);
                        }}

                    )
                );
                put("SecurityGroupEgress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("Description","Acesso HTTP");
                            put("FromPort",80);
                            put("IpProtocol","tcp");
                            put("ToPort",80);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("Description","Acesso remoto via SSH");
                            put("FromPort",22);
                            put("IpProtocol","tcp");
                            put("ToPort",22);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("Description","Portas efemeras");
                            put("FromPort",10050);
                            put("IpProtocol","tcp");
                            put("ToPort",10051);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("Description","Acesso HTTP");
                            put("FromPort",443);
                            put("IpProtocol","tcp");
                            put("ToPort",443);
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2SecurityGroup4 = CfnResource.Builder.create(this, "EC2SecurityGroup4")
            .type("AWS::EC2::SecurityGroup")
            .properties(new HashMap<String, Object>() {{

                put("GroupDescription", "Security group attached to instances to securely connect to default. Modification could lead to connection loss.");
                put("GroupName", "ec2-rds-1");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","IGNORE");
                        }}

                    )
                );
                put("VpcId", ec2vpc.getRef());
                put("SecurityGroupEgress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("DestinationSecurityGroupId","sg-00f5dab1cc4960e19");
                            put("Description","Rule to allow connections to default from any instances this security group is attached to");
                            put("FromPort",3306);
                            put("IpProtocol","tcp");
                            put("ToPort",3306);
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2SecurityGroup5 = CfnResource.Builder.create(this, "EC2SecurityGroup5")
            .type("AWS::EC2::SecurityGroup")
            .properties(new HashMap<String, Object>() {{

                put("GroupDescription", "default VPC security group");
                put("GroupName", "default");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","IGNORE");
                        }}

                    )
                );
                put("VpcId", ec2vpc3.getRef());
                put("SecurityGroupIngress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("SourceSecurityGroupId","sg-01611e009716d0b72");
                            put("SourceSecurityGroupOwnerId","146545546065");
                            put("IpProtocol","-1");
                        }}

                    )
                );
                put("SecurityGroupEgress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("IpProtocol","-1");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2SecurityGroup6 = CfnResource.Builder.create(this, "EC2SecurityGroup6")
            .type("AWS::EC2::SecurityGroup")
            .properties(new HashMap<String, Object>() {{

                put("GroupDescription", "Security group attached to instances to securely connect to G2C-DBZabbix. Modification could lead to connection loss.");
                put("GroupName", "ec2-rds-2");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-DB-OUT");
                        }}

                    )
                );
                put("VpcId", ec2vpc2.getRef());
                put("SecurityGroupEgress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("DestinationSecurityGroupId",ec2SecurityGroup8.getRef());
                            put("Description","Rule to allow connections to G2C-DBZabbix from any instances this security group is attached to");
                            put("FromPort",3306);
                            put("IpProtocol","tcp");
                            put("ToPort",3306);
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2SecurityGroup7 = CfnResource.Builder.create(this, "EC2SecurityGroup7")
            .type("AWS::EC2::SecurityGroup")
            .properties(new HashMap<String, Object>() {{

                put("GroupDescription", "default VPC security group");
                put("GroupName", "default");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","IGNORE");
                        }}

                    )
                );
                put("VpcId", ec2vpc2.getRef());
                put("SecurityGroupIngress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("SourceSecurityGroupId","sg-0408a7d8d050642f5");
                            put("SourceSecurityGroupOwnerId","146545546065");
                            put("IpProtocol","-1");
                        }}

                    )
                );
                put("SecurityGroupEgress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("IpProtocol","-1");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2SecurityGroup8 = CfnResource.Builder.create(this, "EC2SecurityGroup8")
            .type("AWS::EC2::SecurityGroup")
            .properties(new HashMap<String, Object>() {{

                put("GroupDescription", "Security group attached to G2C-DBZabbix to allow EC2 instances with specific security groups attached to connect to the database. Modification could lead to connection loss.");
                put("GroupName", "rds-ec2-2");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-DB-IN");
                        }}

                    )
                );
                put("VpcId", ec2vpc2.getRef());
                put("SecurityGroupIngress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("SourceSecurityGroupId","sg-068cd21ee22519bab");
                            put("SourceSecurityGroupOwnerId","146545546065");
                            put("Description","Rule to allow connections from EC2 instances with sg-068cd21ee22519bab attached");
                            put("FromPort",3306);
                            put("IpProtocol","tcp");
                            put("ToPort",3306);
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2SecurityGroup9 = CfnResource.Builder.create(this, "EC2SecurityGroup9")
            .type("AWS::EC2::SecurityGroup")
            .properties(new HashMap<String, Object>() {{

                put("GroupDescription", "default VPC security group");
                put("GroupName", "default");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","IGNORE");
                        }}

                    )
                );
                put("VpcId", ec2vpc.getRef());
                put("SecurityGroupIngress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("SourceSecurityGroupId","sg-04448aad3f5c18716");
                            put("SourceSecurityGroupOwnerId","146545546065");
                            put("IpProtocol","-1");
                        }}

                    )
                );
                put("SecurityGroupEgress",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("CidrIp","0.0.0.0/0");
                            put("IpProtocol","-1");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("CidrIpv6","::/0");
                            put("IpProtocol","-1");
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2LaunchTemplate = CfnResource.Builder.create(this, "EC2LaunchTemplate")
            .type("AWS::EC2::LaunchTemplate")
            .properties(new HashMap<String, Object>() {{

                put("LaunchTemplateName", "G2C-Zabbix-1");
                put("LaunchTemplateData",
                    new HashMap<String, Object>() {{
                        put("TagSpecifications",
                            Arrays.asList(

                                new HashMap<String, Object>() {{
                                    put("ResourceType","instance");
                                    put("Tags",
                                        Arrays.asList(

                                            new HashMap<String, Object>() {{
                                                put("Key","Name");
                                                put("Value","G2C-Zabbix-1");
                                            }}

                                        )
                                    );
                                }}

                            )
                        );
                        put("IamInstanceProfile",
                            new HashMap<String, Object>() {{
                                put("Arn","arn:aws:iam::146545546065:instance-profile/AmazonSSMRoleForInstancesQuickSetup");
                            }}
                        );
                        put("KeyName","G2C-Keypair");
                        put("NetworkInterfaces",
                            Arrays.asList(

                                new HashMap<String, Object>() {{
                                    put("DeviceIndex",0);
                                    put("Groups",
                                        Arrays.asList(
                                            ec2SecurityGroup3.getRef(),
                                            ec2SecurityGroup6.getRef()
                                        )
                                    );
                                    put("SubnetId",ec2Subnet6.getRef());
                                }}

                            )
                        );
                        put("ImageId","ami-07ce29758204cd4a6");
                        put("InstanceType","t2.micro");
                    }}
                );
            }})
            .build();

        CfnResource ec2LaunchTemplate2 = CfnResource.Builder.create(this, "EC2LaunchTemplate2")
            .type("AWS::EC2::LaunchTemplate")
            .properties(new HashMap<String, Object>() {{

                put("LaunchTemplateName", "G2C-Zabbix-2");
                put("LaunchTemplateData",
                    new HashMap<String, Object>() {{
                        put("IamInstanceProfile",
                            new HashMap<String, Object>() {{
                                put("Arn","arn:aws:iam::146545546065:instance-profile/AmazonSSMRoleForInstancesQuickSetup");
                            }}
                        );
                        put("KeyName","G2C-Keypair");
                        put("NetworkInterfaces",
                            Arrays.asList(

                                new HashMap<String, Object>() {{
                                    put("DeviceIndex",0);
                                    put("Groups",
                                        Arrays.asList(
                                            ec2SecurityGroup3.getRef(),
                                            ec2SecurityGroup6.getRef()
                                        )
                                    );
                                    put("SubnetId",ec2Subnet2.getRef());
                                }}

                            )
                        );
                        put("ImageId","ami-07ce29758204cd4a6");
                        put("InstanceType","t2.micro");
                    }}
                );
            }})
            .build();

        CfnResource elasticLoadBalancingV2TargetGroup = CfnResource.Builder.create(this, "ElasticLoadBalancingV2TargetGroup")
            .type("AWS::ElasticLoadBalancingV2::TargetGroup")
            .properties(new HashMap<String, Object>() {{

                put("HealthCheckIntervalSeconds", 30);
                put("Port", 80);
                put("Protocol", "TCP");
                put("HealthCheckPort", "traffic-port");
                put("HealthCheckProtocol", "TCP");
                put("HealthCheckTimeoutSeconds", 10);
                put("UnhealthyThresholdCount", 2);
                put("TargetType", "instance");
                put("HealthyThresholdCount", 5);
                put("VpcId", ec2vpc2.getRef());
                put("Name", "G2C-ZabbixNetwork");
                put("HealthCheckEnabled", true);
                put("TargetGroupAttributes",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","proxy_protocol_v2.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","target_group_health.unhealthy_state_routing.minimum_healthy_targets.count");
                            put("Value","1");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","preserve_client_ip.enabled");
                            put("Value","true");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","stickiness.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","target_group_health.unhealthy_state_routing.minimum_healthy_targets.percentage");
                            put("Value","off");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","deregistration_delay.timeout_seconds");
                            put("Value","300");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","target_group_health.dns_failover.minimum_healthy_targets.count");
                            put("Value","1");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","stickiness.type");
                            put("Value","source_ip");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","deregistration_delay.connection_termination.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","load_balancing.cross_zone.enabled");
                            put("Value","use_load_balancer_configuration");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","target_group_health.dns_failover.minimum_healthy_targets.percentage");
                            put("Value","off");
                        }}

                    )
                );
                put("Targets",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Id",ec2Instance.getRef());
                            put("Port",10051);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Id",ec2Instance2.getRef());
                            put("Port",10050);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Id",ec2Instance2.getRef());
                            put("Port",10051);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Id",ec2Instance.getRef());
                            put("Port",10050);
                        }}

                    )
                );
            }})
            .build();

        CfnResource elasticLoadBalancingV2TargetGroup2 = CfnResource.Builder.create(this, "ElasticLoadBalancingV2TargetGroup2")
            .type("AWS::ElasticLoadBalancingV2::TargetGroup")
            .properties(new HashMap<String, Object>() {{

                put("HealthCheckIntervalSeconds", 5);
                put("HealthCheckPath", "/");
                put("Port", 80);
                put("Protocol", "HTTP");
                put("HealthCheckPort", "traffic-port");
                put("HealthCheckProtocol", "HTTP");
                put("HealthCheckTimeoutSeconds", 2);
                put("UnhealthyThresholdCount", 2);
                put("TargetType", "instance");
                put("Matcher",
                    new HashMap<String, Object>() {{
                        put("HttpCode","200");
                    }}
                );
                put("HealthyThresholdCount", 2);
                put("VpcId", ec2vpc2.getRef());
                put("Name", "G2C-ZabbixApplication");
                put("HealthCheckEnabled", true);
                put("TargetGroupAttributes",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","target_group_health.unhealthy_state_routing.minimum_healthy_targets.count");
                            put("Value","1");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","stickiness.enabled");
                            put("Value","false");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","target_group_health.unhealthy_state_routing.minimum_healthy_targets.percentage");
                            put("Value","off");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","deregistration_delay.timeout_seconds");
                            put("Value","0");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","target_group_health.dns_failover.minimum_healthy_targets.count");
                            put("Value","1");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","stickiness.app_cookie.cookie_name");
                            put("Value","");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","stickiness.type");
                            put("Value","lb_cookie");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","stickiness.lb_cookie.duration_seconds");
                            put("Value","86400");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","slow_start.duration_seconds");
                            put("Value","0");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","stickiness.app_cookie.duration_seconds");
                            put("Value","86400");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","target_group_health.dns_failover.minimum_healthy_targets.percentage");
                            put("Value","off");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","load_balancing.cross_zone.enabled");
                            put("Value","use_load_balancer_configuration");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Key","load_balancing.algorithm.type");
                            put("Value","round_robin");
                        }}

                    )
                );
                put("Targets",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Id","i-019ff13bcc11ef2a8");
                            put("Port",80);
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Id","i-09e33ce04e84e7208");
                            put("Port",80);
                        }}

                    )
                );
            }})
            .build();

        CfnResource ec2Volume = CfnResource.Builder.create(this, "EC2Volume")
            .type("AWS::EC2::Volume")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Subnet2.getAtt("AvailabilityZone"));
                put("Encrypted", false);
                put("Size", 8);
                put("VolumeType", "gp2");
                put("SnapshotId", "snap-0e7030345d3ce3139");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-Zabbix-2");
                        }}

                    )
                );
                put("MultiAttachEnabled", false);
            }})
            .build();

        CfnResource ec2Volume2 = CfnResource.Builder.create(this, "EC2Volume2")
            .type("AWS::EC2::Volume")
            .properties(new HashMap<String, Object>() {{

                put("AvailabilityZone", ec2Subnet.getAtt("AvailabilityZone"));
                put("Encrypted", false);
                put("Size", 8);
                put("VolumeType", "gp2");
                put("SnapshotId", "snap-0e7030345d3ce3139");
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","G2C-Zabbix-1");
                        }}

                    )
                );
                put("MultiAttachEnabled", false);
            }})
            .build();

        CfnResource ec2VolumeAttachment = CfnResource.Builder.create(this, "EC2VolumeAttachment")
            .type("AWS::EC2::VolumeAttachment")
            .properties(new HashMap<String, Object>() {{

                put("VolumeId", ec2Volume.getRef());
                put("InstanceId", ec2Instance2.getRef());
                put("Device", "/dev/sda1");
            }})
            .build();

        CfnResource ec2VolumeAttachment2 = CfnResource.Builder.create(this, "EC2VolumeAttachment2")
            .type("AWS::EC2::VolumeAttachment")
            .properties(new HashMap<String, Object>() {{

                put("VolumeId", ec2Volume2.getRef());
                put("InstanceId", ec2Instance.getRef());
                put("Device", "/dev/sda1");
            }})
            .build();

        CfnResource ec2NetworkInterface = CfnResource.Builder.create(this, "EC2NetworkInterface")
            .type("AWS::EC2::NetworkInterface")
            .properties(new HashMap<String, Object>() {{

                put("Description", "RDSNetworkInterface");
                put("PrivateIpAddress", "10.0.2.135");
                put("PrivateIpAddresses",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("PrivateIpAddress","10.0.2.135");
                            put("Primary",true);
                        }}

                    )
                );
                put("SubnetId", ec2Subnet13.getRef());
                put("SourceDestCheck", true);
                put("GroupSet",
                    Arrays.asList(
                        ec2SecurityGroup8.getRef(),
                        ec2SecurityGroup3.getRef()
                    )
                );
            }})
            .build();

        CfnResource ec2NetworkInterface2 = CfnResource.Builder.create(this, "EC2NetworkInterface2")
            .type("AWS::EC2::NetworkInterface")
            .properties(new HashMap<String, Object>() {{

                put("Description", "ELB net/G2C-ZabbixNetwork/36342b03712a720b");
                put("PrivateIpAddress", "10.0.1.216");
                put("PrivateIpAddresses",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("PrivateIpAddress","10.0.1.216");
                            put("Primary",true);
                        }}

                    )
                );
                put("SubnetId", ec2Subnet6.getRef());
                put("SourceDestCheck", false);
            }})
            .build();

        CfnResource ec2NetworkInterface3 = CfnResource.Builder.create(this, "EC2NetworkInterface3")
            .type("AWS::EC2::NetworkInterface")
            .properties(new HashMap<String, Object>() {{

                put("Description", "");
                put("PrivateIpAddress", ec2Instance.getAtt("PrivateIp"));
                put("PrivateIpAddresses",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("PrivateIpAddress",ec2Instance.getAtt("PrivateIp"));
                            put("Primary",true);
                        }}

                    )
                );
                put("SubnetId", ec2Subnet6.getRef());
                put("SourceDestCheck", true);
                put("GroupSet",
                    Arrays.asList(
                        ec2SecurityGroup3.getRef(),
                        ec2SecurityGroup6.getRef()
                    )
                );
            }})
            .build();

        CfnResource ec2NetworkInterface4 = CfnResource.Builder.create(this, "EC2NetworkInterface4")
            .type("AWS::EC2::NetworkInterface")
            .properties(new HashMap<String, Object>() {{

                put("Description", "ELB app/G2C-ZabbixApplication/7ab6443ed5300cd4");
                put("PrivateIpAddress", "10.0.1.158");
                put("PrivateIpAddresses",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("PrivateIpAddress","10.0.1.158");
                            put("Primary",true);
                        }}

                    )
                );
                put("SubnetId", ec2Subnet6.getRef());
                put("SourceDestCheck", true);
                put("GroupSet",
                    Arrays.asList(
                        ec2SecurityGroup3.getRef()
                    )
                );
            }})
            .build();

        CfnResource ec2NetworkInterface5 = CfnResource.Builder.create(this, "EC2NetworkInterface5")
            .type("AWS::EC2::NetworkInterface")
            .properties(new HashMap<String, Object>() {{

                put("Description", "ELB app/G2C-ZabbixApplication/7ab6443ed5300cd4");
                put("PrivateIpAddress", "10.0.3.47");
                put("PrivateIpAddresses",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("PrivateIpAddress","10.0.3.47");
                            put("Primary",true);
                        }}

                    )
                );
                put("SubnetId", ec2Subnet2.getRef());
                put("SourceDestCheck", true);
                put("GroupSet",
                    Arrays.asList(
                        ec2SecurityGroup3.getRef()
                    )
                );
            }})
            .build();

        CfnResource ec2NetworkInterface6 = CfnResource.Builder.create(this, "EC2NetworkInterface6")
            .type("AWS::EC2::NetworkInterface")
            .properties(new HashMap<String, Object>() {{

                put("Description", "ELB net/G2C-ZabbixNetwork/36342b03712a720b");
                put("PrivateIpAddress", "10.0.3.176");
                put("PrivateIpAddresses",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("PrivateIpAddress","10.0.3.176");
                            put("Primary",true);
                        }}

                    )
                );
                put("SubnetId", ec2Subnet2.getRef());
                put("SourceDestCheck", false);
            }})
            .build();

        CfnResource ec2NetworkInterface7 = CfnResource.Builder.create(this, "EC2NetworkInterface7")
            .type("AWS::EC2::NetworkInterface")
            .properties(new HashMap<String, Object>() {{

                put("Description", "");
                put("PrivateIpAddress", ec2Instance2.getAtt("PrivateIp"));
                put("PrivateIpAddresses",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("PrivateIpAddress",ec2Instance2.getAtt("PrivateIp"));
                            put("Primary",true);
                        }}

                    )
                );
                put("SubnetId", ec2Subnet2.getRef());
                put("SourceDestCheck", true);
                put("GroupSet",
                    Arrays.asList(
                        ec2SecurityGroup3.getRef(),
                        ec2SecurityGroup6.getRef()
                    )
                );
            }})
            .build();

        CfnResource ec2NetworkInterfaceAttachment = CfnResource.Builder.create(this, "EC2NetworkInterfaceAttachment")
            .type("AWS::EC2::NetworkInterfaceAttachment")
            .properties(new HashMap<String, Object>() {{

                put("NetworkInterfaceId", "eni-0862a262bea3dc072");
                put("DeviceIndex", 0);
                put("InstanceId", ec2Instance.getRef());
                put("DeleteOnTermination", true);
            }})
            .build();

        CfnResource ec2NetworkInterfaceAttachment2 = CfnResource.Builder.create(this, "EC2NetworkInterfaceAttachment2")
            .type("AWS::EC2::NetworkInterfaceAttachment")
            .properties(new HashMap<String, Object>() {{

                put("NetworkInterfaceId", "eni-0588b1ac1c0cef402");
                put("DeviceIndex", 0);
                put("InstanceId", ec2Instance2.getRef());
                put("DeleteOnTermination", true);
            }})
            .build();

        CfnResource ec2KeyPair = CfnResource.Builder.create(this, "EC2KeyPair")
            .type("AWS::EC2::KeyPair")
            .properties(new HashMap<String, Object>() {{

                put("KeyName", "default");
                put("KeyType", "rsa");
            }})
            .build();

        CfnResource ec2KeyPair2 = CfnResource.Builder.create(this, "EC2KeyPair2")
            .type("AWS::EC2::KeyPair")
            .properties(new HashMap<String, Object>() {{

                put("KeyName", "G2C-Keypair");
                put("KeyType", "rsa");
            }})
            .build();

        CfnResource lambdaFunction = CfnResource.Builder.create(this, "LambdaFunction")
            .type("AWS::Lambda::Function")
            .properties(new HashMap<String, Object>() {{

                put("Description", "");
                put("FunctionName", "agent_lambda");
                put("Handler", "agent_lambda.FunctionRequestHandler::execute");
                put("Architectures",
                    Arrays.asList(
                        "x86_64"
                    )
                );
                put("Code",
                    new HashMap<String, Object>() {{
                        put("S3Bucket","prod-iad-c1-djusa-tasks");
                        put("S3Key","/snapshots/146545546065/agent_lambda-c3cdbdb7-da4c-49e2-812e-8452afc85efc");
                        put("S3ObjectVersion","jZvxZaXNlkopsbBd8EineeE5gBHp94I7");
                    }}
                );
                put("MemorySize", 1024);
                put("Role", "arn:aws:iam::146545546065:role/service-role/agent_lambda-role-ans62qfz");
                put("Runtime", "java11");
                put("Timeout", 14);
                put("TracingConfig",
                    new HashMap<String, Object>() {{
                        put("Mode","PassThrough");
                    }}
                );
                put("EphemeralStorage",
                    new HashMap<String, Object>() {{
                        put("Size",512);
                    }}
                );
                put("Tags",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Key","Name");
                            put("Value","agent_lambda");
                        }}

                    )
                );
            }})
            .build();

        CfnResource s3Bucket = CfnResource.Builder.create(this, "S3Bucket")
            .type("AWS::S3::Bucket")
            .properties(new HashMap<String, Object>() {{

                put("BucketName", "bruno.eadcloud.com");
                put("BucketEncryption",
                    new HashMap<String, Object>() {{
                        put("ServerSideEncryptionConfiguration",
                            Arrays.asList(

                                new HashMap<String, Object>() {{
                                    put("ServerSideEncryptionByDefault",
                                        new HashMap<String, Object>() {{
                                            put("SSEAlgorithm","AES256");
                                        }}
                                    );
                                    put("BucketKeyEnabled",true);
                                }}

                            )
                        );
                    }}
                );
                put("WebsiteConfiguration",
                    new HashMap<String, Object>() {{
                        put("IndexDocument","index.html");
                        put("ErrorDocument","error.html");
                    }}
                );
            }})
            .build();

        CfnResource s3Bucket2 = CfnResource.Builder.create(this, "S3Bucket2")
            .type("AWS::S3::Bucket")
            .properties(new HashMap<String, Object>() {{

                put("BucketName", "g2c-zabbix-agent");
                put("BucketEncryption",
                    new HashMap<String, Object>() {{
                        put("ServerSideEncryptionConfiguration",
                            Arrays.asList(

                                new HashMap<String, Object>() {{
                                    put("ServerSideEncryptionByDefault",
                                        new HashMap<String, Object>() {{
                                            put("SSEAlgorithm","AES256");
                                        }}
                                    );
                                    put("BucketKeyEnabled",true);
                                }}

                            )
                        );
                    }}
                );
                put("VersioningConfiguration",
                    new HashMap<String, Object>() {{
                        put("Status","Enabled");
                    }}
                );
            }})
            .build();

        CfnResource s3BucketPolicy = CfnResource.Builder.create(this, "S3BucketPolicy")
            .type("AWS::S3::BucketPolicy")
            .properties(new HashMap<String, Object>() {{

                put("Bucket", s3Bucket.getRef());
                put("PolicyDocument",
                    new HashMap<String, Object>() {{
                        put("Version","2012-10-17");
                        put("Id","Policy1679437623798");
                        put("Statement",
                            Arrays.asList(

                                new HashMap<String, Object>() {{
                                    put("Sid","Stmt1679437620465");
                                    put("Effect","Allow");
                                    put("Principal","*");
                                    put("Action","s3:GetObject");
                                    put("Resource","arn:aws:s3:::bruno.eadcloud.com/*");
                                }}

                            )
                        );
                    }}
                );
            }})
            .build();

        CfnResource s3StorageLens = CfnResource.Builder.create(this, "S3StorageLens")
            .type("AWS::S3::StorageLens")
            .properties(new HashMap<String, Object>() {{

                put("StorageLensConfiguration",
                    new HashMap<String, Object>() {{
                        put("AccountLevel",
                            new HashMap<String, Object>() {{
                                put("BucketLevel",
                                    new HashMap<String, Object>() {{

                                    }}
                                );
                            }}
                        );
                        put("Id","default-account-dashboard");
                        put("IsEnabled",true);
                    }}
                );
            }})
            .build();

        CfnResource rdsdbInstance = CfnResource.Builder.create(this, "RDSDBInstance")
            .type("AWS::RDS::DBInstance")
            .properties(new HashMap<String, Object>() {{

                put("DBInstanceIdentifier", "g2c-dbzabbix");
                put("AllocatedStorage", 10);
                put("DBInstanceClass", "db.t3.micro");
                put("Engine", "mysql");
                put("MasterUsername", "admin");
                put("MasterUserPassword", "REPLACEME");
                put("DBName", iamPolicy3.getRef());
                put("PreferredBackupWindow", "05:06-05:36");
                put("BackupRetentionPeriod", 0);
                put("AvailabilityZone", "us-east-1a");
                put("PreferredMaintenanceWindow", "mon:04:20-mon:04:50");
                put("MultiAZ", false);
                put("EngineVersion", "8.0.32");
                put("AutoMinorVersionUpgrade", true);
                put("LicenseModel", "general-public-license");
                put("PubliclyAccessible", false);
                put("StorageType", "gp2");
                put("Port", 3306);
                put("StorageEncrypted", false);
                put("CopyTagsToSnapshot", true);
                put("MonitoringInterval", 0);
                put("EnableIAMDatabaseAuthentication", false);
                put("EnablePerformanceInsights", false);
                put("DeletionProtection", true);
                put("DBSubnetGroupName", "g2c-dbzabbix");
                put("VPCSecurityGroups",
                    Arrays.asList(
                        "sg-06427a58b1d30aefd",
                        ec2SecurityGroup3.getRef()
                    )
                );
                put("MaxAllocatedStorage", 50);
                put("DBParameterGroupName", rdsdbParameterGroup.getRef());
                put("OptionGroupName", "default:mysql-8-0");
                put("CACertificateIdentifier", "rds-ca-2019");
            }})
            .build();

        CfnResource rdsdbSubnetGroup = CfnResource.Builder.create(this, "RDSDBSubnetGroup")
            .type("AWS::RDS::DBSubnetGroup")
            .properties(new HashMap<String, Object>() {{

                put("DBSubnetGroupDescription", "db-default");
                put("DBSubnetGroupName", "db-default");
                put("SubnetIds",
                    Arrays.asList(
                        ec2Subnet.getRef(),
                        ec2Subnet10.getRef()
                    )
                );
            }})
            .build();

        CfnResource rdsdbSubnetGroup2 = CfnResource.Builder.create(this, "RDSDBSubnetGroup2")
            .type("AWS::RDS::DBSubnetGroup")
            .properties(new HashMap<String, Object>() {{

                put("DBSubnetGroupDescription", "Banco de Dados");
                put("DBSubnetGroupName", rdsdbInstance.getRef());
                put("SubnetIds",
                    Arrays.asList(
                        ec2Subnet13.getRef(),
                        ec2Subnet7.getRef()
                    )
                );
            }})
            .build();

        CfnResource rdsdbParameterGroup = CfnResource.Builder.create(this, "RDSDBParameterGroup")
            .type("AWS::RDS::DBParameterGroup")
            .properties(new HashMap<String, Object>() {{

                put("DBClusterParameterGroupName", "g2c-zabbix");
                put("Description", "config group for zabbix.");
                put("Family", "mysql8.0");
                put("Parameters",
                    new HashMap<String, Object>() {{
                        put("log_bin_trust_function_creators","0");
                    }}
                );
            }})
            .build();

        CfnResource elastiCacheUser = CfnResource.Builder.create(this, "ElastiCacheUser")
            .type("AWS::ElastiCache::User")
            .properties(new HashMap<String, Object>() {{

                put("UserId", "default");
                put("UserName", "default");
                put("Engine", "redis");
                put("AccessString", "on ~* +@all");
                put("NoPasswordRequired", true);
            }})
            .build();

        CfnResource opsWorksUserProfile = CfnResource.Builder.create(this, "OpsWorksUserProfile")
            .type("AWS::OpsWorks::UserProfile")
            .properties(new HashMap<String, Object>() {{

                put("AllowSelfManagement", false);
                put("IamUserArn", "arn:aws:iam::146545546065:user/dev");
                put("SshUsername", "dev");
            }})
            .build();

        CfnResource snsTopic = CfnResource.Builder.create(this, "SNSTopic")
            .type("AWS::SNS::Topic")
            .properties(new HashMap<String, Object>() {{

                put("DisplayName", "G2C-ZabbixAlerta");
                put("TopicName", "G2C-ZabbixAlerta");
            }})
            .build();

        CfnResource snsTopic2 = CfnResource.Builder.create(this, "SNSTopic2")
            .type("AWS::SNS::Topic")
            .properties(new HashMap<String, Object>() {{

                put("DisplayName", "");
                put("TopicName", "fatura");
            }})
            .build();

        CfnResource snsTopicPolicy = CfnResource.Builder.create(this, "SNSTopicPolicy")
            .type("AWS::SNS::TopicPolicy")
            .properties(new HashMap<String, Object>() {{

                put("PolicyDocument", "{\"Version\":\"2008-10-17\",\"Id\":\"__default_policy_ID\",\"Statement\":[{\"Sid\":\"__default_statement_ID\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":\"*\"},\"Action\":[\"SNS:GetTopicAttributes\",\"SNS:SetTopicAttributes\",\"SNS:AddPermission\",\"SNS:RemovePermission\",\"SNS:DeleteTopic\",\"SNS:Subscribe\",\"SNS:ListSubscriptionsByTopic\",\"SNS:Publish\"],\"Resource\":\"arn:aws:sns:us-east-1:146545546065:G2C-ZabbixAlerta\",\"Condition\":{\"StringEquals\":{\"AWS:SourceOwner\":\"146545546065\"}}}]}");
                put("Topics",
                    Arrays.asList(
                        snsTopic.getRef()
                    )
                );
            }})
            .build();

        CfnResource snsTopicPolicy2 = CfnResource.Builder.create(this, "SNSTopicPolicy2")
            .type("AWS::SNS::TopicPolicy")
            .properties(new HashMap<String, Object>() {{

                put("PolicyDocument", "{\"Version\":\"2008-10-17\",\"Id\":\"__default_policy_ID\",\"Statement\":[{\"Sid\":\"__default_statement_ID\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":\"*\"},\"Action\":[\"SNS:GetTopicAttributes\",\"SNS:SetTopicAttributes\",\"SNS:AddPermission\",\"SNS:RemovePermission\",\"SNS:DeleteTopic\",\"SNS:Subscribe\",\"SNS:ListSubscriptionsByTopic\",\"SNS:Publish\"],\"Resource\":\"arn:aws:sns:us-east-1:146545546065:fatura\",\"Condition\":{\"StringEquals\":{\"AWS:SourceOwner\":\"146545546065\"}}}]}");
                put("Topics",
                    Arrays.asList(
                        snsTopic2.getRef()
                    )
                );
            }})
            .build();

        CfnResource snsSubscription = CfnResource.Builder.create(this, "SNSSubscription")
            .type("AWS::SNS::Subscription")
            .properties(new HashMap<String, Object>() {{

                put("TopicArn", snsTopic.getRef());
                put("Endpoint", "bruno.taboada@gmail.com");
                put("Protocol", "email");
                put("Region", "us-east-1");
            }})
            .build();

        CfnResource snsSubscription2 = CfnResource.Builder.create(this, "SNSSubscription2")
            .type("AWS::SNS::Subscription")
            .properties(new HashMap<String, Object>() {{

                put("TopicArn", snsTopic2.getRef());
                put("Endpoint", "bruno.taboada@gmail.com");
                put("Protocol", "email");
                put("Region", "us-east-1");
            }})
            .build();

        CfnResource snsSubscription3 = CfnResource.Builder.create(this, "SNSSubscription3")
            .type("AWS::SNS::Subscription")
            .properties(new HashMap<String, Object>() {{

                put("TopicArn", snsTopic.getRef());
                put("Endpoint", "bruno.taboada@gmail.com");
                put("Protocol", "email");
                put("Region", "us-east-1");
            }})
            .build();

        CfnResource snsSubscription4 = CfnResource.Builder.create(this, "SNSSubscription4")
            .type("AWS::SNS::Subscription")
            .properties(new HashMap<String, Object>() {{

                put("TopicArn", snsTopic2.getRef());
                put("Endpoint", "bruno.taboada@gmail.com");
                put("Protocol", "email");
                put("Region", "us-east-1");
            }})
            .build();

        CfnResource cloudWatchAlarm = CfnResource.Builder.create(this, "CloudWatchAlarm")
            .type("AWS::CloudWatch::Alarm")
            .properties(new HashMap<String, Object>() {{

                put("AlarmName", "fature_alerta");
                put("AlarmDescription", "Alarme de fatura.");
                put("ActionsEnabled", true);
                put("AlarmActions",
                    Arrays.asList(
                        snsTopic2.getRef()
                    )
                );
                put("MetricName", "EstimatedCharges");
                put("Namespace", "AWS/Billing");
                put("Statistic", "Maximum");
                put("Dimensions",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Name","Currency");
                            put("Value","USD");
                        }}

                    )
                );
                put("Period", 21600);
                put("EvaluationPeriods", 1);
                put("DatapointsToAlarm", 1);
                put("Threshold", 10);
                put("ComparisonOperator", "GreaterThanThreshold");
                put("TreatMissingData", "missing");
            }})
            .build();

        CfnResource logsLogGroup = CfnResource.Builder.create(this, "LogsLogGroup")
            .type("AWS::Logs::LogGroup")
            .properties(new HashMap<String, Object>() {{

                put("LogGroupName", "/aws/lambda/agent_lambda");
            }})
            .build();

        CfnResource logsLogGroup2 = CfnResource.Builder.create(this, "LogsLogGroup2")
            .type("AWS::Logs::LogGroup")
            .properties(new HashMap<String, Object>() {{

                put("LogGroupName", "/aws/rds/instance/zabbix/error");
            }})
            .build();

        CfnResource logsLogGroup3 = CfnResource.Builder.create(this, "LogsLogGroup3")
            .type("AWS::Logs::LogGroup")
            .properties(new HashMap<String, Object>() {{

                put("LogGroupName", "RDSOSMetrics");
                put("RetentionInDays", 30);
            }})
            .build();

        CfnResource neptuneDbSubnetGroup = CfnResource.Builder.create(this, "NeptuneDBSubnetGroup")
            .type("AWS::Neptune::DBSubnetGroup")
            .properties(new HashMap<String, Object>() {{

                put("DBSubnetGroupName", "db-default");
                put("DBSubnetGroupDescription", "db-default");
                put("SubnetIds",
                    Arrays.asList(
                        ec2Subnet.getRef(),
                        ec2Subnet10.getRef()
                    )
                );
            }})
            .build();

        CfnResource neptuneDbSubnetGroup2 = CfnResource.Builder.create(this, "NeptuneDBSubnetGroup2")
            .type("AWS::Neptune::DBSubnetGroup")
            .properties(new HashMap<String, Object>() {{

                put("DBSubnetGroupName", rdsdbInstance.getRef());
                put("DBSubnetGroupDescription", "Banco de Dados");
                put("SubnetIds",
                    Arrays.asList(
                        ec2Subnet13.getRef(),
                        ec2Subnet7.getRef()
                    )
                );
            }})
            .build();

        CfnResource docDbdbSubnetGroup = CfnResource.Builder.create(this, "DocDBDBSubnetGroup")
            .type("AWS::DocDB::DBSubnetGroup")
            .properties(new HashMap<String, Object>() {{

                put("DBSubnetGroupName", "db-default");
                put("DBSubnetGroupDescription", "db-default");
                put("SubnetIds",
                    Arrays.asList(
                        ec2Subnet.getRef(),
                        ec2Subnet10.getRef()
                    )
                );
            }})
            .build();

        CfnResource docDbdbSubnetGroup2 = CfnResource.Builder.create(this, "DocDBDBSubnetGroup2")
            .type("AWS::DocDB::DBSubnetGroup")
            .properties(new HashMap<String, Object>() {{

                put("DBSubnetGroupName", rdsdbInstance.getRef());
                put("DBSubnetGroupDescription", "Banco de Dados");
                put("SubnetIds",
                    Arrays.asList(
                        ec2Subnet13.getRef(),
                        ec2Subnet7.getRef()
                    )
                );
            }})
            .build();

        CfnResource budgetsBudget = CfnResource.Builder.create(this, "BudgetsBudget")
            .type("AWS::Budgets::Budget")
            .properties(new HashMap<String, Object>() {{

                put("Budget",
                    new HashMap<String, Object>() {{
                        put("BudgetLimit",
                            new HashMap<String, Object>() {{
                                put("Amount","50.0");
                                put("Unit","USD");
                            }}
                        );
                        put("TimePeriod",
                            new HashMap<String, Object>() {{
                                put("Start","2023-03-01T00:00:00.000Z");
                                put("End","2087-06-15T00:00:00.000Z");
                            }}
                        );
                        put("TimeUnit","MONTHLY");
                        put("CostFilters",
                            new HashMap<String, Object>() {{

                            }}
                        );
                        put("BudgetName","My Zero-Spend Budget");
                        put("CostTypes",
                            new HashMap<String, Object>() {{
                                put("IncludeTax",true);
                                put("IncludeSubscription",true);
                                put("UseBlended",false);
                                put("IncludeRefund",false);
                                put("IncludeCredit",false);
                                put("IncludeUpfront",true);
                                put("IncludeRecurring",true);
                                put("IncludeOtherSubscription",true);
                                put("IncludeSupport",true);
                                put("IncludeDiscount",true);
                                put("UseAmortized",false);
                            }}
                        );
                        put("BudgetType","COST");
                    }}
                );
            }})
            .build();

        CfnResource certificateManagerCertificate = CfnResource.Builder.create(this, "CertificateManagerCertificate")
            .type("AWS::CertificateManager::Certificate")
            .properties(new HashMap<String, Object>() {{

                put("DomainName", "g2c-monitor.click");
                put("SubjectAlternativeNames",
                    Arrays.asList(
                        "g2c-monitor.click"
                    )
                );
                put("DomainValidationOptions",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("DomainName","g2c-monitor.click");
                            put("ValidationDomain","g2c-monitor.click");
                        }}

                    )
                );
                put("CertificateTransparencyLoggingPreference", "ENABLED");
            }})
            .build();

        CfnResource schedulerSchedule = CfnResource.Builder.create(this, "SchedulerSchedule")
            .type("AWS::Scheduler::Schedule")
            .properties(new HashMap<String, Object>() {{

                put("Name", "cpu-metric");
                put("Description", "");
                put("State", "DISABLED");
                put("GroupName", "default");
                put("ScheduleExpression", "rate(1 minutes)");
                put("ScheduleExpressionTimezone", "America/Montreal");
                put("FlexibleTimeWindow",
                    new HashMap<String, Object>() {{
                        put("Mode","OFF");
                    }}
                );
                put("Target",
                    new HashMap<String, Object>() {{
                        put("Arn",lambdaFunction.getAtt("Arn"));
                        put("Input","
                        {
                            "path": "/",
                            "httpMethod": "GET",
                            "headers": {
                            "Accept": "application/json"
                        },
                            "body": "cpu"
                        }
");
                        put("RetryPolicy",
                            new HashMap<String, Object>() {{
                                put("MaximumEventAgeInSeconds",86400);
                                put("MaximumRetryAttempts",185);
                            }}
                        );
                        put("RoleArn","arn:aws:iam::146545546065:role/service-role/Amazon_EventBridge_Scheduler_LAMBDA_8487e93e2e");
                    }}
                );
            }})
            .build();

        CfnResource schedulerSchedule2 = CfnResource.Builder.create(this, "SchedulerSchedule2")
            .type("AWS::Scheduler::Schedule")
            .properties(new HashMap<String, Object>() {{

                put("Name", "ec2-metric");
                put("Description", "");
                put("State", "DISABLED");
                put("GroupName", "default");
                put("ScheduleExpression", "rate(5 minutes)");
                put("ScheduleExpressionTimezone", "America/Montreal");
                put("FlexibleTimeWindow",
                    new HashMap<String, Object>() {{
                        put("Mode","OFF");
                    }}
                );
                put("Target",
                    new HashMap<String, Object>() {{
                        put("Arn",lambdaFunction.getAtt("Arn"));
                        put("Input","
                        {
                            "path": "/",
                            "httpMethod": "GET",
                            "headers": {
                            "Accept": "application/json"
                        },
                            "body": "ec2"
                        }
");
                        put("RetryPolicy",
                            new HashMap<String, Object>() {{
                                put("MaximumEventAgeInSeconds",86400);
                                put("MaximumRetryAttempts",0);
                            }}
                        );
                        put("RoleArn","arn:aws:iam::146545546065:role/service-role/Amazon_EventBridge_Scheduler_LAMBDA_9e960d94d1");
                    }}
                );
            }})
            .build();

        CfnResource schedulerSchedule3 = CfnResource.Builder.create(this, "SchedulerSchedule3")
            .type("AWS::Scheduler::Schedule")
            .properties(new HashMap<String, Object>() {{

                put("Name", "lambda-metric");
                put("Description", "");
                put("State", "ENABLED");
                put("GroupName", "default");
                put("ScheduleExpression", "rate(4 minutes)");
                put("ScheduleExpressionTimezone", "America/Montreal");
                put("FlexibleTimeWindow",
                    new HashMap<String, Object>() {{
                        put("Mode","OFF");
                    }}
                );
                put("Target",
                    new HashMap<String, Object>() {{
                        put("Arn",lambdaFunction.getAtt("Arn"));
                        put("Input","
                        {
                            "path": "/",
                            "httpMethod": "GET",
                            "headers": {
                            "Accept": "application/json"
                        },
                            "body": "lambda"
                        }
");
                        put("RetryPolicy",
                            new HashMap<String, Object>() {{
                                put("MaximumEventAgeInSeconds",86400);
                                put("MaximumRetryAttempts",0);
                            }}
                        );
                        put("RoleArn","arn:aws:iam::146545546065:role/service-role/Amazon_EventBridge_Scheduler_LAMBDA_8a1525404a");
                    }}
                );
            }})
            .build();

        CfnResource xRayGroup = CfnResource.Builder.create(this, "XRayGroup")
            .type("AWS::XRay::Group")
            .properties(new HashMap<String, Object>() {{

                put("GroupName", "Default");
                put("InsightsConfiguration",
                    new HashMap<String, Object>() {{
                        put("InsightsEnabled",false);
                        put("NotificationsEnabled",false);
                    }}
                );
            }})
            .build();

        CfnResource ceAnomalyMonitor = CfnResource.Builder.create(this, "CEAnomalyMonitor")
            .type("AWS::CE::AnomalyMonitor")
            .properties(new HashMap<String, Object>() {{

                put("MonitorName", "cost_monitor");
                put("MonitorType", "CUSTOM");
                put("MonitorSpecification", "{\"Dimensions\":{\"Key\":\"LINKED_ACCOUNT\",\"Values\":[\"146545546065\"]}}");
            }})
            .build();

        CfnResource ceAnomalySubscription = CfnResource.Builder.create(this, "CEAnomalySubscription")
            .type("AWS::CE::AnomalySubscription")
            .properties(new HashMap<String, Object>() {{

                put("SubscriptionName", "Bruno Taboada");
                put("Threshold", 15);
                put("Frequency", "IMMEDIATE");
                put("MonitorArnList",
                    Arrays.asList(
                        ceAnomalyMonitor.getRef()
                    )
                );
                put("Subscribers",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Address",snsTopic2.getRef());
                            put("Type","SNS");
                            put("Status","CONFIRMED");
                        }}

                    )
                );
            }})
            .build();

        CfnResource fisExperimentTemplate = CfnResource.Builder.create(this, "FISExperimentTemplate")
            .type("AWS::FIS::ExperimentTemplate")
            .properties(new HashMap<String, Object>() {{

                put("Description", "HATest");
                put("Targets",
                    new HashMap<String, Object>() {{
                        put("ec2-1",
                            new HashMap<String, Object>() {{
                                put("resourceType","aws:ec2:instance");
                                put("resourceArns",
                                    Arrays.asList(
                                        "arn:aws:ec2:us-east-1:146545546065:instance/i-09e33ce04e84e7208"
                                    )
                                );
                                put("selectionMode","ALL");
                            }}
                        );
                        put("ec2-2",
                            new HashMap<String, Object>() {{
                                put("resourceType","aws:ec2:instance");
                                put("resourceArns",
                                    Arrays.asList(
                                        "arn:aws:ec2:us-east-1:146545546065:instance/i-019ff13bcc11ef2a8"
                                    )
                                );
                                put("selectionMode","ALL");
                            }}
                        );
                    }}
                );
                put("Actions",
                    new HashMap<String, Object>() {{
                        put("ec2-stop-1",
                            new HashMap<String, Object>() {{
                                put("actionId","aws:ec2:stop-instances");
                                put("parameters",
                                    new HashMap<String, Object>() {{
                                        put("startInstancesAfterDuration","PT3M");
                                    }}
                                );
                                put("targets",
                                    new HashMap<String, Object>() {{
                                        put("Instances","ec2-1");
                                    }}
                                );
                            }}
                        );
                        put("ec2-stop-2",
                            new HashMap<String, Object>() {{
                                put("actionId","aws:ec2:stop-instances");
                                put("parameters",
                                    new HashMap<String, Object>() {{
                                        put("startInstancesAfterDuration","PT3M");
                                    }}
                                );
                                put("targets",
                                    new HashMap<String, Object>() {{
                                        put("Instances","ec2-2");
                                    }}
                                );
                                put("startAfter",
                                    Arrays.asList(
                                        "ec2-stop-1"
                                    )
                                );
                            }}
                        );
                    }}
                );
                put("StopConditions",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("source","none");
                        }}

                    )
                );
                put("RoleArn", iamRole7.getAtt("Arn"));
            }})
            .build();

        CfnResource appRunnerObservabilityConfiguration = CfnResource.Builder.create(this, "AppRunnerObservabilityConfiguration")
            .type("AWS::AppRunner::ObservabilityConfiguration")
            .properties(new HashMap<String, Object>() {{

                put("ObservabilityConfigurationName", "DefaultConfiguration");
                put("TraceConfiguration",
                    new HashMap<String, Object>() {{
                        put("Vendor","AWSXRAY");
                    }}
                );
            }})
            .build();

        CfnResource memoryDbUser = CfnResource.Builder.create(this, "MemoryDBUser")
            .type("AWS::MemoryDB::User")
            .properties(new HashMap<String, Object>() {{

                put("UserName", "default");
                put("AccessString", "on ~* &* +@all");
                put("AuthenticationMode", "no-password");
            }})
            .build();

        CfnResource memoryDbacl = CfnResource.Builder.create(this, "MemoryDBACL")
            .type("AWS::MemoryDB::ACL")
            .properties(new HashMap<String, Object>() {{

                put("ACLName", "open-access");
                put("UserNames",
                    Arrays.asList(
                        "default"
                    )
                );
            }})
            .build();

        CfnResource memoryDbParameterGroup = CfnResource.Builder.create(this, "MemoryDBParameterGroup")
            .type("AWS::MemoryDB::ParameterGroup")
            .properties(new HashMap<String, Object>() {{

                put("Description", "Default parameter group for memorydb_redis6");
                put("Family", "memorydb_redis6");
                put("Parameters",
                    Arrays.asList(

                        new HashMap<String, Object>() {{
                            put("Name","acllog-max-len");
                            put("Value","128");
                            put("Description","The maximum length of the ACL Log");
                            put("DataType","integer");
                            put("AllowedValues","1-10000");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","activedefrag");
                            put("Value","no");
                            put("Description","Enabled active memory defragmentation");
                            put("DataType","string");
                            put("AllowedValues","yes,no");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","active-defrag-cycle-max");
                            put("Value","75");
                            put("Description","Maximal effort for defrag in CPU percentage");
                            put("DataType","integer");
                            put("AllowedValues","1-75");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","active-defrag-cycle-min");
                            put("Value","5");
                            put("Description","Minimal effort for defrag in CPU percentage");
                            put("DataType","integer");
                            put("AllowedValues","1-75");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","active-defrag-ignore-bytes");
                            put("Value","104857600");
                            put("Description","Minimum amount of fragmentation waste to start active defrag");
                            put("DataType","integer");
                            put("AllowedValues","1048576-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","active-defrag-max-scan-fields");
                            put("Value","1000");
                            put("Description","Maximum number of set/hash/zset/list fields that will be processed from the main dictionary scan");
                            put("DataType","integer");
                            put("AllowedValues","1-1000000");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","active-defrag-threshold-lower");
                            put("Value","10");
                            put("Description","Minimum percentage of fragmentation to start active defrag");
                            put("DataType","integer");
                            put("AllowedValues","1-100");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","active-defrag-threshold-upper");
                            put("Value","100");
                            put("Description","Maximum percentage of fragmentation at which we use maximum effort");
                            put("DataType","integer");
                            put("AllowedValues","1-100");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","active-expire-effort");
                            put("Value","1");
                            put("Description","The amount of effort that redis uses to expire items in the active expiration job");
                            put("DataType","integer");
                            put("AllowedValues","1-10");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","activerehashing");
                            put("Value","yes");
                            put("Description","Apply rehashing or not");
                            put("DataType","string");
                            put("AllowedValues","yes,no");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","client-output-buffer-limit-normal-hard-limit");
                            put("Value","0");
                            put("Description","Normal client output buffer hard limit in bytes");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","client-output-buffer-limit-normal-soft-limit");
                            put("Value","0");
                            put("Description","Normal client output buffer soft limit in bytes");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","client-output-buffer-limit-normal-soft-seconds");
                            put("Value","0");
                            put("Description","Normal client output buffer soft limit in seconds");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","client-output-buffer-limit-pubsub-hard-limit");
                            put("Value","33554432");
                            put("Description","Pubsub client output buffer hard limit in bytes");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","client-output-buffer-limit-pubsub-soft-limit");
                            put("Value","8388608");
                            put("Description","Pubsub client output buffer soft limit in bytes");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","client-output-buffer-limit-pubsub-soft-seconds");
                            put("Value","60");
                            put("Description","Pubsub client output buffer soft limit in seconds");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","hash-max-ziplist-entries");
                            put("Value","512");
                            put("Description","The maximum number of hash entries in order for the dataset to be compressed");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","hash-max-ziplist-value");
                            put("Value","64");
                            put("Description","The threshold of biggest hash entries in order for the dataset to be compressed");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","hll-sparse-max-bytes");
                            put("Value","3000");
                            put("Description","HyperLogLog sparse representation bytes limit");
                            put("DataType","integer");
                            put("AllowedValues","1-16000");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","lazyfree-lazy-eviction");
                            put("Value","no");
                            put("Description","Perform an asynchronous delete on evictions");
                            put("DataType","string");
                            put("AllowedValues","yes,no");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","lazyfree-lazy-expire");
                            put("Value","no");
                            put("Description","Perform an asynchronous delete on expired keys");
                            put("DataType","string");
                            put("AllowedValues","yes,no");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","lazyfree-lazy-server-del");
                            put("Value","no");
                            put("Description","Perform an asynchronous delete on key updates");
                            put("DataType","string");
                            put("AllowedValues","yes,no");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","lazyfree-lazy-user-del");
                            put("Value","no");
                            put("Description","Specifies whether the default behavior of DEL command acts the same as UNLINK");
                            put("DataType","string");
                            put("AllowedValues","yes,no");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","lfu-decay-time");
                            put("Value","1");
                            put("Description","The amount of time in minutes to decrement the key counter for LFU eviction policyd");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","lfu-log-factor");
                            put("Value","10");
                            put("Description","The log factor for incrementing key counter for LFU eviction policy");
                            put("DataType","integer");
                            put("AllowedValues","1-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","list-compress-depth");
                            put("Value","0");
                            put("Description","Number of quicklist ziplist nodes from each side of the list to exclude from compression. The head and tail of the list are always uncompressed for fast push/pop operations");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","maxmemory-policy");
                            put("Value","noeviction");
                            put("Description","Max memory policy");
                            put("DataType","string");
                            put("AllowedValues","volatile-lru,allkeys-lru,volatile-lfu,allkeys-lfu,volatile-random,allkeys-random,volatile-ttl,noeviction");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","maxmemory-samples");
                            put("Value","3");
                            put("Description","Max memory samples");
                            put("DataType","integer");
                            put("AllowedValues","1-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","notify-keyspace-events");
                            put("Description","The keyspace events for Redis to notify Pub/Sub clients about. By default all notifications are disabled");
                            put("DataType","string");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","set-max-intset-entries");
                            put("Value","512");
                            put("Description","The limit in the size of the set in order for the dataset to be compressed");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","slowlog-log-slower-than");
                            put("Value","10000");
                            put("Description","The execution time, in microseconds, to exceed in order for the command to get logged. Note that a negative number disables the slow log, while a value of zero forces the logging of every command");
                            put("DataType","integer");
                            put("AllowedValues","-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","slowlog-max-len");
                            put("Value","128");
                            put("Description","The length of the slow log. There is no limit to this length. Just be aware that it will consume memory. You can reclaim memory used by the slow log with SLOWLOG RESET.");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","stream-node-max-bytes");
                            put("Value","4096");
                            put("Description","The maximum size of a single node in a stream in bytes");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","stream-node-max-entries");
                            put("Value","100");
                            put("Description","The maximum number of items a single node in a stream can contain");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","tcp-keepalive");
                            put("Value","300");
                            put("Description","If non-zero, send ACKs every given number of seconds");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","timeout");
                            put("Value","0");
                            put("Description","Close connection if client is idle for a given number of seconds, or never if 0");
                            put("DataType","integer");
                            put("AllowedValues","0,20-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","tracking-table-max-keys");
                            put("Value","1000000");
                            put("Description","The maximum number of keys allowed for the tracking table for client side caching");
                            put("DataType","integer");
                            put("AllowedValues","1-100000000");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","zset-max-ziplist-entries");
                            put("Value","128");
                            put("Description","The maximum number of sorted set entries in order for the dataset to be compressed");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}
                        ,

                        new HashMap<String, Object>() {{
                            put("Name","zset-max-ziplist-value");
                            put("Value","64");
                            put("Description","The threshold of biggest sorted set entries in order for the dataset to be compressed");
                            put("DataType","integer");
                            put("AllowedValues","0-");
                            put("MinimumEngineVersion","6.2.4");
                        }}

                    )
                );
            }})
            .build();
    }
}        
