output "vpc_id" {
  value       = aws_vpc.main.id
  description = "The generated tracking ID of the primary VPC container."
}

output "public_subnet_id" {
  value       = aws_subnet.public.id
  description = "The tracking ID for the public-facing subnet."
}

output "private_subnet_id" {
  value       = aws_subnet.private.id
  description = "The tracking ID for the isolated backend subnet."
}