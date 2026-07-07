variable "vpc_cidr" {
  type        = string
  description = "The primary IPv4 CIDR block for the entire VPC network."
}

variable "public_subnet_cidr" {
  type        = string
  description = "The CIDR block for the public edge subnet."
}

variable "private_subnet_cidr" {
  type        = string
  description = "The CIDR block for the isolated backend private subnet."
}

variable "availability_zone" {
  type        = string
  description = "The specific AWS Availability Zone to launch the subnets inside."
}

variable "environment" {
  type        = string
  description = "The environment name tag (e.g., dev, prod)."
}